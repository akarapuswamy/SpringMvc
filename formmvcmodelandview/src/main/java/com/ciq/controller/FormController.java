package com.ciq.controller;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class FormController {
	@RequestMapping(value = "/hi",method = RequestMethod.GET)
	public ModelAndView formview() {
         ModelAndView s = new ModelAndView("/WEB-INF/view/");
         
		return s;
		
	}
	@RequestMapping(value = "/hi",method = RequestMethod.POST)
	public ModelAndView regis(int id,String name) {
		
		String s=id+" "+name;
		ModelAndView m = new ModelAndView("result","map",s);
		return m;
		
	}
	

}
