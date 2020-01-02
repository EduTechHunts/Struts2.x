package com.action;

import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport {

	private static final long serialVersionUID = 6677091252031583948L;

	private String userName;

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
			addActionError("Username can't be blanked");
		} else {
			addActionMessage("Welcome " + userName + ", You have been Successfully Logged in");

		}
	}
}
