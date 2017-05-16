package com.example.dao;

import java.util.List;

import com.example.pojo.Category;
import com.example.util.Page;

public interface CategoryDao {
	public int add(Category category);

	public void delete(int id);

	public Category get(int id);

	public int update(Category category);

	public List<Category> list();

	public List<Category> list(Page page);

	public int total();
}
