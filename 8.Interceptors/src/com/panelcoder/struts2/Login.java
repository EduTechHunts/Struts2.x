package com.panelcoder.struts2;

import com.opensymphony.xwork2.ActionSupport;

public class Login extends ActionSupport{

	private static final long serialVersionUID = 1L;
private String name,password;

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getPassword() {
	return password;
}

public void setPassword(String password) {
	this.password = password;
}

public String execute(){
	try{
		Thread.sleep(2000);
		}
	catch(Exception e){}
	if(password.equals("gang")){
		return "success";
	}
	else
		return "error";
}
}
