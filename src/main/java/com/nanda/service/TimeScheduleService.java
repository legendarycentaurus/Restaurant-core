package com.nanda.service;

import com.nanda.dao.TimeScheduleDao;
import com.nanda.exception.TimeScheduleException;
import com.nanda.model.TimeSchedule;
import com.nanda.validator.TimeScheduleValidator;

public class TimeScheduleService {


private TimeScheduleValidator TimeScheduleValidatorobj=new TimeScheduleValidator();

	public void save(TimeSchedule TimeSchedule) {
		try{
		TimeScheduleValidatorobj.validateSave(TimeSchedule);
		TimeScheduleDao fid=new TimeScheduleDao();
		fid.save(TimeSchedule);
		}
		catch(TimeScheduleException e){
			e.printStackTrace();
		}

	}
	
	public void update(TimeSchedule TimeSchedule) {
		try{
		TimeScheduleValidatorobj.validateSave(TimeSchedule);
		TimeScheduleDao fid=new TimeScheduleDao();
		fid.save(TimeSchedule);
		}
		catch(TimeScheduleException e){
			e.printStackTrace();
		}

	}

	
	
}
