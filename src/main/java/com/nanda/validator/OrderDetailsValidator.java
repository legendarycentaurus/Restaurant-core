package com.nanda.validator;

import com.nanda.exception.OrderDetailsException;
import com.nanda.model.OrderDetails;
import com.nanda.util.IntegerService;
import com.nanda.util.StringService;

public class OrderDetailsValidator {

	private final StringService StringServiceobj=new StringService();
	private final IntegerService IntegerServiceobj = new IntegerService();
	
	public void validateSave(OrderDetails OrderDetails) throws OrderDetailsException
	{
		isString(OrderDetails);
		isInteger(OrderDetails);
	}
	
		
	public void isString(OrderDetails OrderDetails) throws OrderDetailsException{
			if(StringServiceobj.isInValid(OrderDetails.getStatus())) {
					throw new OrderDetailsException("This field cannot be null");
						
			}
	}
	
	public void isInteger(OrderDetails OrderDetails) throws OrderDetailsException{
		if(IntegerServiceobj.isNotValid(OrderDetails.getOrderId().getId()) ||
				IntegerServiceobj.isNotValid(OrderDetails.getFoodId().getId()) ||
				IntegerServiceobj.isNotValid(OrderDetails.getQuantity()) ||
				IntegerServiceobj.isNotValid(OrderDetails.getPrice()) ||
				IntegerServiceobj.isNotValid(OrderDetails.getSeatId().getId())){
			throw new OrderDetailsException("Enter avalue greater than zero");
		}
		
	}
	
}
