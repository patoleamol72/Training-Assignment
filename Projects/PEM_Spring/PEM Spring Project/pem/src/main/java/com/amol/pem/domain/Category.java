package com.amol.pem.domain;

import java.io.Serializable;

public class Category implements Serializable{
	private int categoryId;
	private String name;
	private String userId;
	
	public Category(){
		
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

	/**
	 * @return the userId
	 */
	public String getUserId() {
		return userId;
	}

	/**
	 * @param i the userId to set
	 */
	public void setUserId(String i) {
		this.userId = i;
	}
	
	/**
	 * @param name
	 */
	public Category(String name) {
		super();
		this.name = name;
	}
	

	/**
	 * @param categoryId
	 * @param name
	 */
	public Category(int categoryId, String name) {
		super();
		this.categoryId = categoryId;
		this.name = name;
	}

	
	

}
