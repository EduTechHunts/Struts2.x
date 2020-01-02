package com.panelcoder.struts;

import com.opensymphony.xwork2.ActionSupport;

import com.opensymphony.xwork2.validator.annotations.RequiredStringValidator;

public class Hello extends ActionSupport{

	private static final long serialVersionUID = 1L;

	private String name;

/*	@RequiredStringValidator(message = "name is required")*/
	
	public void setName(String name) {
	this.name = name;

	}
	public String getName() {
		return name;
	}
	public String execute()
	{
		if(name.equalsIgnoreCase("gang"))
		{
		
		return "success";
		}
		return "error";
		
	}
}
