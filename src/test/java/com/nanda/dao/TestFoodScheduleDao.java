package com.nanda.dao;

import com.nanda.model.FoodItems;
import com.nanda.model.FoodSchedule;
import com.nanda.model.TimeSchedule;
import com.nanda.service.FoodScheduleService;



public class TestFoodScheduleDao {

	public static void main(String[] args) {
		FoodScheduleService FoodScheduleServiceobj=new FoodScheduleService();
		FoodSchedule FoodScheduleobj= new FoodSchedule();
		TimeSchedule TimeScheduleobj=new TimeSchedule();
		FoodItems FoodItemsobj=new FoodItems();
		//insert	
			
			FoodItemsobj.setId(14);
			
			TimeScheduleobj.setId(1);	
			
			FoodScheduleobj.setTime(TimeScheduleobj);
			FoodScheduleobj.setFood(FoodItemsobj);
			FoodScheduleobj.setTotalQuantity(0);
		
			FoodScheduleServiceobj.save(FoodScheduleobj);
		
			//update
			
			FoodItemsobj.setId(14);
			
			TimeScheduleobj.setId(1);
			FoodScheduleobj.setTime(TimeScheduleobj);
			FoodScheduleobj.setFood(FoodItemsobj);
			FoodScheduleobj.setTotalQuantity(0);
			FoodScheduleServiceobj.update(FoodScheduleobj);
		
//		//delete
//		
//		//	FoodScheduleServiceobj.delete(22);
//		//Select
//		List<FoodSchedule> foodList = FoodScheduleServiceobj.list();
//			for (FoodSchedule f : foodList) {
//				System.out.println(f.getId()+"	 "+f.getTime().getId()+"	 "+f.getFood().getId()+" 	"+f.getTotalQuantity());
//				}
			
		}
}
