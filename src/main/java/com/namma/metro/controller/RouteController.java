package com.namma.metro.controller;

import java.io.FileNotFoundException;
import java.util.List;

import com.namma.metro.route.model.MetroStation;
import com.namma.metro.route.service.RouteService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RouteController{

    @Autowired
    private RouteService routeService;

    @GetMapping("/route")
    public List<MetroStation> getRoutes() throws FileNotFoundException{
        return routeService.getRouteName();
    }
}