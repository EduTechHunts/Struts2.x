package com.validation;

import java.util.Map;
import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;
public class Action extends ActionSupport implements SessionAware
{	
 
	private static final long serialVersionUID = 1L;
	Map m;	
 
    public void setSession(Map m)
    {
    	this.m=m;
    }
 
	public String execute()
	{
		return SUCCESS;
	}
 
}