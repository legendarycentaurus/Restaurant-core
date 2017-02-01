package com.nanda.validator;

import com.nanda.exception.MaximumLimitException;
import com.nanda.model.MaximumLimit;
import com.nanda.util.IntegerService;
import com.nanda.util.StringService;

public class MaximumLimitValidator {
	
	private final StringService StringServiceobj=new StringService();
	private final IntegerService IntegerServiceobj = new IntegerService();
	
	public void validateSave(MaximumLimit MaximumLimit) throws MaximumLimitException
	{
		isString(MaximumLimit);
		isInteger(MaximumLimit);
	}
		
	public void isString(MaximumLimit MaximumLimit) throws MaximumLimitException{
			if(StringServiceobj.isInValid(MaximumLimit.getType())) {
					throw new MaximumLimitException("This field cannot be null");
						
			}
	}
	
	public void isInteger(MaximumLimit MaximumLimit) throws MaximumLimitException{
		if(IntegerServiceobj.isNotValid(MaximumLimit.getId()) || IntegerServiceobj.isNotValid(MaximumLimit.getMaxOrder())){
			throw new MaximumLimitException("Enter avalue greater than zero");
		}
		
	}
	public void validateUpdate(MaximumLimit MaximumLimit) throws MaximumLimitException
	{
		
		isInteger(MaximumLimit);
	}

	public void validateDelete(Integer number) throws MaximumLimitException
	{
		
		if(IntegerServiceobj.isNotValid(number)){
			throw new MaximumLimitException("Enter avalue greater than zero");
	}


}
}