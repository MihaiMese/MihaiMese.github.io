package io.github.mihaimese.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomePage {

    @GetMapping("/hello")
    public String hello() {
        return "Hello!";
    }
}
