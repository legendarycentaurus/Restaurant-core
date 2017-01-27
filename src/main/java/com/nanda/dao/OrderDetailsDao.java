package com.nanda.dao;

import org.springframework.jdbc.core.JdbcTemplate;


import com.nanda.model.OrderDetails;
import com.nanda.util.ConnectionUtil;

public class OrderDetailsDao {

	JdbcTemplate jdbcTemplate = ConnectionUtil.getJdbcTemplate();
	public void save(OrderDetails OrderDetailsobj)
	{
		String sql = "insert into order_details(order_no,item_Id,quantity,price,time_of_order,seat_Id,status) "
				+ "values(?,?,?,?,?,?,?)";
		Object[] params = {OrderDetailsobj.getOrderId().getId(),OrderDetailsobj.getFoodId().getId(),OrderDetailsobj.getQuantity(),
				OrderDetailsobj.getPrice(),OrderDetailsobj.getTimeOfOrder(),OrderDetailsobj.getSeatId().getId(),OrderDetailsobj.getStatus()	};
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
	
	
}
