package com.nanda.model;

import lombok.Data;

@Data
public class FoodSchedule {
private FoodItems food;
private TimeSchedule Time;
private int id,totalQuantity;
}
