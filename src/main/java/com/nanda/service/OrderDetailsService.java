package com.nanda.service;

import com.nanda.dao.OrderDetailsDao;
import com.nanda.exception.OrderDetailsException;
import com.nanda.model.OrderDetails;
import com.nanda.validator.OrderDetailsValidator;

public class OrderDetailsService {

private OrderDetailsValidator OrderDetailsValidatorobj=new OrderDetailsValidator();
	
	public void save(OrderDetails orderdetails) {
		try{
		OrderDetailsValidatorobj.validateSave(orderdetails);
		OrderDetailsDao fid=new OrderDetailsDao();
		fid.save(orderdetails);
		}
		catch(OrderDetailsException e){
			e.printStackTrace();
		}
	}
		
		public void update(OrderDetails orderdetails) {
			try{
			OrderDetailsValidatorobj.validateSave(orderdetails);
			OrderDetailsDao fid=new OrderDetailsDao();
			fid.save(orderdetails);
			}
			catch(OrderDetailsException e){
				e.printStackTrace();
			}

	}
}
