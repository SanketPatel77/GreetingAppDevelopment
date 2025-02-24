package com.greetingApp.service;

import org.springframework.stereotype.Service;

@Service
public class GreetingService {
    // method to print Hello world
    public String helloMessage(){
        return "Hello world";
    }

    public String greetingWithName(String firstName, String lastName){
        if(firstName != null && lastName != null){
            return "Hello world from "+firstName+" "+lastName;
        }
        if(firstName != null){
            return "Hello world from "+firstName;
        }
        if(lastName != null){
            return "Hello world form "+lastName;
        }
        return "Hello world";
    }
}
