package com.greenfox.todo.Controller;

import com.greenfox.todo.Repository.MessageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageRestController {

    @Autowired
    MessageRepository messageRepository;
}
