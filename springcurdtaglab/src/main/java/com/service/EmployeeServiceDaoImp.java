package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.dao.EmployeeDaoImp;
import com.pojo.Employee;
import com.sqlqu.SqlQur;
@Service
public class EmployeeServiceDaoImp implements EmployeeDaoService {
	@Autowired
     private EmployeeDaoImp ser;

	
	public int save(Employee emp) {
		int i = ser.save(emp);
		return i ;
	}

	public int delect(int id) {
		int delect = ser.delect(id);
		return delect;
	}

	public int update(Employee employee) {
		int update = ser.update(employee);
		return update;
	}

	

	public List<Employee> GetAllEmp() {
		List<Employee> allEmp = ser.GetAllEmp();
		return allEmp;
	}

	@Override
	public Employee FindByeId(Integer id) {
		Employee id2 = ser.FindByeId(id);
		return id2;
	}

}
