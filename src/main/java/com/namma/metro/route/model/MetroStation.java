package com.namma.metro.route.model;

import java.util.Date;

import com.opencsv.bean.CsvBindByName;
import com.opencsv.bean.CsvDate;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
public class MetroStation {
    @CsvBindByName(column="Sl No")
    private String slNo;
    @CsvBindByName(column="Stop Name")
    private String stopName;
    
    @CsvBindByName(column="Opening Date")
    @CsvDate("dd-MMM-yy")
    private Date openingDate;
    @CsvBindByName(column="Station Name")
    private String stationName;
}
