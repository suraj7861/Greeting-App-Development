package com.bridgelabz.greeting.service;

import com.bridgelabz.greeting.dto.UserDto;
import com.bridgelabz.greeting.model.Greeting;

public interface IGreetingService {

	public Greeting greetingMessage();
	
	String greetingMessageByName(UserDto userDto);
}
