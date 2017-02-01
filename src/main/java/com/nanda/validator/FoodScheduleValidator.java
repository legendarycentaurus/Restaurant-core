package com.nanda.validator;

import com.nanda.exception.FoodScheduleException;
import com.nanda.model.FoodSchedule;
import com.nanda.util.IntegerService;


public class FoodScheduleValidator {

	private final IntegerService IntegerServicefoodschedule = new IntegerService();
	
	public void validateSave(FoodSchedule foodschedule) throws FoodScheduleException
	{
			isInteger(foodschedule);
	}
		
	
	
	public void isInteger(FoodSchedule foodschedule) throws FoodScheduleException{
		if(IntegerServicefoodschedule.isNotValid(foodschedule.getTotalQuantity()) ||
				IntegerServicefoodschedule.isNotValid(foodschedule.getFood().getId()) ||
				IntegerServicefoodschedule.isNotValid(foodschedule.getTime().getId())){
			throw new FoodScheduleException("Enter a value greater than zero");
		}
		
	}
	
	public void validateDelete(int number) throws FoodScheduleException
	{
		if(	IntegerServicefoodschedule.isNotValid(number)){
			throw new FoodScheduleException("Enter avalue greater than zero");
		}	
	}
}
