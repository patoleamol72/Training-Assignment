
<%@page import="com.amol.pem.domain.User"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%
    response.addHeader("Expires", "-1");
%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Welcome</title>
</head>
<body bgcolor="powderblue">
<%@include file="./common/header.jsp"%>

   <br><br><br>
			
	<%
	session.setAttribute("userid",session.getAttribute("name"));%>
	<table border="1" style="margin: auto;" width="90%">
		
		<tr>
			<td height="20"><jsp:include page="./common/menu.jsp" /></td>
		</tr>
		<tr>
		
			<td height="400" align="center">
			
			
			<h3>Login successful!!!</h3>
			
			<h2> Welcome :: <%=session.getAttribute("name")%>	</h2>
	     
			
			<span style="text-align: right;">
			
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