package com.greenfox.Controllers;

import com.greenfox.Model.AppendA;
import com.greenfox.Model.DoUntil;
import com.greenfox.Model.Greeter;
import com.greenfox.Model.Number;
import org.springframework.web.bind.annotation.*;

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
    public Object appenda (@PathVariable(value = "appendable")String appendable){
        return new AppendA (appendable);
    }

    @PostMapping("/dountil/{action}")
    public Object dountil (@PathVariable ("action")String action, @RequestBody(required = false) Number until) {
        return new DoUntil( action, until );
    }
}
