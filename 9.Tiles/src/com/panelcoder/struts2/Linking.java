package com.panelcoder.struts2;

import com.opensymphony.xwork2.ActionSupport;


public class Linking extends ActionSupport {

	private static final long serialVersionUID = -2613425890762568273L;

	public String welcome()
	{
		return "welcome";		
	}
	
	public String department()
	{
		return "department";		
	}
	public String projects()
	{
		return "projects";		
	}	
	
}
