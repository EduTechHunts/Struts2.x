package com.kclink.krp.action;

import java.util.ArrayList;
import java.util.List;

import com.kclink.krp.dao.ConnectionDAO;
import com.kclink.krp.pojo.ImgPojo;

import com.opensymphony.xwork2.ActionSupport;

@SuppressWarnings("serial")
public class RetriveAction extends ActionSupport {
	List<ImgPojo> imgList = new ArrayList<ImgPojo>();
	
	public List<ImgPojo> getImgList() {
		return imgList;
	}
	public void setImgList(List<ImgPojo> imgList) {
		this.imgList = imgList;
	}
	@Override
	public String execute(){
		
		ConnectionDAO cdao =new ConnectionDAO();
		imgList=cdao.getCollegeDetails();
		System.out.println(imgList);
		return "success";
	
	}

}
