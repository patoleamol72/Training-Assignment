<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>PEM_App</title>
<link rel="stylesheet" type="text/css" href="css/style.css">
</head>
<body bgcolor="powderblue">

<table border="1" style="margin: auto;" width="80% " >
<tr>
	<td>
	<%@include file="./common/header.jsp"%>

   <br><br><br>
	</td>
</tr>
<tr>
	<td height="20">
		<jsp:include page="indexMenu.jsp"/>
	</td>
</tr>
<tr>
	<td height="700" align="center">
	
		<jsp:include page="home.jsp"/>
	</td>
</tr>
<tr>
	<div align="center">
	<%@include file="./common/footer.jsp"%>
	</div>
</tr>
</table>

</body>
</html>