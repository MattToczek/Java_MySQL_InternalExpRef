package com.matt.demo.controllers;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.stereotype.Controller;

@Controller
public class ApiController {

    @GetMapping("/api")
    public String sayA(
            @RequestParam(value = "api", required = false,
                    defaultValue = "Not Found"  ) String name, Model model) {
        model.addAttribute("API", name);
        return "api";
    }

}

