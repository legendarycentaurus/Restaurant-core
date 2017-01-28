package com.nanda.dao;



import java.util.List;

import org.springframework.core.annotation.SynthesizedAnnotation;

import com.nanda.model.FoodItems;

public class TestFoodItemsDao {

	public static void main(String[] args) {
		
		FoodItemsDao fooditemsdaoobj=new FoodItemsDao();
		FoodItems fooditemsobj= new FoodItems();
	//insert	

		fooditemsobj.setItemName("Mini Idly");
		fooditemsobj.setPrice(5);
	
	//update
	
		fooditemsobj.setId(1);
		fooditemsobj.setPrice(5);
		
	//delete
			
		fooditemsdaoobj.delete(15);
	//Select all 
		
		List<FoodItems> foodList = fooditemsdaoobj.list();
		for (FoodItems f : foodList) {
			System.out.println(f);
			}
	
		//Functions
		System.out.println(fooditemsdaoobj.validateSeat(7));
		System.out.println(fooditemsdaoobj.validateItemName("variety rice"));
		System.out.println(fooditemsdaoobj.validateQuantity(10));
		System.out.println(fooditemsdaoobj.generateOrder());
	
		
	
	
	
	}
}
