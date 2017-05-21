package com.zycus.assignment.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

import com.zycus.assignment.bean.Greeting;
import com.zycus.assignment.service.SenderService;
@Controller
public class SenderController {

	private SenderService service;

	public void setService(SenderService service) {
		this.service = service;
	}

	@RequestMapping(value = "/send")
	public ModelAndView send(@ModelAttribute("greeting") Greeting greeting) {
		System.out.println("Send Calling");
		String msg = "Data Send Successfully...";
		service.send(greeting);
		return new ModelAndView("send_data", "msg",msg);
	}
}
