package com.nanda.dao;

import com.nanda.model.HotelSeats;

public class TestHotelSeatsDao {

	public static void main(String[] args) {

		HotelSeats HotelSeatsobj= new HotelSeats();
		HotelSeatsDao hotelseatsdaoobj=new HotelSeatsDao();
//		insert
		/*HotelSeatsobj.setSeatNo(2);
		HotelSeatsobj.setStatus((byte)0);	
		hotelseatsdaoobj.save(HotelSeatsobj);*/
		/*
	//update			
		HotelSeatsobj.setSeatNo(2);
		HotelSeatsobj.setStatus((byte)0);
		hotelseatsdaoobj.update(HotelSeatsobj); 
	
	//Delete	
		hotelseatsdaoobj.delete(11);
		
	*/
hotelseatsdaoobj.list();	
	}
	
}
