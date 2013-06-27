package com.apress.prospring3.ch2;

/**
 * User: DarthVictor
 * Date: 16.06.13
 * Time: 0:10
 */
public class HelloWorldDecoupledWithFactory
{
    public static void main(String[] args)
    {
        MessageRenderer mr = MessageSupportFactory.getInstance().getRenderer();
        MessageProvider mp = MessageSupportFactory.getInstance().getProvider();
        mr.setMessageProvider(mp);
        mr.render();
    }
}
