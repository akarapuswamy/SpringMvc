package com.dao;

import java.util.List;

import com.pojo.Employee;

public interface EmployeeDao {
	int save(Employee employee);

	int update(Employee employee);

	int delete(int id);

	Employee findById(Integer id);

	List<Employee> findAll();

}
