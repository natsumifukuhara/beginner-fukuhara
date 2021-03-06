package com.example.contoller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/exam02")
public class Exam02Controller {

	@Autowired
	private HttpSession session;
	
	@RequestMapping("")
	public String index() {
		return "exam02";
	}
	
	@RequestMapping("/add")
	public String add(int num1,int num2) {
		session.setAttribute("number1", num1);
		session.setAttribute("number2", num2);
		int answer = num1+num2;
		session.setAttribute("answer",answer);
		return "exam02-result";
		
	}
	
	@RequestMapping("/toresult2") 
	public String toresult2(){
		return "exam02-result2";
		}
}
