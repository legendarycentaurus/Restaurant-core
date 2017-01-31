package com.nanda.dao;

import com.nanda.model.HotelSeats;
import com.nanda.service.HotelSeatsService;

public class TestHotelSeatsDao {

	public static void main(String[] args) {

		HotelSeats HotelSeatsobj= new HotelSeats();
		HotelSeatsService HotelSeatsServiceobj=new HotelSeatsService();
//		insert
		HotelSeatsobj.setSeatNo(2);
		HotelSeatsobj.setStatus((byte)11);	
		HotelSeatsServiceobj.save(HotelSeatsobj);
		
	//update			
//		HotelSeatsobj.setSeatNo(2);
//		HotelSeatsobj.setStatus((byte)0);
//		HotelSeatsServiceobj.update(HotelSeatsobj); 
//	
	//Delete	
		//HotelSeatsServiceobj.delete(11);
		
	
//HotelSeatsServiceobj.list();	
	}

	
}
