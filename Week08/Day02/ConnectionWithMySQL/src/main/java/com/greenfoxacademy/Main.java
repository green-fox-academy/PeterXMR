package com.greenfoxacademy;

import com.greenfoxacademy.model.Client;
import com.greenfoxacademy.repository.TodoClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.password.PasswordEncoder;

@SpringBootApplication
public class Main implements CommandLineRunner {

    @Autowired
    TodoClientRepository todoClientRepository;
    @Autowired
    PasswordEncoder encoder;

    public static void main(String[] args) {

        SpringApplication.run(Main.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        todoClientRepository.save(new Client("Peter", encoder.encode("verySecurePassword")));
    }
}
