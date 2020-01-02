package com.panelcoder.struts;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.validator.annotations.CustomValidator;
import com.opensymphony.xwork2.validator.annotations.EmailValidator;
import com.opensymphony.xwork2.validator.annotations.RequiredStringValidator;

public class LoginAction extends ActionSupport {
	
	private static final long serialVersionUID = 1L;
	private String email;
	private String password;
	
	
	@RequiredStringValidator(message = "Please enter your e-mail address.")
	@EmailValidator(message = "Please enter a valid e-mail address.")
	public void setEmail(String email) {
		this.email = email;
	}
	
	@RequiredStringValidator(message = "Please enter your password.")
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	public String getEmail() {
		return email;
	}
	
	public String getPassword() {
		return password;
	}

	public String execute() {
		if (password.equalsIgnoreCase("gang123")) {
			return SUCCESS;			
		} else {
			return INPUT;
		}
	}
}