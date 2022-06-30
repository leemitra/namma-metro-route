package com.namma.metro.controller;

import java.io.FileNotFoundException;
import java.util.List;

import javax.websocket.server.PathParam;

import com.namma.metro.route.model.MetroStation;
import com.namma.metro.route.service.RouteService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class RouteController{

    @Autowired
    private RestTemplate template;

    @Autowired
    private RouteService routeService;

    @GetMapping("/route")
    public List<MetroStation> getRoutes() throws FileNotFoundException{
        return routeService.getRouteName();
    }

    @GetMapping("/gender/{gender}")
    public ResponseEntity<String> getGender(@PathVariable String gender) {
        return template.getForEntity("https://api.genderize.io/?name=" + gender, String.class);

    }

}