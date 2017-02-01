package com.nanda.service;

import com.nanda.dao.HotelSeatsDao;
import com.nanda.exception.HotelSeatsException;
import com.nanda.model.HotelSeats;
import com.nanda.validator.HotelSeatsValidator;

public class HotelSeatsService {

	
private HotelSeatsValidator HotelSeatsValidatorobj=new HotelSeatsValidator();
	
	public void save(HotelSeats HotelSeats) {
		try{
		HotelSeatsValidatorobj.validateSave(HotelSeats);
		HotelSeatsDao fid=new HotelSeatsDao();
		fid.save(HotelSeats);
		}
		catch(HotelSeatsException e){
			e.printStackTrace();
		}

	}
	
	public void update(HotelSeats HotelSeats) {
		try{
		HotelSeatsValidatorobj.validateSave(HotelSeats);
		HotelSeatsDao fid=new HotelSeatsDao();
		fid.update(HotelSeats);
		}
		catch(HotelSeatsException e){
			e.printStackTrace();
		}

	}
	public void delete(Integer number) {
		try{
		HotelSeatsValidatorobj.delete(number);
		HotelSeatsDao fid=new HotelSeatsDao();
		fid.delete(number);
		}
		catch(HotelSeatsException e){
			e.printStackTrace();
		}

	}

}
