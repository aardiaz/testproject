package com.service;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.db.DB;
import com.model.User;

public class UserServiceImpl implements UserService {

	@Override
	public void userSignup(User u) {
		
		String sql = "insert into user(fname,lname,username,password)values('"+u.getFname()+"','"+u.getLname()+"','"+u.getUsername()+"','"+u.getPassword()+"')";
		try {
			Statement  stm = DB.connectDb().createStatement();
			stm.execute(sql);
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public boolean userLogin(String un, String psw) {
		
		String sql = "select * from user  where username = '"+un+"' and password = '"+psw+"'  ";
		try {
			Statement  stm = DB.connectDb().createStatement();
			ResultSet  rs = stm.executeQuery(sql);
			
			if(rs.next()) {
				return true;
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return false;
	}

}
