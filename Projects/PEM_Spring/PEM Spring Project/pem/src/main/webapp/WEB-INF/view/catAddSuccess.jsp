
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
<title>Add Category</title>
</head>
<body bgcolor="powderblue">

	<%
	session.setAttribute("userid",session.getAttribute("username"));%>
	<table border="1" style="margin: auto;" width="80%">
		<tr>
			<td>
			
			
			
			</span>
			
			</td>
			
		</tr>
		<tr>
			<td height="20"><jsp:include page="./common/menu.jsp" /></td>
		</tr>
		<tr>
		    
			<td height="550" align="center">
			
			<h2> Hello <%=session.getAttribute("username")%>	</h2>
	     
			<h2>${msg}</h2>
			
			
			
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