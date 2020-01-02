package com.action;

import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport {

	private static final long serialVersionUID = 6677091252031583948L;

	private String userName;
	private String password;

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String execute() {
		return SUCCESS;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public void validate() {

		if (userName.isEmpty()) {
			addFieldError("userName", "Username can't be blank");
		}
		if (password.isEmpty()) {
			addFieldError("password", "Password Can't be blank");
		}
		else {
			addActionMessage("Welcome " + userName + ", You have been Successfully Logged in");
		}
	}
}