package com.nanda.service;

import com.nanda.dao.FoodItemsDao;
import com.nanda.exception.FoodItemsException;
import com.nanda.model.FoodItems;
import com.nanda.validator.FoodItemsValidator;

public class FoodItemsService {

	private FoodItemsValidator FoodItemsValidatorobj=new FoodItemsValidator();
	
	public void save(FoodItems fooditems) {
		try{
		FoodItemsValidatorobj.validateSave(fooditems);
		FoodItemsDao fid=new FoodItemsDao();
		fid.save(fooditems);
		}
		catch(FoodItemsException e){
			e.printStackTrace();
		}
	}
		
		public void update(FoodItems fooditems) {
			try{
			FoodItemsValidatorobj.validateUpdate(fooditems);
			FoodItemsDao fid=new FoodItemsDao();
			fid.update(fooditems);
			}
			catch(FoodItemsException e){
				e.printStackTrace();
			}

	}
		public void delete(Integer number ) {
			try{
			FoodItemsValidatorobj.validateDelete(number);
			FoodItemsDao fid=new FoodItemsDao();
			fid.delete(number);
			}
			catch(FoodItemsException e){
				e.printStackTrace();
			}

	}
}
