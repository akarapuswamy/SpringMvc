package com.sqlqu;

public interface SqlQur {
	    String insert ="insert into Employee  values(?,?,?,?)";
	    String update ="update Employee set Name=?,Address=?,salary=? where id=?";
	    String delect ="delete from Employee where id=?";
	    String getallemp ="select * from Employee";
	    String findbyid ="select * from Employee where id=?"; 


}
