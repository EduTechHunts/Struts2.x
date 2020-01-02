package com.kclink.gang;




import java.util.Date;

import com.opensymphony.xwork2.ActionSupport;

public class Signup extends ActionSupport
{
	private static final long serialVersionUID = 1L;

	private String firstName;
	private String lastName;
	private String email;
	private String reEmail;
	private String password;
	private Date dob;
	private String myRadioButton;
	public String getMyRadioButton() {
		return myRadioButton;
	}
	public void setMyRadioButton(String myRadioButton) {
		this.myRadioButton = myRadioButton;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getReEmail() {
		return reEmail;
	}
	public void setReEmail(String reEmail) {
		this.reEmail = reEmail;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public void validate()
	{
		if(!(email.equals(reEmail)))
		{
			this.addFieldError("reEmail", "invalid");
		}
	}
	public String execute()
	{
		
			
		return SUCCESS;
		
	}
}
