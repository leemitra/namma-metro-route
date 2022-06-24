package com.namma.metro.route.service;

import com.namma.metro.route.model.TripPlan;

import org.springframework.stereotype.Service;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class RouteServiceImpl implements RouteService {

    @Override
    public String getRouteName() {
        log.info("Route name is ");        
        return "RouteName";
    }
    
}
