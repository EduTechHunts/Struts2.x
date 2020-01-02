package com.panelcoder.struts2;

import com.opensymphony.xwork2.ActionSupport;

public class Login extends ActionSupport{
    private static final long serialVersionUID = 1L;    
 
    public String execute()
    {
        try
        {
            Thread.sleep(3000);
        }
        catch(Exception e)
        {
 
        }        
 
        return SUCCESS;
    }
 
}