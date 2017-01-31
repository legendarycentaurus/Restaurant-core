package com.nanda.dao;



import java.util.List;

import com.nanda.model.FoodItems;
import com.nanda.service.FoodItemsService;

public class TestFoodItemsDao {

	public static void main(String[] args) {
		FoodItemsService fooditemsserviceobj=new FoodItemsService();
		//FoodItemsDao fooditemsdaoobj=new FoodItemsDao();
		FoodItems fooditemsobj= new FoodItems();
	//insert	

		fooditemsobj.setItemName("idli ");
		fooditemsobj.setPrice(0);
		fooditemsserviceobj.save(fooditemsobj);
//	//update
//	
//		fooditemsobj.setId(1);
//		fooditemsobj.setPrice(5);
//		
//	//delete
//			
//		fooditemsdaoobj.delete(15);
//	//Select all 
//		
//		List<FoodItems> foodList = fooditemsdaoobj.list();
//		for (FoodItems f : foodList) {
//			System.out.println(f);
//			}
//	
//		//Functions
//		System.out.println(fooditemsdaoobj.validateSeat(7));
//		System.out.println(fooditemsdaoobj.validateItemName("variety rice"));
//		System.out.println(fooditemsdaoobj.validateQuantity(10));
//		System.out.println(fooditemsdaoobj.generateOrder());
//	
//		
//	//Procedures
//	System.out.println(fooditemsdaoobj.ShowBill(1102));
//		String order=fooditemsdaoobj.Order(4, "Idli,Dosa,Poori", "4,3,2");
//		System.out.println(order);
//	
//		String cancelOrder=fooditemsdaoobj.CancelOrder(1012);
//		System.out.println(cancelOrder);
	}
}
