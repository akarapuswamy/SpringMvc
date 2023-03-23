package com.dao;

import java.util.List;


import com.pojo.Mobile;

public interface MobileDao {
	
	int save(Mobile mobile);
	int delect(int id);
	int update (Mobile mobile);
	Mobile FindByeId(int id);
	List<Mobile> GetAllmobile();


}
