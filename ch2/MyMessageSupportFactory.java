package com.apress.prospring3.ch2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

/**
 * User: DarthVictor
 * Date: 16.06.13
 * Time: 1:12
 */

public class MyMessageSupportFactory
{
    private static MyMessageSupportFactory instance = null;
    private Properties properties = null;
    private MessageRenderer renderer = null;
    private MessageProvider provider = null;

    private  MyMessageSupportFactory()
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
            //(Class.forName(providerClass))provider.
            //FileMessageProvider mp = new FileMessageProvider();
            //mp.setFileName("Spring3HomeWork/src/com/apress/prospring3/ch2/file.txt");

        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
    static
    {
        instance = new MyMessageSupportFactory();
    }

    public static MyMessageSupportFactory getInstance() {
        return instance;
    }

    public MessageProvider getProvider() {
        return provider;
    }

    public MessageRenderer getRenderer() {
        return renderer;
    }
}
