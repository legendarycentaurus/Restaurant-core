package com.nanda.service;

import com.nanda.dao.MaximumLimitDao;
import com.nanda.exception.MaximumLimitException;
import com.nanda.model.MaximumLimit;
import com.nanda.validator.MaximumLimitValidator;

public class MaximumLimitService {

private MaximumLimitValidator MaximumLimitValidatorobj=new MaximumLimitValidator();
	
	public void save(MaximumLimit MaximumLimit) {
		try{
		MaximumLimitValidatorobj.validateSave(MaximumLimit);
		MaximumLimitDao fid=new MaximumLimitDao();
		fid.save(MaximumLimit);
		}
		catch(MaximumLimitException e){
			e.printStackTrace();
		}
	}
		
		public void update(MaximumLimit MaximumLimit) {
			try{
			MaximumLimitValidatorobj.validateSave(MaximumLimit);
			MaximumLimitDao fid=new MaximumLimitDao();
			fid.update(MaximumLimit);
			}
			catch(MaximumLimitException e){
				e.printStackTrace();
			}

	}

		public void delete(Integer number) {
			try{
			MaximumLimitValidatorobj.validateDelete(number);
			MaximumLimitDao fid=new MaximumLimitDao();
			fid.delete(number);
			}
			catch(MaximumLimitException e){
				e.printStackTrace();
			}
}
}