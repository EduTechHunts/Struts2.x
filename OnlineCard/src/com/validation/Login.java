package com.validation;

import java.util.Date;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.validator.annotations.RequiredStringValidator;

public class Login extends ActionSupport implements SessionAware
{
    private static final long serialVersionUID = -585293628862447329L;
 
    private String cardname,cardtype;
    private int cardnum,cvv;
    private Date exdate;
    Map m;
  
    public String execute()
    {     
     	 	m.put("a",cardtype);
 			m.put("b", cardname);
 			m.put("c",cardnum);
 			m.put("d",cvv);
 			m.put("e", exdate);
 			
     	 return SUCCESS;
     }
    
    /*@RequiredStringValidator(message = "Please select your card.")*/
     public void setcardtype(String cardtype)
    {
    	this.cardtype=cardtype;
    }
    public String getcardtype()
    {
    	return cardtype;
    }
   
     public String getcardname() 
    {
        return cardname;
    }
     public void setcardname(String cardname) 
    {
        this.cardname = cardname;
    }
   
     
     public int getcardnum() 
    {
        return cardnum;
    }
     public void setcardnum(int cardnum) 
     {
   	     this.cardnum = cardnum;
   	  }
     
     
     public int getcvv()
     {
    	 return cvv;
     }
     public void setcvv(int cvv)
     {
    	 this.cvv=cvv;
     }
    
   
     public Date getexdate()
    {
        return exdate;
    }
    public void setexdate(Date exdate)
    {
    	this.exdate=exdate;
    }
  
    
    public void setSession(Map m)
    {
    	this.m=m;
    }
 
      
   
       
}