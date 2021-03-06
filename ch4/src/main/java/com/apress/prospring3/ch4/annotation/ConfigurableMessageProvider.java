package com.apress.prospring3.ch4.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.apress.prospring3.ch4.MessageProvider;

@Service("messageProvider")
public class ConfigurableMessageProvider implements MessageProvider {

	private String message;
	
	
	@Autowired
	public ConfigurableMessageProvider(@Value("This is a configurable message") String message)
	{
		this.message = message;
	}
	
	@Override
	public String getMessage() 
	{
		return message;
	}

}
