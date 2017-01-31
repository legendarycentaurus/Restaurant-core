package com.nanda.validator;


import com.nanda.exception.TimeScheduleException;
import com.nanda.model.TimeSchedule;
import com.nanda.util.IntegerService;
import com.nanda.util.StringService;;
public class TimeScheduleValidator {

	private StringService StringServiceobj = new StringService();
	private final IntegerService IntegerServiceobj = new IntegerService();
	public void validateSave(TimeSchedule timeschedule) throws TimeScheduleException{
		
		isString(timeschedule);
		isInteger(timeschedule);
	}
	public void isString(TimeSchedule timeschedule) throws TimeScheduleException{
		if(StringServiceobj.isInValid(timeschedule.getName())){
			throw new TimeScheduleException("This field cannot be null");
			
		}
	}
		public void isInteger(TimeSchedule timeschedule) throws TimeScheduleException{
			if(IntegerServiceobj.isNotValid(timeschedule.getId())){
				throw new TimeScheduleException("Enter avalue greater than zero");
			}
	}
}
