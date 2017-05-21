package com.zycus.assignment.service;

import com.zycus.assignment.bean.Greeting;
import com.zycus.assignment.sender.JmsMessageSender;

public class SenderService {

	private JmsMessageSender messageSender;

	public void setMessageSender(JmsMessageSender messageSender) {
		this.messageSender = messageSender;
	}

	public void send(Greeting greeting) {
		messageSender.send(greeting);
	}
}
