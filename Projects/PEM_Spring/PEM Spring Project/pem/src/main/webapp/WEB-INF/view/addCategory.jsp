
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
  <%String userid=session.getAttribute("username").toString(); %>
<form action="./submitCategory.htm" method="POST">
	<%
	session.setAttribute("username",session.getAttribute("username"));%>
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
		
			<td height="400" align="center"><h1>Add Category::<%=userid %></h1>
			
			
			Category:
			   <input type="text" name="name"/><br><br>
			   <input type="submit" value="Add"/>
			
	     
			
			<span style="text-align: right;">
			
			</td>
		</tr>
		<tr>
			
		</tr>
	</table>
</form>

</body>
<div align="center">
	<%@include file="./common/footer.jsp"%>
	</div>
</html>