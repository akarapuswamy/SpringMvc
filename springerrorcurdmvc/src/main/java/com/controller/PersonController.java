package com.controller;

import java.util.List;

import javax.swing.Spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.pojo.Person;
import com.service.PersonDaoServiceImp;

@Controller
public class PersonController {
	@Autowired
	private PersonDaoServiceImp personDaoServiceImp;
	
	@GetMapping("/insert")
	public String add() {
		return "open";
		
	}
	
	@PostMapping("/insert")
	public String inside(Person p1) {
	personDaoServiceImp.save(p1);
		return "redirect:all";
		
	}
	@GetMapping("/remove")
	public String remove(Integer id) {
		int delect = personDaoServiceImp.delect(id);
		return "redirect:all";
		
	}
	
	
	@GetMapping("/all")
	public ModelAndView allthere() {
		List<Person> e = personDaoServiceImp.allpersons();
		return new ModelAndView("all","map", e);
		
	}

	@GetMapping("/find")
	public String findbyId(Integer id,Model m) {
		Person person = personDaoServiceImp.FindByeId(id);
		m.addAttribute("e",person);
		return "update";
		
	}
	@PostMapping("/update")
	public String update(Person update) {
		int i = personDaoServiceImp.update(update);
		return "redirect:all";
		
	}



}
