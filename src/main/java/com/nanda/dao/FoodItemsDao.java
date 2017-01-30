package com.nanda.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;
import java.util.List;
import java.util.Map;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.SqlOutParameter;
import org.springframework.jdbc.core.SqlParameter;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.simple.SimpleJdbcCall;

import com.nanda.model.FoodItems;
import com.nanda.util.ConnectionUtil;

public class FoodItemsDao {

	JdbcTemplate jdbcTemplate = ConnectionUtil.getJdbcTemplate();
	public void save(FoodItems fooditemsobj) {

		String sql = "insert into Food_items(item_name,price) values(?,?)";
		Object[] params = { fooditemsobj.getItemName(),fooditemsobj.getPrice() };
		int rows = jdbcTemplate.update(sql, params);
		System.out.println("No of rows inserted: " + rows);

	}

	public void update(FoodItems fooditemsobj) {

		String sql = "update food_items set price=? where id=?";
		Object[] params = { fooditemsobj.getPrice(), fooditemsobj.getId() };
		int rows = jdbcTemplate.update(sql, params);
		System.out.println("No of rows updated: " + rows);

	}

	public void delete(int id) {

		String sql = "delete from food_items where id=?";
		int rows = jdbcTemplate.update(sql, id);
		System.out.println("No of rows deleted: " + rows);

	}

	public List<FoodItems> list() {
		final String sql = "Select ID,ITEM_NAME,price from food_items";
		return jdbcTemplate.query(sql, (rs, rowNum) -> {
		 FoodItems item = convert(rs);
			return item;
		});
	}
	
	static FoodItems convert(ResultSet rs) throws SQLException {
		FoodItems food = new FoodItems();
		food.setId(rs.getInt("id"));
		food.setItemName(rs.getString("ITEM_NAME"));
		food.setPrice(rs.getInt("price"));
		return food;
	
}
	
	public String validateSeat(int Seatno) {
		String sql = "SELECT FN_CHECK_seat(?)";
		Object[] params = { Seatno };
		String isAvailable = jdbcTemplate.queryForObject(sql, params, String.class);
		return isAvailable;
	}
	
	public String validateItemName(String itemName) {
		String sql = "SELECT FN_CHECK_ITEM(?)";
		Object[] params = { itemName };
		String isAvailable = jdbcTemplate.queryForObject(sql, params, String.class);
		return isAvailable;
	}
	
	
	public String validateQuantity(int quantity){
		String sql="SELECT FN_CHECK_QUANTITY(?)";
		Object[] params={ quantity };
		String isAvailable=jdbcTemplate.queryForObject(sql,params,String.class);
		return isAvailable;
	}
	
	public Integer generateOrder(){
		String sql="SELECT FN_GENERATE_ORDER()";
		Integer orderNo=jdbcTemplate.queryForObject(sql,Integer.class);
		return orderNo;
		
	}
	
	public String ShowBill(int orderId) {

		SimpleJdbcCall call = new SimpleJdbcCall(jdbcTemplate);
		call.withProcedureName("pr_show_bill");
		call.declareParameters(new SqlParameter("i_order_id", Types.INTEGER),
				new SqlOutParameter("Message", Types.VARCHAR));
		call.setAccessCallParameterMetaData(false);

		MapSqlParameterSource in = new MapSqlParameterSource();
		in.addValue("i_order_id", orderId);

		Map<String, Object> execute = call.execute(in);

		String status = (String) execute.get("Message");
		return status;

	}
	
	
	public String Order(int seatNo,String Item,String Quantity) {

		SimpleJdbcCall call = new SimpleJdbcCall(jdbcTemplate);
		call.withProcedureName("pr_order");
		call.declareParameters(new SqlParameter("i_seatno", Types.VARCHAR),new SqlParameter("i_Item_list", Types.VARCHAR),new SqlParameter("i_quantity_list", Types.VARCHAR),
				new SqlOutParameter("o_message", Types.VARCHAR));
		call.setAccessCallParameterMetaData(false);

		MapSqlParameterSource in = new MapSqlParameterSource();
		in.addValue("i_seatno", seatNo).addValue("i_Item_list", Item).addValue("i_quantity_list", Quantity);

		Map<String, Object> execute = call.execute(in);

		String status = (String) execute.get("o_message");
		return status;

	}
	
	
}