package com.kclink.krp.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;

@Entity
@Table(name="imgTbl")
public class ImgPojo 
{
	@Id @GeneratedValue
	@Column(name="ID")
	private String Id;
	
	@Column(name="IMG_NAME")
	private String imgName;
	
	@Lob
	@Column(name="PIC_IMAGE", columnDefinition="longblob")
	private String picImage;

	public String getId() {
		return Id;
	}

	public void setId(String id) {
		Id = id;
	}

	public String getImgName() {
		return imgName;
	}

	public void setImgName(String imgName) {
		this.imgName = imgName;
	}

	public String getPicImage() {
		return picImage;
	}

	public void setPicImage(String picImage) {
		this.picImage = picImage;
	}

	

}
