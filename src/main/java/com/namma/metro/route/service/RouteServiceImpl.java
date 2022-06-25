package com.namma.metro.route.service;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.List;

import com.namma.metro.route.model.MetroStation;
import com.opencsv.bean.CsvToBeanBuilder;

import org.springframework.stereotype.Service;
import org.springframework.util.ResourceUtils;
/**
 * @author Arjun Metre
 * 
 */
@Service
public class RouteServiceImpl implements RouteService {

    @Override
    public List<MetroStation> getRouteName() throws FileNotFoundException {
            File file = ResourceUtils.getFile("classpath:stops-list-Purple-Line.csv");
            List<MetroStation> stations= new CsvToBeanBuilder<MetroStation>(new FileReader(file))
            .withIgnoreLeadingWhiteSpace(true)
            .withType(MetroStation.class)
            .build()
            .parse();
            return stations;
    }
    
}
