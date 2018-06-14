package com.amol.pem.domain;

import java.io.Serializable;
import java.util.Date;

public class Expense implements Serializable {
	
	private int expenseId;
	private String name;
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}


	private int categoryId;
	private String catName;
	private String paydate;
	private String remark;
	private String userid;
	/**
	 * @param categoryId
	 * @param remark
	 * @param date
	 * @param amount
	 */
	public Expense(int categoryId, String remark, Date date, String amount) {
		super();
		this.categoryId = categoryId;
		this.remark = remark;
		this.date = date;
		this.amount = amount;
	}
	/**
	 * 
	 */
	public Expense() {
		
	}
	/**
	 * @return the remark
	 */
	public String getRemark() {
		return remark;
	}
	/**
	 * @param remark the remark to set
	 */
	public void setRemark(String remark) {
		this.remark = remark;
	}
	/**
	 * @return the userid
	 */
	public String getUserid() {
		return userid;
	}
	/**
	 * @param userid the userid to set
	 */
	public void setUserid(String userid) {
		this.userid = userid;
	}
	/**
	 * @return the expenseId
	 */
	public int getExpenseId() {
		return expenseId;
	}
	/**
	 * @param expenseId the expenseId to set
	 */
	public void setExpenseId(int expenseId) {
		this.expenseId = expenseId;
	}
	/**
	 * @return the categoryId
	 */
	public int getCategoryId() {
		return categoryId;
	}
	/**
	 * @param categoryId the categoryId to set
	 */
	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}
	/**
	 * @return the catName
	 */
	public String getCatName() {
		return catName;
	}
	/**
	 * @param catName the catName to set
	 */
	public void setCatName(String catName) {
		this.catName = catName;
	}
	/**
	 * @return the paydate
	 */
	public String getPaydate() {
		return paydate;
	}
	/**
	 * @param paydate the paydate to set
	 */
	public void setPaydate(String paydate) {
		this.paydate = paydate;
	}
	
	
	private Date date;
	/**
	 * @return the month
	 */
	public String getMonth() {
		return month;
	}
	/**
	 * @param month the month to set
	 */
	public void setMonth(String month) {
		this.month = month;
	}
	/**
	 * @return the year
	 */
	public String getYear() {
		return year;
	}
	/**
	 * @param year the year to set
	 */
	public void setYear(String year) {
		this.year = year;
	}
	private String amount;
	private String month;
	private String year;
	
	private String total;
	/**
	 * @return the amount
	 */
	public String getAmount() {
		return amount;
	}
	/**
	 * @param amount the amount to set
	 */
	public void setAmount(String amount) {
		this.amount = amount;
	}
	
	/**
	 * @return the total
	 */
	public String getTotal() {
		return total;
	}
	/**
	 * @param total the total to set
	 */
	public void setTotal(String total) {
		this.total = total;
	}
	

}
