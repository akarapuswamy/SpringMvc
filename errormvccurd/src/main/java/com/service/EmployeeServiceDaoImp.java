package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.EmployeeDaoImp;
import com.pojo.Employee;
@Service
public class EmployeeServiceDaoImp implements EmployeeServiceDao {
	@Autowired
	private  EmployeeDaoImp employeeDaoImp;

	public int save(Employee e) {
	int save = employeeDaoImp.save(e);
		return save;
	}

	public int update(Employee e) {
	int update = employeeDaoImp.update(e);
		return update;
	}



	public List<Employee> GetAll() {
		List<Employee> getAll = employeeDaoImp.GetAll();
		return getAll;
	}

	public Employee findbyid(Integer id) {
		Employee findbyid = employeeDaoImp.findbyid(id);
		return findbyid;
	}

	

	@Override
	public int delect(Integer id) {
		int delect = employeeDaoImp.delect(id);
		return delect;
	}



	}
