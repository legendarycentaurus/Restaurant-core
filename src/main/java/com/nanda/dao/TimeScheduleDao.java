package com.nanda.dao;

import java.time.LocalTime;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

import com.nanda.model.TimeSchedule;
import com.nanda.util.ConnectionUtil;

public class TimeScheduleDao {
	JdbcTemplate jdbcTemplate = ConnectionUtil.getJdbcTemplate();
	public void save(TimeSchedule TimeScheduleobj) {

		String sql = "insert into Time_schedule(id,name,start_time,end_time) values(?,?,?,?)";
		Object[] params = { TimeScheduleobj.getId(),TimeScheduleobj.getName(),TimeScheduleobj.getStartTime(),TimeScheduleobj.getEndTime() };
		int rows = jdbcTemplate.update(sql, params);
		System.out.println("No of rows inserted: " + rows);

	}

	public void update(int id,LocalTime startTime,LocalTime endTime) {

		String sql = "update Time_schedule set start_time=?,end_time=? where id=?";
		int rows = jdbcTemplate.update(sql,startTime,endTime,id);
		System.out.println("No of rows updated: " + rows);

	}

	public void delete(int id) {

		String sql = "delete from Time_schedule where id=?";
		int rows = jdbcTemplate.update(sql, id);
		System.out.println("No of rows deleted: " + rows);

	}
	public void list(){
		String sql="Select Id,Name,Start_time,End_time from Time_Schedule ";
		List<TimeSchedule> list=jdbcTemplate.query(sql,(rs,rowNum)->{
			TimeSchedule TimeScheduleobj=new TimeSchedule();
			TimeScheduleobj.setId(rs.getInt("id"));
			TimeScheduleobj.setName(rs.getString("Name"));
			TimeScheduleobj.setStartTime(rs.getTime("Start_Time").toLocalTime());
			TimeScheduleobj.setEndTime(rs.getTime("End_Time").toLocalTime());
			return TimeScheduleobj;
		});
		
		for(TimeSchedule t:list){
			
			System.out.println(t.getId()+"		"+t.getName()+"		"+t.getStartTime()+"		"+t.getEndTime());
			
		}
	}
	
	
}
