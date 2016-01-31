<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
   <script src="http://code.jquery.com/jquery-1.9.1.js"></script> 

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<!-- <script type="text/javascript">

$(document).ready(function()
{
	alert("hellooo");
	$('#btn').click(function(){
var a=$('#gnm').val();
var b=$('#gem').val();
var c=$('#gco').val();


$.ajax({type: "POST",url:'writeComment',data:{gname:a,gemail:b,gcomment:c}}).done(function(data){
	
	$('#getData').html(data);	
	alert("success....");
});
	

});
});
</script> -->


<body>
 <div align="center">
       
      <form:form action="writeComment" commandName="guestbook" method="post">
      <tr>
                    <td align="left" width="20%">gname: </td>
                    <td align="left" width="40%"><form:input path="gname" size="30"/></td>
                    <td align="left"><form:errors path="gname" cssClass="error"/></td>
                </tr><br>
                <tr>
                    <td align="left" width="20%">Email: </td>
                    <td align="left" width="40%"><form:input path="gemail" size="30"/></td>
                    <td align="left"><form:errors path="gemail" cssClass="error"/></td>
                </tr><br>
                <tr>
                    <td>Comment: </td>
                    <td><form:input path="gcomment" size="30"/></td>
                    <td><form:errors path="gcomment" cssClass="error"/></td>
                </tr><br>
                <tr>
                    <td></td>
                    <td align="center"><input type="submit" value="Login"/></td>
                    <td></td>
                </tr>
        </form:form>
    </div>
    <div id="getData">
    
    </div>
    
</body>
</html>