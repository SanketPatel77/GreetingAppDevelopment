package com.greetingApp.service;

import com.greetingApp.model.Greeting;

import java.util.List;

// interface that defines method to  override in service
public interface IGreetingService {
    Greeting addGreeting(String message);
    Greeting getMessageByID(long Id);
    List<Greeting> getAllMessages();
    Greeting updateMessage(long id, Greeting newMessage);
    boolean deleteMessage(long id);
}
