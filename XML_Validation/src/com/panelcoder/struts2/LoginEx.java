package com.panelcoder.struts2;

import com.opensymphony.xwork2.ActionSupport;

public class LoginEx extends ActionSupport{
    private static final long serialVersionUID = 1L;
 
    private String uname,mail;
    private int age;
 
    public String getUname() {
        return uname;
    }
 
    public void setUname(String uname) {
        this.uname = uname;
    }
 
    public String getMail() {
        return mail;
    }
 
    public void setMail(String mail) {
        this.mail = mail;
    }
 
  
    public int getAge() {
        return age;
    }
 
    public void setAge(int age) {
        this.age = age;
    }
 
    public String execute()
    {        
 
            return SUCCESS;
 
    }
 
}