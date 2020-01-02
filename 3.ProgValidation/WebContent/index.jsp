<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>

</head>
<body>
 
<%-- <s:actionerror/> --%>
<s:form action="verify">
 <!-- <META HTTP-EQUIV="Refresh" CONTENT="0;URL=resultAction.action"> -->
    <s:textfield name="uname" label="User Name"/><br>
    <s:password name="password" label="Password"/><br>
 
    <s:submit value="Click" align="center" /> 
 
</s:form>
</body>
</html>