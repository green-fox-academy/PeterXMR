package com.greenfoxacademy.controllers;

import com.greenfoxacademy.model.Todo;
import com.greenfoxacademy.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@Controller
public class TodoController {

    List<Todo> todoList;

    @Autowired
    TodoRepository todoRepository;

    public List<Todo> getTodoList() {
        return todoList;
    }

    public TodoController() {
        todoList = new ArrayList<>();
    }

    @GetMapping(value = "/")
    public String emptyLinkValue(Model model) {
        model.addAttribute( "todos", todoRepository.findAll() );
        return "TodoList";
    }

    @GetMapping("/todo/add")
    public String addForm(Model model) {
        return "add";
    }

    @PostMapping("/todo/add")
    public String addTask(String title) {
        todoRepository.save( new Todo( title ) );
        return "redirect:/";
    }

    @PostMapping(value = "/{id}/delete")
    public String delete(@PathVariable("id") Long id) {
        todoRepository.deleteById(id);
        return "redirect:/";
    }

    @GetMapping("/{id}/edit")
    public String editTask(@PathVariable() Long id,Model model) {
        model.addAttribute( "task", todoRepository.findById( id ).get());
        return "edit";
    }

    @PostMapping("/{id}/edit")
    public String editTasks(@PathVariable() Long id, String title, @RequestParam(defaultValue = "false") Boolean done ,@RequestParam(defaultValue = "false")  Boolean urgent) {
        Todo upgradedTodo = todoRepository.findById( id ).get();
        upgradedTodo.setTitle( title );
        upgradedTodo.setDone( done );
        upgradedTodo.setUrgent( urgent );
        todoRepository.save(upgradedTodo);
        return "redirect:/";
    }
}
