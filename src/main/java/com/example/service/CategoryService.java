package com.example.service;

import java.util.List;

import com.example.pojo.Category;
import com.example.util.Page;

public interface CategoryService {
	List<Category> list();
    int total();
    List<Category> list(Page page);
    public void add(Category category);
}
