package com.matt.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.io.*;

@Controller
public class HelloController {
    StringBuilder API;



    @GetMapping("/hello")
    public String sayHello(
            @RequestParam(value = "name", required = false,
                    defaultValue = "Everyone"  ) String name, Model model) {
        model.addAttribute("user", name);
        return "hello";
    }

    @RestController
    public class ApiController {

        @GetMapping("/api")

        public String sayA() {
            return "AAAAAAAA";
        }
    }

}