package com.amol.pem.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.amol.pem.domain.Expense;


public class ExpenseRowMapper implements RowMapper<Expense>{
	public Expense mapRow (ResultSet rs, int rownum) throws SQLException {
		Expense expense = new Expense();
		
		expense.setExpenseId(rs.getInt(1));
		expense.setName(rs.getString(2));
		expense.setCatName(rs.getString(3));
		expense.setUserid(rs.getString(4));
		expense.setAmount(rs.getString(5));
		expense.setPaydate(rs.getString(6));
		expense.setMonth(rs.getString(7));
		expense.setYear(rs.getString(8));
	
		
	   
	   return expense;
	}

}
