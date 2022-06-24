package com.namma.metro.route.utils;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.List;

import javax.annotation.PostConstruct;

import com.namma.metro.route.model.MetroStation;
import com.opencsv.bean.CsvToBeanBuilder;

import org.springframework.stereotype.Component;
import org.springframework.util.ResourceUtils;

@Component
public class MetroRouteUtils {
    
    @PostConstruct
    public List<MetroStation> readMetroStations() throws IllegalStateException, FileNotFoundException{
        File file = ResourceUtils.getFile("classpath:stops-list-Purple-Line.csv");
        List<MetroStation> stations= new CsvToBeanBuilder(new FileReader(file))
        .withType(MetroStation.class)
        .build()
        .parse();
        return stations;
    }
}
