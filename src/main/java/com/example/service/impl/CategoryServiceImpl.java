package com.example.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dao.CategoryDao;
import com.example.pojo.Category;
import com.example.service.CategoryService;
import com.example.util.Page;

@Service
public class CategoryServiceImpl implements CategoryService{
    @Autowired
    CategoryDao dao;

	public List<Category> list() {
		// TODO Auto-generated method stub
		return dao.list();
	}

	public int total() {
		// TODO Auto-generated method stub
		return dao.total();
	}

	public List<Category> list(Page page) {
		// TODO Auto-generated method stub
		return dao.list(page);
	}

	public void add(Category category) {
		dao.add(category);
		
	}
	

}
