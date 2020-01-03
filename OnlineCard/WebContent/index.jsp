<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "<http://www.w3.org/TR/html4/loose.dtd">
   <%@taglib uri="/struts-tags" prefix="s" %>
<html>
<script type="text/javascript">
function isNumber(evt)
{
    evt = (evt) ? evt : window.event;
    var charCode = (evt.which) ? evt.which : evt.keyCode;
    if (charCode > 31 && (charCode < 48 || charCode > 57))
    {
        return false;
    }
    return true;
}

</script>
 
        <head>
        <s:head theme="ajax" debug="true"/>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Payment Page</title>
        </head>
        
        
 
<body>
<div align="center">
 <s:actionerror />
<s:form action="payment" method="post">
 	
		  <s:select label="SELECT CARD TYPE" required="true"
		headerKey="-1" headerValue="Select Card"
		list="#{'creditcard':'Credit Card', 'debitcard':'Debit Card', 'mastrocard':'Mastro card'}" 
		name="cardtype" />
 	
    <s:textfield name="cardname" label="Card Name" required="true"></s:textfield>
    <s:textfield name="cardnum" label="Card Number" maxlength="12" onkeypress="return isNumber(event)" required="true"></s:textfield>
    <s:textfield name="cvv" label="CVV" required="true" maxlength="3" onkeypress="return isNumber(event)"></s:textfield>
    <s:datetimepicker name="exdate" label="EX-Date" displayFormat="dd/MM/yyyy" required="true"></s:datetimepicker>
   	
    <s:submit value="pay"></s:submit>
		
</s:form>
</div>
</body>
</html>