<%@taglib uri="/struts-tags" prefix="s"%>
<html>
<head>
<title>Login</title>
</head>
<body>
	<s:form action="loginUser">
		<s:textfield name="userName" placeholder="Username" label="Username" />
		<s:password name="password" placeholder="Password" label="Password" />
		<s:submit value="Submit" />
	</s:form>
</body>
</html>