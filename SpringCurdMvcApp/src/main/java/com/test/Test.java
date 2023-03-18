package com.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.dao.StudentDaoImp;
import com.pojo.Student;

public class Test {

	public static void main(String[] args) {
		ApplicationContext c=new ClassPathXmlApplicationContext("swamy.xml");
		StudentDaoImp imp = c.getBean(StudentDaoImp.class);
		Student s=new Student(1, "ram", 25000.00);
		 System.out.println(s);
	}
}
