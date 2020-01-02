package com.panelcoder.action;

import com.panelcoder.RegisterDao.RegisterDao;

public class UserLogin {
	private String Email;
	private String password;
	RegisterDao dao=new RegisterDao(); 
	 public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String execute(){
		if(dao.find(getEmail(),getPassword()))
			return "success";
		else
			return "error";
	}
		
	}
	


