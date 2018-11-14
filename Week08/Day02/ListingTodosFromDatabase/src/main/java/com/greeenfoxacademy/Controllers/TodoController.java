package com.greeenfoxacademy.Controllers;

import com.greeenfoxacademy.Model.Todo;
import com.greeenfoxacademy.Repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

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

    public TodoController () {
       todoList = new ArrayList<>();
    }

    @GetMapping (value = "/")
    public String emptyLinkValue(Model model){
        model.addAttribute( "todos", todoRepository.findAll() );
    return "TodoList";
    }

    @GetMapping ("/list")
    public String listLinkValue(){
    return "TodoList";
    }
}
