package com.panelcoder.struts2;

import java.util.Map;

import org.apache.struts2.dispatcher.SessionMap;
import org.apache.struts2.interceptor.SessionAware;

public class Login implements SessionAware{
private String name,password;
private Map m;



public void setSession(Map m)
{
	this.m=m;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getPassword() {
	return password;
}

public void setPassword(String password) {
	this.password = password;
}



public String execute(){
if(password.equals("gang")){
	m.put("login","true");
	m.put("name",name);
	
	
	return "success";
}
else{
	return "login";
}
}

public String logout(){
	if(m!=null){
		((SessionMap) m).invalidate();
	}
	return "success";
}




}
