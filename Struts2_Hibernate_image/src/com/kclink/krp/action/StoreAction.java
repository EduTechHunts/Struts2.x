package com.kclink.krp.action;

import java.io.File;
import java.io.FileInputStream;

import org.apache.commons.io.FileUtils;

import com.kclink.krp.dao.ConnectionDAO;
import com.kclink.krp.pojo.ImgPojo;
import com.kclink.krp.pojo.imagePojo;
import com.opensymphony.xwork2.ActionSupport;

@SuppressWarnings("serial")
public class StoreAction extends ActionSupport {
	String id;
	private File myFile;
	private String myFileContentType;
	private String myFileFileName;
	private String destPath;

	
	public File getMyFile() {
		return myFile;
	}

	public void setMyFile(File myFile) {
		this.myFile = myFile;
	}

	public String getMyFileContentType() {
		return myFileContentType;
	}

	public void setMyFileContentType(String myFileContentType) {
		this.myFileContentType = myFileContentType;
	}

	public String getMyFileFileName() {
		return myFileFileName;
	}

	public void setMyFileFileName(String myFileFileName) {
		this.myFileFileName = myFileFileName;
	}


	
	public String execute() {
		
		destPath = "C:/apache-tomcat-6.0.33/work/";
		File destFile = null;
		
		
		 
		try {
			System.out.println("Src File name: " + myFile);
			System.out.println("Dst File name: " + myFileFileName);

			 destFile = new File(destPath, myFileFileName);
			FileUtils.copyFile(myFile, destFile);
			System.out.println("destFile File name: " + destFile.getPath());
			
			ImgPojo emp=new ImgPojo();
			emp.setImgName(myFileFileName);
			
			File file=destFile;
		
			/*String filePath=Base64.encodeFromFile(destFile.getPath());*/
			byte[] byteFile=filePath.getBytes();
			
			try {
				FileInputStream fs=new FileInputStream(filePath);
				fs.read(byteFile);
				fs.close();
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
			emp.setPicImage(filePath);
			
			ConnectionDAO cdao = new ConnectionDAO();
		 
		   
		   
		   
		   String s1=cdao.addImg(emp);
			
				if (s1.equals("inserted")) {
					destFile.delete();
				}
		} catch (Exception e) {
		    e.printStackTrace();
		}
		
		
		return "success";
	}

	
	}
