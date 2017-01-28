package com.nanda.model;

import java.time.LocalDateTime;

import lombok.Data;
@Data
public class OrderDetails {
	
	private int quantity,price;
	private String status;
	private LocalDateTime timeOfOrder;
	private OrderStatus orderId;
	private FoodItems foodId;
	private HotelSeats seatId;
}
