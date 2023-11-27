/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.namma.metro;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 *
 * @author mtech
 */
//@Configuration
public class WeAppConfig implements WebMvcConfigurer{
    
    
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        System.out.println("com.namma.metro.WeAppConfig.addResourceHandlers() -------");
        registry.addResourceHandler("/DataTables/**")
                .addResourceLocations("classpath:/WEB-INF/resources/DataTables/");

        registry.addResourceHandler("/lib/**")
                .addResourceLocations("classpath:/WEB-INF/resources/lib/");
    }
    
}
