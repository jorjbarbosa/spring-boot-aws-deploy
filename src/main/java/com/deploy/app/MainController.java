package com.deploy.app;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {
    @GetMapping("/")
    public String hello(){
        return "Hello, testing AWS deploy with Github Actions";
    }
}
