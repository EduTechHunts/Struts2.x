<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
<head>
<s:head theme="ajax" debug="true"/>
  </head>
<body>
<s:actionerror/>
<s:form action="verify">
<s:textfield name="firstName" label="FirstName" required="true"/><br>
<s:textfield name="lastName" label="LastName" required="true"/><br>
<s:textfield name="email" label="your Email" required="true"/><br>
<s:textfield name="reEmail" label="Re-enter Email" required="true"/><br>
<%-- <s:textfield name="dob" label="Date of Birth"/> --%>
<%-- <s:datetimepicker label="Date Of Birth" name="dob" displayFormat="MM-dd-yy" required="true" /> --%>
<s:textfield name="password" label="New password" required="true"/><br>
<s:radio id="radiobutton" name="myRadioButton" title="male" list="#{'1' : 'male'}"/>
<s:radio id="radiobutton" name="myRadioButton" title="Female" list="#{ '2' : 'Female'}"/>
<s:submit value="Sign Up" align="center"></s:submit>
</s:form>
</body>
</html>