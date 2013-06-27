package com.apress.prospring3.ch2;

/**
 * User: DarthVictor
 * Date: 11.06.13
 * Time: 1:54
 */
public class StandartOutMessageRenderer implements MessageRenderer
{
    private MessageProvider messageProvider = null;


    @Override
    public void render() {
        if (messageProvider == null)
            throw new RuntimeException(
                "You must set the property messageProvider of class" +
                StandartOutMessageRenderer.class.getName()
            );
        System.out.println(messageProvider.getMessage());
    }

    @Override
    public void setMessageProvider(MessageProvider provider) {
        this.messageProvider = provider;
    }

    @Override
    public MessageProvider getMessageProvider() {
        return this.messageProvider;
    }
}
