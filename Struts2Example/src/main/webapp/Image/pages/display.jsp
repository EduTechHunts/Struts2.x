<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
<head></head>
<body>
	<h1>Struts 2 Dynamic Image Example</h1>

	<img src=" <s:url action='ImageAction?imageId=darksouls.jpg' />" />

</body>
</html>