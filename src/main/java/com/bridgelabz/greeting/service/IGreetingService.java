package com.bridgelabz.greeting.service;

import com.bridgelabz.greeting.dto.UserDto;
import com.bridgelabz.greeting.model.Greeting;

public interface IGreetingService {

	public Greeting greetingMessage();

	public String greetingMessageByName(UserDto userDto);

	public Greeting findById(long parseLong);

}
