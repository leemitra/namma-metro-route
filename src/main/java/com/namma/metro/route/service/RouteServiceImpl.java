package com.namma.metro.route.service;

import com.namma.metro.route.model.TripPlan;

import org.springframework.stereotype.Service;

import lombok.extern.log4j.Log4j;

@Service
@Log4j
public class RouteServiceImpl implements RouteService {

    @Override
    public String getRouteName() {
        return "RouteName";
    }
    
}
