package com.dao;

import java.util.List;

import com.pojo.Student;

public interface StudentDao {
	
int save(Student s);
	
	List<Student> getAll();

}
