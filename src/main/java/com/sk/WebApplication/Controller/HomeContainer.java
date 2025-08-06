package com.sk.WebApplication.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeContainer {

    @RequestMapping("/")
    public String display()
    {
        return "Welcome Home!!..";
    }
}
