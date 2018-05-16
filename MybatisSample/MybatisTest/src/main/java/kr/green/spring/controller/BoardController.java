package kr.green.spring.controller;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import kr.green.spring.dao.Mapper;
import kr.green.spring.object.Board;

@Controller
@RequestMapping(value="/board/*")
public class BoardController {
	
	ArrayList <Board> list = new ArrayList();
	
	
	@RequestMapping(value="/list", method=RequestMethod.GET)
	public ModelAndView boardListGet() {
		
		list.add(new Board("title","contents"));
		ModelAndView model = new ModelAndView("/board/list"); 
		model.addObject("list", list);
		System.out.println("리스트 크기 : "+list.size());
		return model;
	}
	
	
}
