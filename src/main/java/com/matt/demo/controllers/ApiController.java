package com.matt.demo.controllers;

import com.matt.demo.Data;
import com.matt.demo.People;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.stereotype.Controller;

import java.util.ArrayList;

@Controller
public class ApiController {

//    ArrayList<People> hello = new ArrayList<People>();



    @GetMapping("/api")
    public String sayA(){
//    public ArrayList<People> sayA(){

        ArrayList<People> hello = new Data().getApi();
//        System.out.println(hello.toString());
        return hello.toString();
    }

}

