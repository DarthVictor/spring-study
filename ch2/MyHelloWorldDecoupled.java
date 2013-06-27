package com.apress.prospring3.ch2;

import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * User: DarthVictor
 * Date: 12.06.13
 * Time: 2:04
 */
public class MyHelloWorldDecoupled
{
    public static void main(String[] args)
    {
        MessageRenderer mr = new HtmlOutMessageRenderer();
        FileMessageProvider mp = new FileMessageProvider();
        mp.setFileName("Spring3HomeWork/src/com/apress/prospring3/ch2/file.txt");
        mr.setMessageProvider(mp);
        mr.render();

    }
}
