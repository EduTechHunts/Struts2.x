<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
<head>
<title>Upload User Image</title>
</head>
 
<body>
<h2>Struts2 File Upload  Save Example</h2>
<s:actionerror />
<s:form action="userImage" method="post" enctype="multipart/form-data">
<%-- <s:textfield name="empId" label="Enter user id"></s:textfield>
<s:textfield name="empName" label="Enter user name"></s:textfield> --%>
<s:file name="empImage" label="User Image" size="10"/>
    <s:submit value="Upload" align="center" />
</s:form>
</body>
</html>
