<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="/struts-tags" prefix="s" %>
  
<!DOCTYPE html>

<html>
<head>

</head>
<body>
<form action="addpost1" enctype="multipart/form-data" method="post">  
   <table>  
        
      <tr><td>Add Photo: </td><s:file name="myFile" /></tr>
     
        
      <tr><td></td><td><input type="submit" value="Post"></td></tr>  
  </table>  
  
  
  </form>  
  <a href="retrive">hai</a>
</body>
</html>