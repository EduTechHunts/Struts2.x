package com.validation;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.validator.annotations.RequiredFieldValidator;
import com.opensymphony.xwork2.validator.annotations.RequiredStringValidator;
public class Action extends ActionSupport implements SessionAware
{	
 
	private static final long serialVersionUID = 1L;
	Map m;
	private String address;
	private int amount;
	
	@RequiredStringValidator(message="required string")
	public void setAddress(String address) {
		this.address = address;
	}
	@RequiredFieldValidator(message="Required field")
	public void setAmount(int amount) {
		this.amount = amount;
	}
 
  	public String getAddress() {
		return address;
	}
	public int getAmount() {
		return amount;
	}
	public void setSession(Map m)
    {
    	this.m=m;
    }
 
	public String execute()
	{
		m.put("f", address);
		m.put("g", amount);
		return SUCCESS;
	}
 
}