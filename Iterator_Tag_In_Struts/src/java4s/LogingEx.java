package java4s;
import java.util.ArrayList;
import java.util.List;

import com.opensymphony.xwork2.ActionSupport;

public class LogingEx extends ActionSupport{	
	private static final long serialVersionUID = 1L;
	private List countries;
	
	public List getCountries()
	{
		  return countries;
	}

	public String execute()
	{	
		countries = new ArrayList();
		
		countries.add("Uganda");
		countries.add("Ukraine");
		countries.add("United States");
		countries.add("United Arab Emirates");
		countries.add("United Kingdom");
		countries.add("Uruguay");
		countries.add("Uzbekistan");
		
		return SUCCESS;
	}
	
	
}
