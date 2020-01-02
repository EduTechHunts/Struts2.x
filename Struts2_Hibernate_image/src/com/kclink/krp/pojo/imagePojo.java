package com.kclink.krp.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;



@Entity
@Table(name="imgTbl")
public class imagePojo {

	@Id @GeneratedValue
	@Column(name="ID")
	private int Id;
	
	@Column(name="IMG_NAME")
	private String imgName;
	
	@Lob
	@Column(name="PIC_IMAGE", columnDefinition="longblob")
	private byte[] picImage;

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getImgName() {
		return imgName;
	}

	public void setImgName(String imgName) {
		this.imgName = imgName;
	}

	public byte[] getPicImage() {
		return picImage;
	}

	public void setPicImage(byte[] picImage) {
		this.picImage = picImage;
	}

	
}
