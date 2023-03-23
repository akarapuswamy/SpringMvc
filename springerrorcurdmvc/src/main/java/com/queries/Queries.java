package com.queries;

public interface Queries {
	    String insert ="insert into Person  values(?,?,?)";
	    String update ="update Person set Name=?,Address=?, where id=?";
	    String delect ="delete from Person where id=?";
	    String getallperson ="select * from Person";
	    String findbyid ="select * from Person where id=?"; 
}
