<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib uri="/struts-tags" prefix="s"%>
<html>
<head>
<title>Login</title>
</head>
<body>
<font color="Red">
	<s:actionerror /></font>
	<s:form action="loginUser">
		<s:textfield name="userName" placeholder="userName" label="Enter User Name" />
		<s:submit value="Submit" />
	</s:form>
	
</body>
</html>