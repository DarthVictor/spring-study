package com.apress.prospring3.ch4;

import org.springframework.context.support.GenericXmlApplicationContext;

public class UsingSetterInjection 
{
	public static void main(String[] args)
	{
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
		ctx.load("classpath:app-context-annotation.xml");
		ctx.refresh();
		MessageRenderer messageRenderer = ctx.getBean("messageRenderer",
			MessageRenderer.class);
		messageRenderer.render();
	}

}
