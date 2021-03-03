package com.phuocthanh.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.phuocthanh.model.Category;

public class CategoryMapper implements RowMapper<Category> {

	@Override
	public Category mapRow(ResultSet rs) {
		Category category=new Category();
		try {
			category.setId(rs.getLong("id"));
			category.setCode(rs.getString("code"));
			category.setName(rs.getString("name"));
			return category;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}

}
