package com.nit.shoppingBackend.daoImpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.nit.shoppingBackend.dao.CategoryDAO;
import com.nit.shoppingBackend.dto.Category;

@Repository("categoryDAO")
public class CategoryDAOImpl implements CategoryDAO {
	
	private static List<Category> categories= new ArrayList<>();
	
	static{
		Category category=new Category();
		//First Category..
		category.setId(001);
		category.setName("Television");
		category.setDescription("This is a description for television..");
		category.setImageURL("CAT_1.png");
		
		categories.add(category);	
		//second category..
		category=new Category();
		category.setId(002);
		category.setName("Mobile");
		category.setDescription("This is a description for mobile..");
		category.setImageURL("CAT_2.png");
		
		categories.add(category);		
		//third category..
		category=new Category();
		category.setId(003);
		category.setName("Laptop");
		category.setDescription("This is a description for laptop..");
		category.setImageURL("CAT_3.png");
		
		categories.add(category);		
		
	}
	
	
	
	public List<Category> list() {
		// TODO Auto-generated method stub
		return categories;
	}



	@Override
	public Category get(int id) {
		//  enhanced for loop (forEach)
		for(Category category: categories)
		{
			if(category.getId()==id)
				return category;
		}
		
		return null;
	}

}
