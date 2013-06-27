package com.apress.prospring3.ch2;

/**
 * User: DarthVictor
 * Date: 11.06.13
 * Time: 1:51
 */
public class HelloWorldMessageProvider implements MessageProvider
{
    @Override
    public String getMessage() {
        return "Hello World";
    }
}
