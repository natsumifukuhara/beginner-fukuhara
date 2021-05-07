package com.example.contoller;

import javax.servlet.ServletContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/exam03")
public class Exam03Controller {

	@Autowired
	private ServletContext application;
	
	@RequestMapping("")
	public String index() {
		return "exam03";
	}
	
	@RequestMapping("/add")
	public String add(int num1,int num2,int num3) {
		int intAnswer = (int)(num1+num2+num3);
		int intAnswer2 = (int)((num1+num2+num3)*1.1);
		application.setAttribute("answer",intAnswer);
		application.setAttribute("answer2",intAnswer2);
		return "exam03-result";
	}
	
	
	
}
