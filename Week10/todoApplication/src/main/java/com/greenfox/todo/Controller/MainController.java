package com.greenfox.todo.Controller;


import com.greenfox.todo.Repository.MessageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MainController {

    @Autowired
    MessageRepository messageRepository;

    @GetMapping(value = "/")
    public String showMessagelist(Model model) {
        model.addAttribute( "messages", messageRepository.findAll() );
        return "messagelist";
    }

    @GetMapping (value = "/login")
    public String showLogin() {
        return "login";
    }

    @PostMapping (value = "/logging")
    public String loginUser() {
        return "messagelist";
    }
}
