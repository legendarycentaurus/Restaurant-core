package com.nanda.validator;

import java.util.logging.Level;
import java.util.logging.Logger;

import com.nanda.exception.FoodScheduleException;
import com.nanda.model.FoodSchedule;

public class FoodScheduleValidator {

	private final Logger logger = Logger.getLogger(FoodScheduleValidator.class.getName());
	
	public void validateSave(FoodSchedule foodschedule)
	{
	if("".equals(foodschedule.getId()) || "".equals(foodschedule.getTotalQuantity()) || "".equals(foodschedule.getTime())
		||	"".equals(foodschedule.getFood()))
	{
		try {
			throw new FoodScheduleException("This field cannot be null");
		} catch (FoodScheduleException e) {
			
			  logger.log(Level.SEVERE, "FoodItemsException",e);
		}
	}	
	else if(foodschedule.getId()<0 || foodschedule.getTotalQuantity()<0){
		try {
			throw new FoodScheduleException("This field must contain a value greater than 0");
		} catch (FoodScheduleException e) {
			
			  logger.log(Level.SEVERE, "FoodItemsException",e);
		}
		
	}
	}
}
