<%@page contentType="text/html" pageEncoding="UTF-8"%>
   <%@taglib uri="/struts-tags" prefix="s" %>
   <html><head>
<s:head theme="ajax" debug="true"/>
  </head>
<title>Login</title>
<body>
<font color="Red">
<s:actionerror /></font>

<s:form action="verify">

    <s:textfield name="uname" label="Enter Username" required="true"/><br>
    <s:textfield name="age" label="Enter Age" required="true"/><br>
    <s:textfield name="mail" label="Enter Email id" required="true"/><br>
 
    <s:submit value="Click" align="center" /> 
 
</s:form>
</body>
</html>