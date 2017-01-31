package com.nanda.dao;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

import com.nanda.model.FoodItems;
import com.nanda.model.HotelSeats;
import com.nanda.model.OrderDetails;
import com.nanda.model.OrderStatus;
import com.nanda.util.ConnectionUtil;

public class OrderDetailsDao {

	JdbcTemplate jdbcTemplate = ConnectionUtil.getJdbcTemplate();
	public void save(OrderDetails OrderDetailsobj)
	{
		String sql = "insert into order_details(order_no,item_Id,quantity,price,seat_Id,status) "
				+ "values(?,?,?,?,?,?)";
		Object[] params = {OrderDetailsobj.getOrderId().getId(),OrderDetailsobj.getFoodId().getId(),OrderDetailsobj.getQuantity(),
				OrderDetailsobj.getPrice(),OrderDetailsobj.getSeatId().getId(),OrderDetailsobj.getStatus()	};
		int rows = jdbcTemplate.update(sql, params);
		System.out.println("No of rows inserted: " + rows);

	}
	
	
	public void update(int id,String status) {
		String sql = "update order_details set status=? where order_no=?";
		Object[] params = {status,id};
		int rows = jdbcTemplate.update(sql, params);
		System.out.println("No of rows updated: " + rows);
	}
	
	public void delete(int id){
		String sql = "delete from order_details where order_no=?";
		int rows = jdbcTemplate.update(sql, id);
		System.out.println("No of rows deleted: " + rows);
	}
		public List<OrderDetails> list(){
			
			String sql="select Order_no,Item_id,Quantity,Price,time_of_order,seat_id,Status from Order_details";
			return jdbcTemplate.query(sql, (rs,rowNum)->{
				OrderDetails OrderDetailsobj = new OrderDetails();
				OrderStatus OrderStatusobj=new OrderStatus();
				OrderStatusobj.setId(rs.getInt("Order_no"));
					
				OrderDetailsobj.setOrderId(OrderStatusobj);
				FoodItems FoodItemsobj = new FoodItems();
				FoodItemsobj.setId(rs.getInt("Item_id"));
				OrderDetailsobj.setFoodId(FoodItemsobj);
				
				OrderDetailsobj.setQuantity(rs.getInt("Quantity"));
				OrderDetailsobj.setPrice(rs.getInt("price"));
				OrderDetailsobj.setTimeOfOrder(rs.getTimestamp("Time_Of_order").toLocalDateTime());
				
				HotelSeats HotelSeatsobj = new HotelSeats();
				HotelSeatsobj.setId(rs.getInt("seat_id"));
				OrderDetailsobj.setSeatId(HotelSeatsobj);
				OrderDetailsobj.setStatus(rs.getString("Status"));
		
				return OrderDetailsobj;
			});
			
		//	System.out.println("summa");
			
	
		}
}	
	
