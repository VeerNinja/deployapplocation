package com.cloud.aws.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/index")
public class HomeController {

    @GetMapping("/homepage")
    public String home() {
        return "index"; // Return the name of your homepage view
    }
}

