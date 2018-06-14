package com.amol.pem.service;

import java.util.List;

import com.amol.pem.domain.Expense;


public interface ExpenseService {
	public int addExpense(Expense expense);
	public List<Expense> listAllExpense(String userid);
	
	public  List<Expense> listMonthalyExpense(String userid);
	public  List<Expense> listYearlyExpense(String userid);
	
	public  List<Expense> listCategoryWise(String userid);
	public int deleteExpense(Integer expid);

}
