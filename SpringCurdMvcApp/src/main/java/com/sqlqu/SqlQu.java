package com.sqlqu;

public interface SqlQu {
    String insert ="insert into employee values(?,?,?,?)";
    String update ="update employee set name=?, address=?,where id=?";
    String delect ="delect from employee where id=?";
    String getallemp ="select * from employee";
    String findbyid ="select * from employee where id=?"; 

}
