package onisino.eatoncampus.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloController {

    @GetMapping("/world")
    public String helloWorld() {
        return "Hello World";
    }
    
    @GetMapping("/fuck")
    public String fuck(){
        return "Fuck U!";
    }

    @GetMapping("/test")
    public String test(){
        return "Test";
    }
}
