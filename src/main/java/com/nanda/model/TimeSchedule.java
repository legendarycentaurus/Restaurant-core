package com.nanda.model;

import java.time.LocalTime;

import lombok.Data;
@Data
public class TimeSchedule {
	private int id;
	private String name;
	private LocalTime startTime,endTime;

}
