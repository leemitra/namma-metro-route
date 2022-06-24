package com.namma.metro.route.service;

import java.io.FileNotFoundException;
import java.util.List;

import com.namma.metro.route.model.MetroStation;

public interface RouteService {
    
    public List<MetroStation> getRouteName() throws FileNotFoundException;
}
