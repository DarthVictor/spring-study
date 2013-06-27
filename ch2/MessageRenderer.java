package com.apress.prospring3.ch2;

/**
 * User: DarthVictor
 * Date: 11.06.13
 * Time: 0:32
 */
public interface MessageRenderer
{
    public void render();
    public void setMessageProvider(MessageProvider provider);
    public MessageProvider getMessageProvider();

}
