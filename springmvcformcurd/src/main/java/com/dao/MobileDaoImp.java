package com.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.mysql.cj.Query;
import com.pojo.Mobile;
import com.quries.Querys;
@Repository
public class MobileDaoImp implements MobileDao {
	@Autowired
	private JdbcTemplate jdbcTemplate;
	

	@Override
	public int save(Mobile mobile) {
		int i = jdbcTemplate.update(Querys.insert,new Object[] {mobile.getId(),mobile.getMobileName(),mobile.getMobileBrand(),mobile.getPrize()});
		return i;
	}

	@Override
	public int delect(int id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int update(Mobile mobile) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Mobile FindByeId(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Mobile> GetAllmobile() {
		// TODO Auto-generated method stub
		return null;
	}

}
