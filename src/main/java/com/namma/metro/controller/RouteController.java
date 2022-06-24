package com.namma.metro.controller;

import com.namma.metro.route.service.RouteService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RouteController{

    @Autowired
    private RouteService routeService;

    @GetMapping("/route")
    public String getRoutes(){
        return routeService.getRouteName();
    }
}