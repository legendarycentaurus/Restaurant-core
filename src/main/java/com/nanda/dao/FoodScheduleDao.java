package com.nanda.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

import com.nanda.model.FoodItems;
import com.nanda.model.FoodSchedule;
import com.nanda.model.HotelSeats;
import com.nanda.model.TimeSchedule;
import com.nanda.model.FoodSchedule;
import com.nanda.util.ConnectionUtil;

public class FoodScheduleDao {
		
		JdbcTemplate jdbcTemplate = ConnectionUtil.getJdbcTemplate();
		public void save(FoodSchedule FoodScheduleobj)
		{
			String sql = "insert into Food_schedule(item_Id,session_Id,total_Qty_produced) values(?,?,?)";
			Object[] params = {FoodScheduleobj.getFood().getId(),FoodScheduleobj.getTime().getId(),FoodScheduleobj.getTotalQuantity() };
			int rows = jdbcTemplate.update(sql, params);
			System.out.println("No of rows inserted: " + rows);

		}

		public void update(FoodSchedule FoodScheduleobj) {
			String sql = "update food_schedule set total_qty_produced=? where session_id=? and item_id=?";
			Object[] params = {FoodScheduleobj.getTotalQuantity(), FoodScheduleobj.getTime().getId(),FoodScheduleobj.getFood().getId() };
			int rows = jdbcTemplate.update(sql, params);
			System.out.println("No of rows updated: " + rows);

		}

		public void delete(int id){
			String sql = "delete from food_schedule where id=?";
			int rows = jdbcTemplate.update(sql, id);
			System.out.println("No of rows deleted: " + rows);

		}
		
		public List<FoodSchedule> list() {
			final String sql = "SELECT ID,SESSION_ID,ITEM_ID,TOTAL_QTY_PRODUCED FROM food_schedule";
			return jdbcTemplate.query(sql, (rs, rowNum) -> {
			 FoodSchedule item = convert(rs);
				return item;
			});
		
		}
		
		
		static FoodSchedule convert(ResultSet rs) throws SQLException {
			FoodSchedule food = new FoodSchedule();
			food.setId(rs.getInt("Id"));
			TimeSchedule TimeScheduleobj = new TimeSchedule();
			TimeScheduleobj.setId(rs.getInt("session_id"));
			food.setTime(TimeScheduleobj);
			FoodItems FoodItemsobj=new FoodItems();
			FoodItemsobj.setId(rs.getInt("item_id"));
			food.setFood(FoodItemsobj);
			food.setTotalQuantity(rs.getInt("total_qty_produced"));
			
			return food;
		}	
	

			
	}
	

