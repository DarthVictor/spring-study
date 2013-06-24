package com.apress.prospring3.ch4.xml;

import org.springframework.context.support.GenericXmlApplicationContext;

public class InjectSimple 
{

    private String name;
    private int age;
    private float height;
    private boolean programmer;
    private Long ageInSeconds;

    public static void main(String[] args)
    {
        GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
        ctx.load("classpath:app-context-xml.xml");
        ctx.refresh();
        
        InjectSimple simple
    }

}
