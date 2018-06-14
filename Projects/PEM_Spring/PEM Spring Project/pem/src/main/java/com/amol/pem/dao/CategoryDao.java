package com.amol.pem.dao;

import java.util.List;

import com.amol.pem.domain.Category;



public interface CategoryDao {
public int addCategory(Category category);
	
	public List<Category> listAllCategory(String userid);

}
