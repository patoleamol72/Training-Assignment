<%@page import="com.amol.pem.domain.Expense"%>
<%@page import="com.amol.pem.serviceimpl.ExpenseServiceImpl"%>
<%@page import="com.amol.pem.service.ExpenseService"%>
<%@page import="com.amol.pem.domain.Category"%>
<%@page import="com.amol.pem.serviceimpl.CategoryServiceImpl"%>
<%@page import="com.amol.pem.service.CategoryService"%>
<%@page import="java.util.*"%>
<%
	//Create user object and assign the registration form data
	session.setAttribute("userid",session.getAttribute("userid"));
	
	%>

	<%!
	ExpenseService expService=new ExpenseServiceImpl();
      %>
      
  <%    
  String userid=request.getParameter("userid");
	
  List<Expense>expList=expService.listCategoryWise(userid);
	
	request.setAttribute("expList", expList);
	pageContext.forward("categoryListDisplay.jsp");
	
	
%>