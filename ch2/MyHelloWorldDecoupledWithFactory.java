package com.apress.prospring3.ch2;

/**
 * User: DarthVictor
 * Date: 16.06.13
 * Time: 0:59
 */
public class MyHelloWorldDecoupledWithFactory
{
    public static void main(String[] args)
    {
        MessageRenderer mr = MessageSupportFactory.getInstance().getRenderer();
        MessageProvider mp = MessageSupportFactory.getInstance().getProvider();
        mr.setMessageProvider(mp);
        mr.render();
    }
}
