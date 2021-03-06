package com.apress.prospring3.ch4.annotation;

import com.apress.prospring3.ch4.MessageProvider;
import com.apress.prospring3.ch4.MessageRenderer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("messageRenderer")
public class StandardOutMessageRenderer implements MessageRenderer
{

    private MessageProvider messageProvider = null;

    @Override
	public void render() {
        if (messageProvider == null) {
            throw new RuntimeException(
                    "You must set the property messageProvider of class:"
                            + StandardOutMessageRenderer.class.getName());
        }

        System.out.println(messageProvider.getMessage());	
	}

    @Override
    @Autowired
	public void setMessageProvider(MessageProvider provider) {
        this.messageProvider = provider;		
	}

    @Override
	public MessageProvider getMessageProvider() {
        return this.messageProvider;
	}

}