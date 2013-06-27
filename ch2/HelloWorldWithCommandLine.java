package com.apress.prospring3.ch2;

/**
 * User: DarthVictor
 * Date: 11.06.13
 * Time: 0:27
 */
public class HelloWorldWithCommandLine
{
    public static void main (String[] argc)
    {
        if(argc.length > 0)
        {
            System.out.println(argc[0]);
        }
        else
        {
            System.out.println("Hello World");
        }
    }
}
