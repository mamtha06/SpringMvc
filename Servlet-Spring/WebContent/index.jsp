<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
   <script src="http://code.jquery.com/jquery-1.9.1.js"></script> 

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<script type="text/javascript">

$(document).ready(function()
{
	//alert("hellooo");
	document.onclick=function(evt)
	{
		var a = evt.target;
		if(a.type =="button"){
			var b = a.value;
			console.log(b)
			//var b=$('#cals').val();
			var a=$('#num1').val();
			alert("b...."+b);
			$.ajax({type: "POST",url:'getoutput',data:{num:a,cals:b}}).done(function(data){
				
				$('#getData').html(data);	
				alert("success....");
			});
		}
			
		
	}
/* console.log()
//var b=$('#cals').val();
var a=$('#num1').val();
alert("b...."+b);
$.ajax({type: "POST",url:'getoutput',data:{num:a,cals:b}}).done(function(data){
	
	$('#getData').html(data);	
	alert("success....");
}); */
	

});


</script>
<body>

If you don't mind me asking, what is your name?:<input type="text" name="num" id="num1"><br>
<input type="button" value="sqrt" id="cals" >
<input type="button" value="cb" id="cals" >
<a href="guestbook">Give Comments</a>
<div id="getData"></div>
</body>
</html>