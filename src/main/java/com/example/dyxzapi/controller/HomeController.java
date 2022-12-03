package com.example.dyxzapi.controller;

import org.springframework.stereotype.Controller;

@Controller
public class HomeController {
    public String Home(){
        return "index.html";
    }
}
