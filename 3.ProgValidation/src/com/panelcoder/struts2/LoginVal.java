package com.panelcoder.struts2;

import com.opensymphony.xwork2.ActionSupport;

public class LoginVal extends ActionSupport
{

	private static final long serialVersionUID = 1L;
	
	private String uname,password;
	 
    public String getUname() {
        return uname;
    }
 
    public void setUname(String uname) {
        this.uname = uname;
    }
 
    public String getPassword() {
        return password;
    }
 
    public void setPassword(String password) {
        this.password = password;
    }
    
    
 
    public String execute()
    {
        if(uname.equals("panelcoder") && password.equals("panelcoder"))
        {
            return SUCCESS;
 
        }else
            this.addActionError(getText("u.p.wrong"));
            return ERROR;
    }
 
    public void validate()
    {
        if(uname.equals("") || uname.length()==0)
            this.addFieldError("uname",getText("user.wrong"));
        if(password.equals("") || password.length()==0)
            this.addFieldError("password",getText("pass.wrong"));
 
    }
 
}

