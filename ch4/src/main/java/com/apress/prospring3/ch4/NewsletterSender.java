package com.apress.prospring3.ch4;

public interface NewsletterSender {
	public void setSmtpServer(String smtpServer);
	public String getSmtpServer();
	
	public void setFromAddress(String fromAddress);
	public String getFromAddress();
	
	public void send();	
}
