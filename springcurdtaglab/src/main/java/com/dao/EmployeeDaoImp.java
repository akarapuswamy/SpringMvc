package com.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.pojo.Employee;
import com.sqlqu.SqlQur;
@Repository
public class EmployeeDaoImp implements EmployeeDao {
	@Autowired
	private JdbcTemplate jdbcTemplate;

	public int save(Employee emp) {
		int i = jdbcTemplate.update(SqlQur.insert, new Object[] {emp.getId(),emp.getName(),emp.getAddress(),emp.getSalary()});
		return i;
	}

	public int delect(int id) {
		jdbcTemplate.update(SqlQur.delect, new Object[] {id});
		return 0;
	}

	public int update(Employee employee) {
     int i = jdbcTemplate.update(SqlQur.update,new Object[] {employee.getName(),employee.getAddress(),employee.getSalary(),employee.getId()});
		return i;
	}


	public List<Employee> GetAllEmp() {
		List<Employee>list=jdbcTemplate.query(SqlQur.getallemp,  new RowMapper<Employee>() {
			@Override
			public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
				Employee e = new Employee();
				e.setId(rs.getInt(1));
				e.setName(rs.getString(2));
				e.setAddress(rs.getString(3));
				e.setSalary(rs.getDouble(4));
				return e;
			}
			
		});
		return list;
	}

	@SuppressWarnings("deprecation")
	@Override
	public Employee FindByeId(int id) {
		Employee e = jdbcTemplate.queryForObject(SqlQur.findbyid, new Object[] {id},BeanPropertyRowMapper.newInstance(Employee.class));
		return e;
	}

}
