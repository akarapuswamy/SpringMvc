package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.MobileDaoImp;
import com.pojo.Mobile;
@Service
public class MobileServiceDaoImp implements MobileServiceDao {
	@Autowired
     private MobileDaoImp  mobileDaoImp;
     
	@Override
	public int save(Mobile mobile) {
		int i = mobileDaoImp.save(mobile);
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
