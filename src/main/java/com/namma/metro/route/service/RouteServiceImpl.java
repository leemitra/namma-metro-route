package com.namma.metro.route.service;

import org.springframework.stereotype.Service;

@Service
public class RouteServiceImpl implements RouteService {

    @Override
    public String getRouteName() {
        return "RouteName";
    }
    
}
