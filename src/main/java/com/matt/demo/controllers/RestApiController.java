package com.matt.demo.controllers;

import com.matt.demo.Data;
import com.matt.demo.People;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.stereotype.Controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
public class RestApiController {

//    ArrayList<People> hello = new ArrayList<People>();



    @GetMapping("/api")
//    public String sayA(){
    public List<People> sayA(){
//        return Arrays.asList(
//                new People(1, "e", "oweadhi"),
//                new People(2, "e", "oweadhi"),
//                new People(3, "e", "oweadhi")
//        );
//        People[] hello = new People[]{new People(1, "e", "oweadhi"), new People(2, "e", "oweadhi"), new People(3, "e", "oweadhi") };
        People[] hello = new Data().getApi();
//        System.out.println(hello.toString());
        return Arrays.asList(hello);
    }

}

