package com.nanda.dao;


import java.time.LocalDateTime;
import java.util.List;

import com.nanda.model.FoodItems;
import com.nanda.model.HotelSeats;
import com.nanda.model.OrderDetails;
import com.nanda.model.OrderStatus;

public class TestOrderDetailsDao {
public static void main(String[] args) {

	OrderDetails OrderDetailsobj=new OrderDetails();
	OrderDetailsDao OrderDetailsDaoobj=new OrderDetailsDao();

	OrderStatus OrderStatusobj=new OrderStatus();
	OrderStatusobj.setId(1000);
	OrderDetailsobj.setOrderId(OrderStatusobj);//1
	FoodItems FoodItemsobj=new FoodItems();
	FoodItemsobj.setId(1);
	OrderDetailsobj.setFoodId(FoodItemsobj);//2
	OrderDetailsobj.setQuantity(5);//3
	OrderDetailsobj.setPrice(5);//4
	OrderDetailsobj.setTimeOfOrder(LocalDateTime.now());//5
	HotelSeats HotelSeatsobj=new HotelSeats();
	HotelSeatsobj.setId(2);
	OrderDetailsobj.setSeatId(HotelSeatsobj);//6
	OrderDetailsobj.setStatus("Success");//7
	
	
	OrderDetailsDaoobj.save(OrderDetailsobj);
	//update 
	
	OrderDetailsDaoobj.update(1000, "Cancelled");
	
	//delete
	//OrderDetailsDaoobj.delete(1000);
	
	
	List<OrderDetails> list= OrderDetailsDaoobj.list();
	for(OrderDetails o: list){
	
						System.out.println(o.getOrderId().getId()+"		"+o.getFoodId().getId()+"		"+o.getQuantity()+"		"+o.getPrice()+"		"+o.getTimeOfOrder()+"		"+o.getSeatId().getId()
		+"		"+o.getStatus());
	
	}
	
}
}
