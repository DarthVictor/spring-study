package com.apress.prospring3.ch4.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
// Codes omitted

@Service("constructorConfusion")
public class ConstructorConfusion
{

    private String someValue;
    
    public ConstructorConfusion(String someValue)
    {
        System.out.println("ConstructorConfusion(String) called");
        this.someValue = someValue;
    }
    
    @Autowired
    public ConstructorConfusion(@Value("90") int someValue) {
        System.out.println("ConstructorConfusion(int) called");
        this.someValue = "Number: " + Integer.toString(someValue);
    }

// Codes omitted
}
