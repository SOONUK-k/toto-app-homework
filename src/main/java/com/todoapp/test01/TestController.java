package com.todoapp.test01;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


//merge 충돌테스트2
@RestController
public class TestController {

    @GetMapping("/")
    public String helloWorld() {
        return "To-do Application !";
    }
}
