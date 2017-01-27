package com.nanda.dao;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

import com.nanda.model.HotelSeats;
import com.nanda.util.ConnectionUtil;

public class HotelSeatsDao {

	JdbcTemplate jdbcTemplate = ConnectionUtil.getJdbcTemplate();
	public void save(HotelSeats HotelSeatsobj)
	{
		String sql = "insert into Hotel_seats(Seat_no,status) values(?,?)";
		Object[] params = {HotelSeatsobj.getSeatNo(),HotelSeatsobj.getStatus() };
		int rows = jdbcTemplate.update(sql, params);
		System.out.println("No of rows inserted: " + rows);

	}
	
	public void update(HotelSeats HotelSeatsobj) {
		String sql = "update Hotel_Seats set status=? where seat_no=?";
		Object[] params = {HotelSeatsobj.getStatus(),HotelSeatsobj.getSeatNo()};
		int rows = jdbcTemplate.update(sql, params);
		System.out.println("No of rows updated: " + rows);
	}
	
	public void delete(int id){
		String sql = "delete from hotel_seats where id=?";
		int rows = jdbcTemplate.update(sql, id);
		System.out.println("No of rows deleted: " + rows);

	}
	public void list(){
		String sql="SELECT Id,Seat_no,STATUS FROM Hotel_Seats";
		List<HotelSeats> list=jdbcTemplate.query(sql, (rs,rowNum) -> {
			HotelSeats hotelseatsobj=new HotelSeats();
			hotelseatsobj.setId(rs.getInt("id"));
			hotelseatsobj.setSeatNo(rs.getInt("seat_no"));
			hotelseatsobj.setStatus(rs.getByte("status"));
			return hotelseatsobj;
		});	
		
		for (HotelSeats h :list) {
			System.out.println(h);
			}
			}
	
}
