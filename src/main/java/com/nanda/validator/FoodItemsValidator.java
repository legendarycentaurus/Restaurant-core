package com.nanda.validator;


import com.nanda.exception.FoodItemsException;
import com.nanda.model.FoodItems;
import com.nanda.util.StringService;

public class FoodItemsValidator {

	private final StringService StringServiceobj=new StringService();

	public void validateSave(FoodItems fooditems) throws FoodItemsException
	{
		save(fooditems);
	}
		
	public void save(FoodItems fooditems) throws FoodItemsException{
			if(StringServiceobj.isInValid(fooditems.getItemName())) {
				try {
					throw new FoodItemsException("This field cannot be null");
				}
				catch (FoodItemsException e) {
				  e.printStackTrace();
				}
	
																		}
	}
}