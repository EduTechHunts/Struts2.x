package com.dineshonjava.struts2.action.upload;

import java.io.File;
import java.io.IOException;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;
import javax.servlet.http.HttpServletRequest;

import org.apache.commons.io.FileUtils;
import org.apache.struts2.interceptor.ServletRequestAware;

import com.opensymphony.xwork2.ActionSupport;

/**
 * @author Dinesh Rajput
 *
 */

@Entity
@Table(name="FILE_UPLOAD")
public class FileUploadAction extends ActionSupport implements ServletRequestAware {
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue
	@Column(name="USER_ID")
	private int userId;
	
	/*@Lob
	@Column(name="USER_IMAGE")
	private File userImage;*/
	
	@Column(name="CONTENT_TYPE")
	private String userImageContentType;
	
	@Column(name="IMAGE_NAME")
	private String userImageFileName;
	
	private HttpServletRequest servletRequest;
	
	RegisterDao dao=new RegisterDao();
	
	public String execute(){
		try
		{
		    String filePath = servletRequest.getSession().getServletContext().getRealPath("/");
		    System.out.println("Server path:" + filePath);
		    File fileToCreate = new File(filePath, this.userImageFileName);
		
		    FileUtils.copyFile(this.userImage, fileToCreate);
		} catch (Exception e) {
		    e.printStackTrace();
		    addActionError(e.getMessage());
	
		    return INPUT;
		}
		    System.out.println("hjkhkhkh");
		
		dao.saveUser(this);
		
		return SUCCESS;
	}
	
	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}
	
	/*public File getUserImage() {
		return userImage;
	}
	
	public void setUserImage(File userImage) {
		this.userImage = userImage;
	}*/
	
	public String getUserImageContentType() {
		return userImageContentType;
	}
	
	public void setUserImageContentType(String userImageContentType) {
		this.userImageContentType = userImageContentType;
	}
	
	public String getUserImageFileName() {
		return userImageFileName;
	}
	
	public void setUserImageFileName(String userImageFileName) {
		this.userImageFileName = userImageFileName;
	}
	
	@Override
	public void setServletRequest(HttpServletRequest servletRequest) {
		this.servletRequest = servletRequest;
	}
}