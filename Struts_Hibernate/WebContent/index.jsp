<%@ taglib uri="/struts-tags" prefix="s" %>  
  
<s:form action="register">  
<s:textfield name="id" label="Id"/>
<s:textfield name="name" label="Name"/>
<s:textfield name="address" label="Address"/>
<s:textfield name="email" label="Email"/>
<s:textfield name="mobile" label="Mobile"/> 
<s:submit value="register"/>  
  
</s:form>  