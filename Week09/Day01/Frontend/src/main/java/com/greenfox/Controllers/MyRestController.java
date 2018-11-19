package com.greenfox.Controllers;

import com.greenfox.Model.AppendA;
import com.greenfox.Model.Greeter;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;


@RestController
public class MyRestController {

    @GetMapping("/doubling")
    public Object doubling (@RequestParam(required = false)Integer input, String error) {

        error = "Please provide an input!";
        if (input != null) {
            int result;
            result = 2 * input;
            HashMap<String, Object> hashMapDoubling = new HashMap<>();

            hashMapDoubling.put( "received", input );
            hashMapDoubling.put( "result", result );

            return hashMapDoubling;
        } else
        return error;
    }


    @GetMapping("/greeter")
    public Object greeter(@RequestParam(value = "name", required = false) String name, @RequestParam(value = "title", required = false) String title) {
        return new Greeter(name, title);
    }

    @GetMapping("/appenda/{appendable}")
    public Object appenda (@RequestParam(value = "appenda")String appenda){
        return ;
    }
}
