package com.amol.pem.service;

import java.util.List;
import com.amol.pem.domain.Category;

public interface CategoryService {
	public int addCategory(Category category);
	public List<Category> listAllCategory(String userid);

}
