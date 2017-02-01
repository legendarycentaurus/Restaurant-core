package com.nanda.validator;

import com.nanda.exception.HotelSeatsException;
import com.nanda.model.HotelSeats;
import com.nanda.util.ByteService;
import com.nanda.util.IntegerService;

public class HotelSeatsValidator {
	IntegerService IntegerServiceobj=new IntegerService();
	ByteService ByteServiceobj=new ByteService();
	public void validateSave(HotelSeats hotelseatsobj) throws HotelSeatsException{
		
		save(hotelseatsobj);
		
	}
	public void save(HotelSeats hotelseatsobj) throws HotelSeatsException{
		if( IntegerServiceobj.isNotValid(hotelseatsobj.getSeatNo())
				|| ByteServiceobj.isNotValid(hotelseatsobj.getStatus())){
			throw new HotelSeatsException("Enter a value greater than zero status should be 1 or 0");
		}
		
	}
	public void delete(Integer number) throws HotelSeatsException{
		if(IntegerServiceobj.isNotValid(number))
				{
			throw new HotelSeatsException("Invalid Seat Id");
		}
	}
	

}

