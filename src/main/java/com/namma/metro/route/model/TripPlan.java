package com.namma.metro.route.model;

import java.util.List;

import lombok.Data;

@Data
public class TripPlan {
    private String error;
	private List<String> summary;
	private List<String> step;
}
