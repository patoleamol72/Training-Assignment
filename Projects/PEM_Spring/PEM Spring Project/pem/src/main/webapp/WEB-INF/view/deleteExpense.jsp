
<%@page import="com.amol.pem.domain.Category"%>
<%@page import="com.amol.pem.domain.User"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%
    response.addHeader("Expires", "-1");
%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Delete Expense</title>
</head>
<body bgcolor="powderblue">

	<%
	session.setAttribute("userid",session.getAttribute("name"));%>
	<table border="1" style="margin: auto;" width="80%">
		<tr>
			<td>
		
			<span>
			
			</span>
			
			</td>
			
		</tr>
		<tr>
		<td height="20"><jsp:include page="./common/menu.jsp" /></td>
		</tr>
		<tr>
		
			<td height="550" align="center"><h1>List of Expense :: <%=session.getAttribute("name") %></h1>
			
			
			<table border="1" cellpadding="5">
          
			    <thead>
			      <tr>
			        <th><b>Expense Id </b></th>
			        <th><b>Category </b></th>
			        <th><b>Expense For</b></th>
			        <th><b>Amount </b></th>
			        <th><b>Date of Pay </b></th>
			        <th><b>Delete Expense </b></th>
			                
			      </tr>
			    </thead>
			    <tbody >
					  <c:forEach items="${explist}" var="explist"> 
                 
					      <tr>
					      
					        <td>${explist.expenseId}</td>
					        <td>${explist.catName}</td>
					        <td>${explist.name}</td>
					        <td>${explist.amount}</td>
					        <td>${explist.paydate}</td>
					        <td align="center"><a href="./deleteExpenses.htm?expid=${explist.expenseId}">Delete</a></td>
					      </tr>    
					   </c:forEach>
					   
					    </tbody>
					  </table>  
			
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
