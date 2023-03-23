package com.queries;

public interface Queries {
	String insert="insert into Employee values (?,?,?,?)";
	String update="update Employee set name=?,des=?,salary=? where id=?";
	String delete="delete from Employee where id=?";
	String GetAll="select * from Employee";
	String findbyid="select *from Employee where id=?";

}
