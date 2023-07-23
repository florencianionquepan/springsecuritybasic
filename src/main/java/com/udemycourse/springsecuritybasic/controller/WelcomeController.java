package com.udemycourse.springsecuritybasic.controller;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@ComponentScan("com.udemycourse.springsecuritybasic") //Optional because this is present
//as a sub-package inside my main package
public class WelcomeController {

    @GetMapping("/welcome")
    public String sayWelcome(){
        return "Welcome to Spring Application with out Security!";
    }
}
