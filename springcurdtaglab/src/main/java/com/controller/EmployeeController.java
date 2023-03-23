package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.dao.EmployeeDaoImp;
import com.mysql.cj.x.protobuf.MysqlxCrud.Update;
import com.pojo.Employee;
import com.service.EmployeeDaoService;
import com.service.EmployeeServiceDaoImp;

@Controller
public class EmployeeController {
	@Autowired
	private EmployeeServiceDaoImp serviceimp;
	
	
	@GetMapping("/go")
	public String go() {
	return "regfrom";	
	}
	
	@PostMapping("/saved" )
	public String saved(Employee emp) {
		serviceimp.save(emp);
		return "redirect:list";
		
	}
	
	@GetMapping("/list")
	public ModelAndView all() {
		List<Employee> e= serviceimp.GetAllEmp();
		return new ModelAndView("list","map",e);	
	}
	@GetMapping("/remove")
	public String remove(Integer id){
		int i = serviceimp.delect(id);
		return "redirect:list";
	}
	@GetMapping("/edit")
	public String edit() {
		return "redirect:list";
	}
	@PostMapping("/modify")
	public String find(Integer id) {
		return "redirect:list";
	}
	@GetMapping("/find")
	public String findbyid(Integer id,Model m) {
		Employee emp = serviceimp.FindByeId(id);
		m.addAttribute("e", emp);
		return "update";
	}
	@PostMapping("/update")
	public String update(Employee e) {
		int update = serviceimp.update(e);
		return "redirect:list";	
	}
}
