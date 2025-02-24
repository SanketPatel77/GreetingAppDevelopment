package com.greetingApp.service;

import com.greetingApp.model.Greeting;

// interface that defines method to  override in service
public interface IGreetingService {
    Greeting addGreeting(String message);
    Greeting getMessageByID(long Id);
}
