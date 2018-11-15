package com.greenfoxacademy.controllers;

import com.greenfoxacademy.model.Todo;
import com.greenfoxacademy.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
public class TodoController {

    List<Todo> todoList;

    @Autowired
    TodoRepository todoRepository;

    public TodoController() {
        todoList = new ArrayList<>();
    }

    @GetMapping(value = "/")
    public String orderById(Model model) {
        model.addAttribute( "todos", todoRepository.findAll() );
        return "TodoList";
    }

    @GetMapping(value = "/sortByTitle")
    public String orderByTitle(Model model) {
        model.addAttribute( "todos", todoRepository.findAllByOrderByTitleAsc() );
        return "TodoList";
    }

    @GetMapping(value = "/findByDoneIsTrue")
    public String findByDoneIsTrue(Model model) {
        model.addAttribute( "todos", todoRepository.findByDoneIsTrue() );
        return "TodoList";
    }

    @GetMapping(value = "/findByDoneIsFalse")
    public String findByDoneIsFalse(Model model) {
        model.addAttribute( "todos", todoRepository.findByDoneIsFalse() );
        return "TodoList";
    }

    @GetMapping(value = "/findByUrgentIsTrue")
    public String findByUrgentIsTrue(Model model) {
        model.addAttribute( "todos", todoRepository.findByUrgentIsTrue() );
        return "TodoList";
    }

    @GetMapping(value = "/findByUrgentIsFalse")
    public String findByUrgentIsFalse(Model model) {
        model.addAttribute( "todos", todoRepository.findByUrgentIsFalse() );
        return "TodoList";
    }


    @GetMapping(value = "/sortById")
    public String sortById(Model model) {
        model.addAttribute( "todos", todoRepository.findAllByOrderByIdAsc() );
        return "TodoList";
    }

    @PostMapping(value = "/findByTitleContaining")
    public String findByTitleContaining(Model model, String keyword) {
        model.addAttribute( "todos", todoRepository.findByTitleContaining( keyword ) );
        return "Todolist";
    }

    @GetMapping("/todo/add")
    public String addForm() {
        return "add";
    }

    @PostMapping("/todo/add")
    public String addTask(String title) {
        todoRepository.save( new Todo( title ) );
        return "redirect:/";
    }

    @PostMapping(value = "/{id}/delete")
    public String delete(@PathVariable("id") Long id) {
        todoRepository.deleteById( id );
        return "redirect:/";
    }

    @GetMapping("/{id}/edit")
    public String editTask(@PathVariable() Long id, Model model) {
        model.addAttribute( "task", todoRepository.findById( id ).get() );
        return "edit";
    }

    @PostMapping("/{id}/edit")
    public String editTasks(@PathVariable() Long id, String title, @RequestParam(defaultValue = "false") Boolean done, @RequestParam(defaultValue = "false") Boolean urgent) {
        Todo upgradedTodo = todoRepository.findById( id ).get();
        upgradedTodo.setTitle( title );
        upgradedTodo.setDone( done );
        upgradedTodo.setUrgent( urgent );
        todoRepository.save( upgradedTodo );
        return "redirect:/";
    }
}