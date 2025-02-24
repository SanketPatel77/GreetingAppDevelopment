package com.greetingApp.service;

import org.springframework.stereotype.Service;

@Service
public class GreetingService {
    // method to print Hello world
    public String helloMessage(){
        return "Hello world";
    }
}
