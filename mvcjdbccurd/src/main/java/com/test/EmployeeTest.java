package com.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.controller.EmpController;
import com.dao.EmployeeDao;
import com.dao.EmployeeDaoImp;
import com.pojo.Employee;

public class EmployeeTest {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("empcurd.xml");
		EmpController ec = context.getBean(EmpController.class);
		Employee employee = new Employee(1, "shiva", "gorethi", "madugula", 320000.00);
//		ec.save(employee);
//		System.out.println(ec.getall());
		System.out.println(ec.save(employee));
		
		
	}

}
