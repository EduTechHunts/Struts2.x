package com.hibernate.image;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;



@Entity
@Table(name="EMPL")
public class Employee {

	@Id @GeneratedValue
	@Column(name="EMP_ID")
	private int empId;
	
	@Column(name="EMPl_NAME")
	private String empName;
	
	@Lob
	@Column(name="EMP_IMAGE", columnDefinition="mediumblob")
	private byte[] empImage;

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public byte[] getEmpImage() {
		return empImage;
	}

	public void setEmpImage(byte[] empImage) {
		this.empImage = empImage;
	}
	
}
