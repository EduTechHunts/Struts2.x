<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">
   


        <table border="1"  cellpadding="2" cellspacing="2" align="center">
            <tr>
                <td height="50" colspan="2">
                <tiles:insertAttribute name="myHeader"/>
                </td>
            </tr>
            
            <tr>                
                <td width="50%" height="150">
                    <tiles:insertAttribute name="myMenu" />
                </td>                
                <td>
                    <tiles:insertAttribute name="myBody" />
                </td>
            </tr>
            
            <tr>
                <td height="50" colspan="2">
                    <tiles:insertAttribute name="myFooter" />
                </td>
            </tr>
        </table>



