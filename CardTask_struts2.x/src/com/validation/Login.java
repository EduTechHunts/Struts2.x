package com.validation;

import java.util.Date;
import java.util.Map;
import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

public class Login extends ActionSupport implements SessionAware
{
    private static final long serialVersionUID = 1L;
 
    private String cardname,cardtype,address;
    private int cardnum,cvv,amount;
    private Date exdate;
    Map m;
  
    public String getcardtype()
    {
    	return cardtype;
    }
     public void setcardtype(String cardtype)
    {
    	this.cardtype=cardtype;
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
  
    
    public String getaddress()
    {
    	return address;
    }
    public void setaddress(String address)
    {
    	this.address=address;
    }
    
    public int getamount()
    {
    	return amount;
    }
    public void setamount(int amount)
    {
    	this.amount=amount;
    }
    public void setSession(Map m)
    {
    	this.m=m;
    }
 
      
     public String execute()
   {     
    	 	m.put("a",cardtype);
			m.put("b", cardname);
			m.put("c",cardnum);
			m.put("d",cvv);
			m.put("e", exdate);
			m.put("f", address);
			m.put("g", amount);
    	 return SUCCESS;
    }
       
}