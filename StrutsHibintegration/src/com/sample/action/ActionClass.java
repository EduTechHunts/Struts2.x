package com.sample.action;
import java.util.ArrayList;
import java.util.List;

import com.opensymphony.xwork2.ActionSupport;
import com.sample.dao.DaoClass;
import com.sample.pojo.PojoClass;

@SuppressWarnings("serial")
public class ActionClass extends ActionSupport{
List<PojoClass> l=new ArrayList<PojoClass>(); 
	
	private String email_id;
	private String password;

	public List<PojoClass> getL() {
		return l;
	}
	public String getEmail_id() {
		return email_id;
	}
	public String getPassword() {
		return password;
	}
	public void setL(List<PojoClass> l) {
		this.l = l;
	}
   public void setEmail_id(String email_id) {
 		this.email_id = email_id;
	}
  public void setPassword(String password) {
 		this.password = password;
	}
  
  
  public String execute(){
		DaoClass dao=new DaoClass();
		 l= dao.add(email_id,password);
			return "success";
		}
}
