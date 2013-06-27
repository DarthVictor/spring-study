package com.apress.prospring3.ch2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

/**
 * User: DarthVictor
 * Date: 15.06.13
 * Time: 23:25
 */
public class MessageSupportFactory
{
    private static MessageSupportFactory instance = null;
    private Properties properties = null;
    private MessageRenderer renderer = null;
    private MessageProvider provider = null;

    private  MessageSupportFactory()
    {
        properties = new Properties();
        try
        {
            properties.load(new FileInputStream(
                    "Spring3HomeWork/src/com/apress/prospring3/ch2/msf.properties"));
            String rendererClass = properties.getProperty("renderer.class");
            String providerClass = properties.getProperty("provider.class");
            renderer = (MessageRenderer)Class.forName(rendererClass).newInstance();
            provider = (MessageProvider)Class.forName(providerClass).newInstance();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
    static
    {
        instance = new MessageSupportFactory();
    }

    public static MessageSupportFactory getInstance() {
        return instance;
    }

    public MessageProvider getProvider() {
        return provider;
    }

    public MessageRenderer getRenderer() {
        return renderer;
    }
}
