package com.nanda.dao;

import java.time.LocalTime;

import com.nanda.model.TimeSchedule;
import com.nanda.service.TimeScheduleService;

public class TestTimeScheduleDao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TimeSchedule TimeScheduleobj = new TimeSchedule();
		TimeScheduleDao TimeScheduleDaoobj =new TimeScheduleDao();
		TimeScheduleService TimeScheduleServiceobj=new TimeScheduleService();
//insert
		TimeScheduleobj.setId(5);
		TimeScheduleobj.setName("summa");
		TimeScheduleobj.setStartTime(LocalTime.parse("15:00:00"));
		TimeScheduleobj.setEndTime(LocalTime.parse("15:00:00"));
		TimeScheduleServiceobj.save(TimeScheduleobj);
		//update
		TimeScheduleDaoobj.update(5, LocalTime.parse("15:00:00"), LocalTime.parse("18:00:00"));
		
//		//Delete
//	TimeScheduleDaoobj.delete(5);
//	
//		TimeScheduleDaoobj.list();
	}

}
