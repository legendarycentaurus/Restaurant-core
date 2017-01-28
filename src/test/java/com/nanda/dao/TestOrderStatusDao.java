package com.nanda.dao;

import com.nanda.model.OrderStatus;

public class TestOrderStatusDao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OrderStatus OrderStatusobj=new OrderStatus();
		OrderStatusDao OrderStatusDaoobj=new OrderStatusDao();
		
	/*	//insert
		OrderStatusobj.setId(1000);
		OrderStatusobj.setStatus("meow");
		OrderStatusobj.setTotalPrice(210);
		OrderStatusDaoobj.save(OrderStatusobj);
	//update
		OrderStatusobj.setId(1000);
		OrderStatusobj.setTotalPrice(210);
		OrderStatusDaoobj.update(OrderStatusobj);
	
	///delete
		OrderStatusDaoobj.delete(1000);*/
		OrderStatusDaoobj.list();
	
	}
	

}
