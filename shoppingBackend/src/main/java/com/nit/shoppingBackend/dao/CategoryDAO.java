package com.nit.shoppingBackend.dao;

import java.util.List;

import com.nit.shoppingBackend.dto.Category;

public interface CategoryDAO {

	List<Category> list();
	Category get(int id);
	
}
