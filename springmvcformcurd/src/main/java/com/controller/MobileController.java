package com.controller;

import javax.validation.Valid;
import javax.validation.executable.ValidateOnExecution;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.pojo.Mobile;
import com.service.MobileServiceDaoImp;

@Controller
public class MobileController {
	@Autowired
	private MobileServiceDaoImp servicedaoimp;
	
	@GetMapping("/add")
	public String oder(Mobile mobile,Model model) {
		model.addAttribute(mobile);
		return "savemobile";
	}
	
	@PostMapping("saved")
	public String odersaved(@Validated Mobile mobile) {
		servicedaoimp.save(mobile);
			return "allmobiles";
	
		
	}

}
