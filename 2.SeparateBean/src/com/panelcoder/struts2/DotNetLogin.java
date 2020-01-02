package com.panelcoder.struts2;

import com.opensymphony.xwork2.ActionSupport;

public class DotNetLogin extends ActionSupport {

	private static final long serialVersionUID = 1L;

	private Bean bean;

	public Bean getBean() {
		return bean;
	}

	public void setBean(Bean bean) {
		this.bean = bean;
	}
	
	public String execute()
	{
		return SUCCESS;
	}

}

