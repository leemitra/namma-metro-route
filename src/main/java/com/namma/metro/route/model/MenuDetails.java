/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.namma.metro.route.model;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 *
 * @author mtech
 */
@Data
@AllArgsConstructor
public class MenuDetails {
    
    private Integer id;
    private String foodName;
    private Integer price;
    private String category;
    private String foodType;
}
