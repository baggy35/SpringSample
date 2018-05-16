package kr.green.spring.controller;


import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import kr.green.spring.dao.Mapper;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	@Autowired
	private Mapper mapper;
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Model model) {
		logger.info("Welcome home!123");
		return "index";
	}
	@RequestMapping(value = "/index", method = RequestMethod.GET)
	public String index(Model model) {
		return "index";
	}
	@RequestMapping(value="/test",method=RequestMethod.POST)
	public String test(HttpServletRequest request, Model model) {
		String id = request.getParameter("id");
		System.out.println(id);
		model.addAttribute("id", mapper.getId(id));
		return "list";
	}
	
}
