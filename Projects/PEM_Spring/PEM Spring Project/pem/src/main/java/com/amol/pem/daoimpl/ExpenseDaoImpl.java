package com.amol.pem.daoimpl;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.amol.pem.dao.ExpenseDao;
import com.amol.pem.domain.Expense;
import com.amol.pem.rowmapper.ExpenseRowMapper;
import com.amol.pem.rowmapper.ListExpenseRowMapper;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.Statement;

@Repository("expensedao")
public class ExpenseDaoImpl implements ExpenseDao {

	Connection con = null;
	PreparedStatement pstmt = null;
	Statement stmt = null;
	@Autowired
	private JdbcTemplate jdbctemplate;
	
	public JdbcTemplate getJdbcTemplate() {
		return jdbctemplate;
	}


	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbctemplate = jdbcTemplate;
	}
	
	
	public int addExpense(Expense expense) {
		
		 DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MMM/yyyy");  
		   LocalDateTime now = LocalDateTime.now();  
		   System.out.println(dtf.format(now));
		   
		   String dt=dtf.format(now);
		   
		   
		   String arr[]=dt.split("/");
		   String month = null;
		   String year = null;
		   for (int i = 0; i < arr.length; i++) {
					
			 month=arr[1];
			System.out.println("------------m"+month);
			
			year=arr[2];
			System.out.println("-----------y"+year);
		
		   }
		   
		String sql = "insert into expenses(name,catname,userid,amount,date,month,year) values(?,?,?,?,?,?,?)";
		
		int i = jdbctemplate.update(sql,new Object[] {expense.getRemark(),expense.getCatName(),expense.getUserid(),expense.getAmount(),dt,month,year});
				
		if(i>0) {
			return i;
		}
		return 0;
		
	}

	public List<Expense> listAllExpense(String userid) {

		String sql="select * from expenses where userid=?";
		
		List<Expense> explist=new ArrayList<Expense>();
		explist=jdbctemplate.query(sql, new ExpenseRowMapper(),userid);
		System.out.println(explist);
		return explist;
	}
	
	public int deleteExpense(Integer expid) {
		String del = " DELETE FROM expenses WHERE id=?";
	    int i=jdbctemplate.update(del, expid);
		if(i>0) {
			return i;
		}
		return 0;
	}

	public List<Expense> listMonthlyExpenses(String userid) {
		
		String sql="SELECT  month,year,catname,SUM(amount) as 'total' FROM expenses where userid=? GROUP BY month ASC";
		
		List<Expense> explist=new ArrayList<Expense>();
		explist=jdbctemplate.query(sql, new ListExpenseRowMapper(),userid);
		
		return explist;
	}

	public List<Expense> listYearlyExpenses(String userid) {
		
         String sql="SELECT  month,year,catname,SUM(amount) as 'total' FROM expenses where userid=? GROUP BY year ASC";
		
		List<Expense> explist=new ArrayList<Expense>();
		explist=jdbctemplate.query(sql, new ListExpenseRowMapper(),userid);
		
		return explist;
	}

	public List<Expense> listCategoryWise(String userid) {
         String sql="SELECT  month,year,catname,SUM(amount) as 'total' FROM expenses where userid=? GROUP BY catname ASC";
		
		List<Expense> explist=new ArrayList<Expense>();
		explist=jdbctemplate.query(sql, new ListExpenseRowMapper(),userid);
		
		return explist;
		
	}


	

}
