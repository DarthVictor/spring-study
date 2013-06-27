package com.apress.prospring3.ch2;

/**
 * User: DarthVictor
 * Date: 12.06.13
 * Time: 16:07
 */
public class HtmlOutMessageRenderer implements MessageRenderer {
    private MessageProvider messageProvider = null;


    @Override
    public void render() {
        if (messageProvider == null)
            throw new RuntimeException(
                    "You must set the property messageProvider of class" +
                            StandartOutMessageRenderer.class.getName()
            );
        StringBuilder sb = new StringBuilder();
        sb.append("<html><h1>")
          .append(messageProvider.getMessage())
          .append("</html></h1>");
        System.out.println(sb.toString());
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
