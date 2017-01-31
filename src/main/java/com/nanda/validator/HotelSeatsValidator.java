package com.nanda.validator;

import java.util.logging.Level;
import java.util.logging.Logger;

import com.nanda.exception.HotelSeatsException;
import com.nanda.model.HotelSeats;

public class HotelSeatsValidator {
	

	private final Logger logger = Logger.getLogger(HotelSeatsValidator.class.getName());

	public void validateSave(HotelSeats hotelseats)
	{
		
		if("".equals(hotelseats.getId()) || "".equals(hotelseats.getSeatNo()) || "".equals(hotelseats.getStatus()))
		{
			try {
				throw new HotelSeatsException("This field cannot be null");
			} catch (HotelSeatsException e) {
				
				  logger.log(Level.SEVERE, "HotelseatsException",e);
			}
		}	
	
	else if(hotelseats.getId()<0 || hotelseats.getSeatNo()<0)
	{
		try {
			throw new HotelSeatsException("This field should contain a value greater than 0");
		} catch (HotelSeatsException e) {
			
			  logger.log(Level.SEVERE, "HotelSeatsException",e);
		}	
		
	}
	
	}
}