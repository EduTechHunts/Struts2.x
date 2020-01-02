package com.struts.action;

import com.struts.dao.UserDao;
import com.struts.pojo.UserPojo;

public class Useraction 
{
	private UserPojo up;

	public UserPojo getUp() {
		return up;
	}

	public void setUp(UserPojo up) {
		this.up = up;
	}
	
	public String execute()
	{
		UserDao.saveUser(up);
		return "success";
		
	}

}
