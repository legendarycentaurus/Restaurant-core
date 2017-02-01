package com.nanda.service;

import com.nanda.dao.OrderStatusDao;
import com.nanda.exception.OrderStatusException;
import com.nanda.model.OrderStatus;
import com.nanda.validator.OrderStatusValidator;

public class OrderStatusService {

	
private OrderStatusValidator OrderStatusValidatorobj=new OrderStatusValidator();
	
	public void save(OrderStatus orderstatus) {
		try{
		OrderStatusValidatorobj.validateSave(orderstatus);
		OrderStatusDao fid=new OrderStatusDao();
		fid.save(orderstatus);
		}
		catch(OrderStatusException e){
			e.printStackTrace();
		}
	}
		
		public void update(OrderStatus orderstatus) {
			try{
			OrderStatusValidatorobj.validateUpdate(orderstatus);
			OrderStatusDao fid=new OrderStatusDao();
			fid.update(orderstatus);
			}
			catch(OrderStatusException e){
				e.printStackTrace();
			}

	}
		public void delete(Integer number) {
			try{
			OrderStatusValidatorobj.validateDelete(number);
			OrderStatusDao fid=new OrderStatusDao();

			fid.delete(number);
			}
			catch(OrderStatusException e){
				e.printStackTrace();
			}

}

}