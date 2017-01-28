package com.nanda.dao;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

import com.nanda.model.OrderStatus;
import com.nanda.util.ConnectionUtil;

public class OrderStatusDao {

	/**
	 * java doc
	 */
	JdbcTemplate jdbcTemplate = ConnectionUtil.getJdbcTemplate();
	public void save(OrderStatus OrderStatusobj) {

		String sql = "insert into Order_status(id,status,total_price) values(?,?,?)";
		Object[] params = { OrderStatusobj.getId(),OrderStatusobj.getStatus(),OrderStatusobj.getTotalPrice() };
		int rows = jdbcTemplate.update(sql, params);
		System.out.println("No of rows inserted: " + rows);

	}

	public void update(OrderStatus OrderStatusobj) {

		String sql = "update Order_status set total_price=? where id=?";
		Object[] params = { OrderStatusobj.getTotalPrice(),OrderStatusobj.getId() };
		int rows = jdbcTemplate.update(sql, params);
		System.out.println("No of rows updated: " + rows);

	}

	public void delete(int id) {

		String sql = "delete from Order_status where id=?";
		int rows = jdbcTemplate.update(sql, id);
		System.out.println("No of rows deleted: " + rows);

	}
	
	public void list(){
			String sql="select Id,Status,Total_price from Order_Status";
			List<OrderStatus> list=jdbcTemplate.query(sql, (rs,rowNum)->{
			OrderStatus orderstatusobj=new OrderStatus();
			orderstatusobj.setId(rs.getInt("id"));
			orderstatusobj.setStatus(rs.getString("Status"));
			orderstatusobj.setTotalPrice(rs.getInt("Total_price"));
			return orderstatusobj;
			});
			
	for(OrderStatus o:list){
		System.out.println(o);
	}
	}
	
}
