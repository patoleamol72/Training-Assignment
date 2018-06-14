package com.amol.pem.dao;

import java.util.List;

import com.amol.pem.domain.Expense;

public interface ExpenseDao {
	
	public int addExpense(Expense expense);
	public List<Expense> listAllExpense(String userid);
	
	public  List<Expense>  listMonthlyExpenses(String userid);
	
	public List<Expense> listYearlyExpenses(String userid);
	public List<Expense> listCategoryWise(String userid);
	public int deleteExpense(Integer id);

}
