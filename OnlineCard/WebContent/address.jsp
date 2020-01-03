<%@page import="org.apache.struts2.views.jsp.IncludeTag"%>
<%@page import="org.apache.struts2.components.Include"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib uri="/struts-tags" prefix="s" %>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>ADDRESS</title>
</head>

<body>
<div align="center">
<%-- <s:actionerror/> --%>
<s:form action ="next" method="post">
<s:textarea name="address" label="ADDRESS" rows="3" cols="16"/>
<br>
<s:textfield name="amount" label="Amount"></s:textfield><br>
<s:submit value="Pay"></s:submit>
</s:form>


</div>
</body>
</html>