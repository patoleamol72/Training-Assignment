package com.amol.pem.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.amol.pem.domain.Category;

public class CategoryRowMapper implements RowMapper<Category>{
	public Category mapRow (ResultSet rs, int rownum) throws SQLException {
		Category category = new Category();
		
		category.setCategoryId(rs.getInt(1));
		category.setName(rs.getString(2));
		category.setUserId(rs.getString(3));
		
	   return category;
	}

}
