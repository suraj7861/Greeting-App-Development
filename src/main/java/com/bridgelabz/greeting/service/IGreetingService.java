package com.bridgelabz.greeting.service;

import com.bridgelabz.greeting.dto.UserDto;
import com.bridgelabz.greeting.model.Greeting;
import com.bridgelabz.greeting.model.User;

public interface IGreetingService {

	public Greeting greetingMessage();

	public String greetingMessageByName(UserDto userDto);

}
