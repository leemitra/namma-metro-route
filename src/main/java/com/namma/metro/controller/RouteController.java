package com.namma.metro.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RouteController{

    @GetMapping("/route")
    public String getRoutes(){
        return "N1 - N2";
    }
}