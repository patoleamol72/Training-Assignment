package com.amol.pem.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.amol.pem.dao.CategoryDao;
import com.amol.pem.daoimpl.CategoryDaoImpl;
import com.amol.pem.domain.Category;
import com.amol.pem.service.CategoryService;


@Service("catgoryservice")
public class CategoryServiceImpl implements CategoryService {
	
	@Autowired
	CategoryDao categorydao;

	public int addCategory(Category category) {
		// TODO Auto-generated method stub
		return categorydao.addCategory(category);
	}

	public List<Category> listAllCategory(String userid) {
		// TODO Auto-generated method stub
		return categorydao.listAllCategory(userid);
	}

}
