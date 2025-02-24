package com.greetingApp.service;

import com.greetingApp.model.Greeting;
import com.greetingApp.repository.GreetingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class GreetingService implements IGreetingService {

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

    // logic to store message in jpa
    @Autowired
    GreetingRepository greetingRepository;
    @Override
    public Greeting addGreeting(String message) {
        Greeting greeting = new Greeting(message);
        return greetingRepository.save(greeting);
    }

}
