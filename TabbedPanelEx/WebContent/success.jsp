<%@ taglib prefix="s" uri="/struts-tags" %>
 
  <head>
  <s:head theme="ajax" debug="true"/>
  </head>
 
  <body>
 <h1>JAVA</h1>
  <s:tabbedPanel id="test" >
 
  <s:div id="one" label="Core" theme="ajax">
  Oop's
  JDBC
  Collections<br><br>
  </s:div>
 
  <s:div id="two" label="Servlet" theme="ajax">
   some topics<br><br>
  </s:div>
 
  <s:div id="three" label="Struts" theme="ajax">
    struts 1.x
    struts 2.x<br><br>
  </s:div>
 
  <s:div id="four" label="Hibernate" theme="ajax">
    CRUD operations<br><br>
  </s:div>
 
 </s:tabbedPanel>
 
  </body>