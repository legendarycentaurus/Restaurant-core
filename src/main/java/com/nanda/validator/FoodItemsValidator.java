package com.nanda.validator;


import com.nanda.exception.FoodItemsException;
import com.nanda.model.FoodItems;
import com.nanda.util.IntegerService;
import com.nanda.util.StringService;

public class FoodItemsValidator {

	private final StringService StringServiceobj=new StringService();
	private final IntegerService IntegerServiceobj = new IntegerService();
	
	public void validateSave(FoodItems fooditems) throws FoodItemsException
	{
		isString(fooditems);
		isInteger(fooditems);
	}
		
	public void isString(FoodItems fooditems) throws FoodItemsException{
			if(StringServiceobj.isInValid(fooditems.getItemName())) {
					throw new FoodItemsException("Item Name is invalid");
						
			}
	}
	
	public void isInteger(FoodItems fooditems) throws FoodItemsException{
		if(IntegerServiceobj.isNotValid(fooditems.getId()) || IntegerServiceobj.isNotValid(fooditems.getPrice())){
			throw new FoodItemsException("Enter a value greater than zero");
		}
	}
		public void validateUpdate(FoodItems fooditems) throws FoodItemsException
		{
			isInteger(fooditems);
		}
	
		public void validateDelete(Integer number) throws FoodItemsException
		{
			if(IntegerServiceobj.isNotValid(number)){
				throw new FoodItemsException("Enter a value greater than zero in ID");
			
		}
		}
	
}