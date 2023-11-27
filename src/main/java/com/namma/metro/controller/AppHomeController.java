package com.namma.metro.controller;

import com.namma.metro.route.model.MenuDetails;
import com.namma.metro.route.model.Person;
import java.util.ArrayList;
import java.util.List;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
@Slf4j
public class AppHomeController {

    @GetMapping("/")
    public ModelAndView getHome() {
        ModelAndView model =new ModelAndView("home");
        log.info("hello");
        model.addObject("name", "Arjun");
        return model;
    }
    
    @GetMapping("/persons/all")
    @ResponseBody
    public List<MenuDetails> getHelloPage(){
         
        List<MenuDetails> list=new ArrayList<MenuDetails>();
        MenuDetails m1=new MenuDetails(1, "Paratha", 500, "Veg", "Main course");
        list.add(m1);
        
        List<Person> persons=new ArrayList<>();
        Person p=new Person(10, "D", "T", 8);
        Person p1=new Person(66, "S", "Q", 1);
        Person p2=new Person(6, "A", "E", 9);
        Person p3=new Person(22, "F", "Y", 25);
        Person p4=new Person(96, "C", "R", 12);
        Person p5=new Person(22, "V", "E", 15);
        Person p6=new Person(85, "Q", "F", 7);
        Person p7=new Person(55, "A", "A", 99);


        persons.add(p);
        persons.add(p1);
        persons.add(p2);
        persons.add(p3);
        persons.add(p4);
        persons.add(p5);
        persons.add(p6);
        persons.add(p7);
        persons.add(p2);
        persons.add(p2);
        return list;
    }
}
