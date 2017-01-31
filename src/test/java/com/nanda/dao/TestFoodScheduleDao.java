package com.nanda.dao;

import java.util.List;

import com.nanda.model.FoodItems;
import com.nanda.model.FoodSchedule;
import com.nanda.model.TimeSchedule;



public class TestFoodScheduleDao {

	public static void main(String[] args) {
		FoodScheduleDao foodscheduledaoobj=new FoodScheduleDao();
		FoodSchedule FoodScheduleobj= new FoodSchedule();
		TimeSchedule TimeScheduleobj=new TimeSchedule();
		FoodItems FoodItemsobj=new FoodItems();
		//insert	
			
			FoodItemsobj.setId(14);
			
			TimeScheduleobj.setId(1);	
			
			FoodScheduleobj.setTime(TimeScheduleobj);
			FoodScheduleobj.setFood(FoodItemsobj);
			FoodScheduleobj.setTotalQuantity(300);
		
			foodscheduledaoobj.save(FoodScheduleobj);
		
			//update
			
			FoodItemsobj.setId(14);
			
			TimeScheduleobj.setId(1);
			FoodScheduleobj.setTime(TimeScheduleobj);
			FoodScheduleobj.setFood(FoodItemsobj);
			FoodScheduleobj.setTotalQuantity(200);
			foodscheduledaoobj.update(FoodScheduleobj);
		
		//delete
		
		//	foodscheduledaoobj.delete(22);
		//Select
		List<FoodSchedule> foodList = foodscheduledaoobj.list();
			for (FoodSchedule f : foodList) {
				System.out.println(f.getId()+"	 "+f.getTime().getId()+"	 "+f.getFood().getId()+" 	"+f.getTotalQuantity());
				}
			
		}
}
