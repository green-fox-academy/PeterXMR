package com.greeenfoxacademy;

import com.greeenfoxacademy.Model.Todo;
import com.greeenfoxacademy.Repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;


@SpringBootApplication
public class Main implements CommandLineRunner {


    @Autowired
    TodoRepository todoRepository;

    public static void main(String [] args) {
        SpringApplication.run(Main.class,args );
    }

    /**
     * Callback used to run the bean.
     *
     * @param args incoming main method arguments
     * @throws Exception on error
     */
    @Override
    public void run(String... args) throws Exception {
    todoRepository.save  (new Todo("I have to learn Object Relational Mapping"));
    }
}
