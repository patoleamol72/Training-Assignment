package com.amol.pem.daoimpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.amol.pem.dao.CategoryDao;
import com.amol.pem.domain.Category;
import com.amol.pem.rowmapper.CategoryRowMapper;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.Statement;
@Repository("categorydao")
public class CategoryDaoImpl implements CategoryDao{
	
	Connection con =null;
	PreparedStatement psmt =null;
	Statement stmt =null;
	
	@Autowired
	
	private JdbcTemplate jdbctemplate;

	/**
	 * @return the jdbctemplate
	 */
	public JdbcTemplate getJdbctemplate() {
		return jdbctemplate;
	}

	/**
	 * @param jdbctemplate the jdbctemplate to set
	 */
	public void setJdbctemplate(JdbcTemplate jdbctemplate) {
		this.jdbctemplate = jdbctemplate;
	}

	public int addCategory(Category category) {
		
		String sql= "insert into categories(name,userid)values(?,?)";
		int i = jdbctemplate.update(sql, new Object[]{category.getName(),category.getUserId()});
		if(i>0){
			return i;
		}
		return 0;
		
	}

	public List<Category> listAllCategory(String userid) {
		
		String sql="select * from categories where userid=?";
		List<Category> catlist=new ArrayList<Category>();
		catlist=jdbctemplate.query(sql, new CategoryRowMapper(),userid);
		
		return catlist;
	}

}
