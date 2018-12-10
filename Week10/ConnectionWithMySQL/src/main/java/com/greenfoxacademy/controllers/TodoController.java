package com.greenfoxacademy.controllers;

import com.greenfoxacademy.model.Client;
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
        return "welcome";
    }

//    @GetMapping("/client/{id}")
//    public Client getClient(@PathVariable Integer id){
//        return new Client("Peter", 24);
//    }

    @GetMapping(value = "/todolist")
    public String showTodo (Model model) {
        model.addAttribute( "todos", todoRepository.findAll() );
        return "TodoList";
    }

    @       GetMapping(value = "/todo/")
    public String buttonManipulation(Model model, @RequestParam(value = "order", required = false) String order, @RequestParam(value = "find", required = false) String find) {
        if (order != null) {
            if (order.equals( "byTitle" )) {
                model.addAttribute( "todos", todoRepository.findAllByOrderByTitleAsc() );
            } else if (order.equals( "byId" )) {
                model.addAttribute( "todos", todoRepository.findAllByOrderByIdAsc() );
            }
        }

        else if (find != null) {
            if (find.equals( "byDoneIsTrue" )) {
                model.addAttribute( "todos", todoRepository.findByDoneIsTrue() );
            } else if (find.equals( "byDoneIsFalse" )) {
                model.addAttribute( "todos", todoRepository.findByDoneIsFalse() );
            } else if (find.equals( "byUrgentIsTrue" )) {
                model.addAttribute( "todos", todoRepository.findByUrgentIsTrue() );
            } else if (find.equals( "byUrgentIsFalse" )) {
                model.addAttribute( "todos", todoRepository.findByUrgentIsFalse() );
            }
        }
        return "TodoList";
    }

        @PostMapping(value = "/findByTitleContaining")
        public String findByTitleContaining (Model model, String keyword){
            model.addAttribute( "todos", todoRepository.findByTitleContaining( keyword ) );
            return "Todolist";
        }

        @GetMapping("/todo/add")
        public String addForm () {
            return "add";
        }

        @PostMapping("/todo/add")
        public String addTask (String title){
            todoRepository.save( new Todo( title ) );
            return "redirect:/todolist";
        }

        @PostMapping(value = "/{id}/delete")
        public String delete (@PathVariable("id") Long id){
            todoRepository.deleteById( id );
            return "redirect:/todolist";
        }


        @GetMapping("/{id}/edit")
    public String editTask (@PathVariable() Long id, Model model){
        model.addAttribute( "task", todoRepository.findById( id ).get() );
        return "edit";
    }

    @PostMapping("/{id}/edit")
    public String editTasks (@PathVariable() Long id, String title, @RequestParam(defaultValue = "false") Boolean
            done, @RequestParam(defaultValue = "false") Boolean urgent){
        Todo upgradedTodo = todoRepository.findById( id ).get();
        upgradedTodo.setTitle( title );
        upgradedTodo.setDone( done );
        upgradedTodo.setUrgent( urgent );
        todoRepository.save( upgradedTodo );
        return "redirect:/todolist";

    }
}