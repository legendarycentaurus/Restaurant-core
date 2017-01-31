package com.nanda.dao;

import com.nanda.model.MaximumLimit;
import com.nanda.service.MaximumLimitService;

public class TestMaximumLimitDao {
public static void main(String[] args) {
	
		MaximumLimit MaxiumLimitobj=new MaximumLimit();
		MaximumLimitService MaximumLimitServiceobj=new MaximumLimitService();
		//insert
		MaxiumLimitobj.setId(1);
		MaxiumLimitobj.setMaxOrder(5);
		MaxiumLimitobj.setType("Weekday");
//		MaximumLimitServiceobj.save(MaxiumLimitobj);
	
////update
		MaxiumLimitobj.setId(1);
		MaxiumLimitobj.setMaxOrder(10);
		MaxiumLimitobj.setType("Weekday");
		MaximumLimitServiceobj.update(MaxiumLimitobj);
		
//		MaximumLimitDaoobj.delete(2);
//
//		MaximumLimitDaoobj.list();
}
}
