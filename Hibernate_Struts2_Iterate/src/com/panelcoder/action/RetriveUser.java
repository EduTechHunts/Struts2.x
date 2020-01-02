package com.panelcoder.action;

import java.util.ArrayList;
import java.util.List;

import com.opensymphony.xwork2.ActionSupport;
import com.panelcoder.RegisterDao.RegisterDao;
import com.panelcoder.pojo.User;

@SuppressWarnings("serial")
public class RetriveUser extends ActionSupport {
	
	List<User> imgList = new ArrayList<User>();
	public List<User> getImgList() {
		return imgList;
	}
	public void setImgList(List<User> imgList) {
		this.imgList = imgList;
	}
	@Override
	public String execute() throws Exception {
		
		RegisterDao cdao =new RegisterDao();
		imgList=cdao.ret();
		System.out.println(imgList);
			return "success";
	}

}
