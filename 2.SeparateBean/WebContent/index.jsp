<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<body>
 
<s:form action="beanex">
 
    <s:textfield name="bean.name" label="Enter empname" /><br>
    <s:textfield name="bean.empid" label="Enter empID" /><br>
    <s:textfield name="bean.sal" label="Enter CTC" /><br>
 
    <s:submit value="Click" align="center" /> 
 
</s:form>
</body>
</html>