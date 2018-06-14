package com.amol.pem.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.amol.pem.dao.ExpenseDao;
import com.amol.pem.domain.Expense;
import com.amol.pem.service.ExpenseService;


@Service("expservice")
public class ExpenseServiceImpl implements ExpenseService {
	
	@Autowired
	ExpenseDao expensedao;
	
	public int addExpense(Expense expense) {
		// TODO Auto-generated method stub
		return expensedao.addExpense(expense);
	}
	
	public List<Expense> listAllExpense(String userid){
		return expensedao.listAllExpense(userid);
	}
	

	public List<Expense> listMonthalyExpense(String userid) {
		// TODO Auto-generated method stub
		return expensedao.listMonthlyExpenses(userid);
	}

	public List<Expense> listYearlyExpense(String userid) {
		// TODO Auto-generated method stub
		return expensedao.listYearlyExpenses(userid);
	}

	public List<Expense> listCategoryWise(String userid) {
		// TODO Auto-generated method stub
		return expensedao.listCategoryWise(userid);
	}

	public int deleteExpense(Integer id) {
		// TODO Auto-generated method stub
		return expensedao.deleteExpense(id);
	}


	
	
}
