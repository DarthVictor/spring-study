package com.apress.prospring3.ch4.annotation;

import com.apress.prospring3.ch4.MessageProvider;
import org.springframework.stereotype.Service;

public class HelloWorldMessageProvider implements MessageProvider {

	@Override
	public String getMessage() {
		return "Hello World!";
	}

}
