package com.nanda.validator;

import com.nanda.exception.OrderStatusException;
import com.nanda.model.OrderStatus;
import com.nanda.util.IntegerService;
import com.nanda.util.StringService;

public class OrderStatusValidator {

	private final StringService StringServiceobj=new StringService();
	private final IntegerService IntegerServiceobj = new IntegerService();
	
	public void validateSave(OrderStatus orderstatus) throws OrderStatusException
	{
		isString(orderstatus);
		isInteger(orderstatus);
	}
		
	public void isString(OrderStatus orderstatus) throws OrderStatusException{
			if(StringServiceobj.isInValid(orderstatus.getStatus())) {
					throw new OrderStatusException("This field cannot be null");
						
			}
	}
	
	public void isInteger(OrderStatus orderstatus) throws OrderStatusException{
		if(IntegerServiceobj.isNotValid(orderstatus.getId()) || IntegerServiceobj.isNotValid(orderstatus.getTotalPrice())){
			throw new OrderStatusException("Enter avalue greater than zero");
		}
		
	}
}
