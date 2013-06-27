package com.apress.prospring3.ch2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
/**
 * User: DarthVictor
 * Date: 16.06.13
 * Time: 1:18
 */
public class HelloWorldSpringDI
{
    public static void main(String[] args)
    {
    	
        ApplicationContext ctx = new ClassPathXmlApplicationContext
                ("META-INF/spring/app-context.xml");
        MessageRenderer mr = ctx.getBean("renderer", MessageRenderer.class);
        mr.render();
    }
}
