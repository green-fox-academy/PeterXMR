package com.greenfox;

import com.greenfox.controllers.MyColor;
import com.greenfox.controllers.Printer;
import com.greenfox.controllers.RedColor;
import com.greenfox.controllers.UtilityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class HelloBeanWorldApplication implements CommandLineRunner {

    @Autowired
    Printer printer;

    @Autowired
    UtilityService utilityService;

    @Qualifier("redColor")
    @Autowired
    MyColor myColor;

    public static void main(String[] args) {
        SpringApplication.run( HelloBeanWorldApplication.class, args );
    }

    @Override
    public void run (String[] args) throws Exception {
        printer.log( "Hello" );
        myColor.printColor();
    }
}