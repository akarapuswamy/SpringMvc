package com.quries;

public interface Querys {
	String insert="insert into Mobile values(?,?,?,?)";
	String update="update Mobile where id=?";
	String delect ="delect mobile  where id=?";
	String getall="select * from mobile";
	String getbyId="slect from mobile where id=?";

}
