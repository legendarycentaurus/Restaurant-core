package com.nanda.dao;

import com.nanda.model.OrderStatus;
import com.nanda.service.OrderStatusService;

public class TestOrderStatusDao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OrderStatus OrderStatusobj=new OrderStatus();
		OrderStatusDao OrderStatusDaoobj=new OrderStatusDao();
		OrderStatusService OrderStatusServiceobj=new OrderStatusService();
		
		//insert
		OrderStatusobj.setId(1000);
		OrderStatusobj.setStatus("meow");
		OrderStatusobj.setTotalPrice(210);
		OrderStatusServiceobj.save(OrderStatusobj);
	//update
		OrderStatusobj.setId(1000);
		OrderStatusobj.setStatus("meow");
		OrderStatusobj.setTotalPrice(210);
		OrderStatusServiceobj.update(OrderStatusobj);
	
	///delete
		OrderStatusServiceobj.delete(1000);
		OrderStatusDaoobj.list();
	
	}
	

}
