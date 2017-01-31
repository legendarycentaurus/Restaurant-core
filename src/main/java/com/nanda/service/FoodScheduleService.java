package com.nanda.service;

import com.nanda.dao.FoodScheduleDao;
import com.nanda.exception.FoodScheduleException;
import com.nanda.model.FoodSchedule;
import com.nanda.validator.FoodScheduleValidator;

public class FoodScheduleService {

private FoodScheduleValidator FoodScheduleValidatorobj=new FoodScheduleValidator();
	
	public void save(FoodSchedule FoodSchedule) {
		try{
		FoodScheduleValidatorobj.validateSave(FoodSchedule);
		FoodScheduleDao fid=new FoodScheduleDao();
		fid.save(FoodSchedule);
		}
		catch(FoodScheduleException e){
			e.printStackTrace();
		}

	}
	
	public void update(FoodSchedule FoodSchedule) {
		try{
		FoodScheduleValidatorobj.validateSave(FoodSchedule);
		FoodScheduleDao fid=new FoodScheduleDao();
		fid.save(FoodSchedule);
		}
		catch(FoodScheduleException e){
			e.printStackTrace();
		}

	}
	
}
