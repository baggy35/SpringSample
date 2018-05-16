package kr.green.spring.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value ="/account")
public class AccountController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	
	
	@RequestMapping(value ="signup", method = RequestMethod.GET)
	public String signup() {
		return "/account/signup";
	}
	@RequestMapping(value ="signup", method = RequestMethod.POST)
	public String signup(String id, String pw, String email) {
		logger.info("id : " + id + ", pw : " + pw + ", email : "+ email);
		if(isEmpty(id))
			return "/account/signup";
		return "redirect:/";
	}
	@RequestMapping(value ="signin", method = RequestMethod.GET)
	public String signin() {
		return "/account/signin";
	}
	@RequestMapping(value ="signin", method = RequestMethod.POST)
	public String signin(String id, String pw) {
		logger.info("id : " + id + ", pw : " + pw + ", email : ");
		if(isEmpty(id) || isEmpty(pw))
			return "/account/signin";
		return "redirect:/";
	}
	public static boolean isEmpty(String s) {
		if(s == null || s.length() == 0) return true;
		return false;
	}
}
