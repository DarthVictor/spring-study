package com.apress.prospring3.ch2;

/**
 * User: DarthVictor
 * Date: 11.06.13
 * Time: 2:14
 */
public class HelloWorldDecoupled
{
    public static void main(String[] args)
    {
        MessageRenderer mr = new StandartOutMessageRenderer();
        MessageProvider mp = new HelloWorldMessageProvider();
        mr.setMessageProvider(mp);
        mr.render();
    }
}
