package com.nanda.validator;

import java.util.logging.Level;
import java.util.logging.Logger;

import com.nanda.exception.FoodItemsException;
import com.nanda.model.FoodItems;

public class FoodItemsValidator {

	
	private final Logger logger = Logger.getLogger(FoodItemsValidator.class.getName());

	public void validateSave(FoodItems fooditems)
	{
		
		if("".equals(fooditems.getItemName()) || "".equals(fooditems.getId()) || "".equals(fooditems.getPrice()))
		{
			try {
				throw new FoodItemsException("This field cannot be null");
			} catch (FoodItemsException e) {
				
				  logger.log(Level.SEVERE, "FoodItemsException",e);
			}
		}	

			else if(fooditems.getId()<0)
			{
				try {
					throw new FoodItemsException("Invalid FoodID");
				} catch (FoodItemsException e) {
					
					  logger.log(Level.SEVERE, "FoodItemsException",e);
				}	
			}
				else if(fooditems.getPrice()<0){
					
					try{
						throw new FoodItemsException("Invalid Price");
					} catch(FoodItemsException e)
					{
						logger.log(Level.SEVERE, "FoodItemsException",e);
						
					}
				}
			
		}
	
}
