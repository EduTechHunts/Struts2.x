package struts2.action.upload;

import java.io.File;
import java.io.FileInputStream;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.classic.Session;

import com.opensymphony.xwork2.ActionSupport;


@Entity
@Table(name="GANGADHAR")
public class Image extends ActionSupport
{
	@Id @GeneratedValue
	@Column(name="EMP_ID")
	private int empId;
	
	@Column(name="EMP_NAME")
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
	

	
	@Override
	public String execute() throws Exception {
		/*File file=new File("/");
		byte[] byteFile=new byte[(int)file.length()];
		
		try {
			FileInputStream fs=new FileInputStream(file);
			fs.read(byteFile);
			fs.close();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}*/
		
		RegisterDao dao=new RegisterDao();
		dao.saveUser(this);
		return SUCCESS;
	}

}
