package struts2.action.upload;

import java.io.File;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.io.FileUtils;
import org.apache.struts2.interceptor.ServletRequestAware;

import com.opensymphony.xwork2.ActionSupport;

/**
 * @author Dinesh Rajput
 *
 */
public class FileUploadAction extends ActionSupport implements ServletRequestAware {
	private static final long serialVersionUID = 1L;

	private HttpServletRequest servletRequest;
	
	
	Bean b=new Bean();

	private String userImageFileName;

	private File userImage;
	
	
	public String execute(){
		/*b.setUserId(1);
		userImageFileName=b.getUserImageFileName();
		userImage=b.getUserImage(); 
		try
		{
		    String filePath = servletRequest.getSession().getServletContext().getRealPath("/");
		    System.out.println("Server path:" + filePath);
		    b.setUserImageContentType(filePath);
		    File fileToCreate = new File(filePath, this.userImageFileName);
		    b.setUserImage(fileToCreate);
		    FileUtils.copyFile(this.userImage, fileToCreate);
		    b.setUserImageFileName(filePath);
		} catch (Exception e) {
		    e.printStackTrace();
		    addActionError(e.getMessage());
	
		    return INPUT;
		}*/
		    System.out.println("hjkhkhkh");
		RegisterDao dao=new RegisterDao();
	/*	dao.saveUser(this);*/
		
		return SUCCESS;
	}

	@Override
	public void setServletRequest(HttpServletRequest arg0) {
		// TODO Auto-generated method stub
		
	}
	
	

	
}