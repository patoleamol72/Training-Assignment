package com.amol.pem.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.amol.pem.domain.Expense;

public class ListExpenseRowMapper  implements RowMapper<Expense>{
	public Expense mapRow (ResultSet rs, int rownum) throws SQLException {
		Expense expense = new Expense();
		
		expense.setCatName(rs.getString("catname"));
		expense.setMonth(rs.getString("month"));
		expense.setYear(rs.getString("year"));
		expense.setTotal(rs.getString("total"));
		
	   
	   return expense;
	}
}
