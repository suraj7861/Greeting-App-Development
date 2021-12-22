package com.bridgelabz.greeting.service;

import java.util.List;

import com.bridgelabz.greeting.dto.UserDto;
import com.bridgelabz.greeting.model.Greeting;

public interface IGreetingService {

	public String greetingMessageByName(UserDto userDto);

	/**
	 * Method: Save in Repository
	 */
	public Greeting greetingMessage();

	/**
	 * Method: Find Message by Id from Repository
	 */
	public Greeting findById(long id);

	/**
	 * Method: List All Messages from Repository
	 */
	public List<Greeting> getAllMessages();

	/**
	 * Method: edit message from repository
	 */
	public Greeting editMessage(Greeting greeting);

	/**
	 * Method: delete message from repository
	 */
	public Greeting deleteMessage(long id);

}
