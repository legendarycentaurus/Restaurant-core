package com.nanda.dao;

import com.nanda.model.MaximumLimit;

public class TestMaximumLimitDao {
public static void main(String[] args) {
	
		MaximumLimit MaxiumLimitobj=new MaximumLimit();
		MaximumLimitDao MaximumLimitDaoobj=new MaximumLimitDao();
		//insert
		/*MaxiumLimitobj.setId(1);
		MaxiumLimitobj.setMaxOrder(5);
		MaxiumLimitobj.setType("Weekday");
		MaximumLimitDaoobj.save(MaxiumLimitobj);
		*/
//update
		/*MaxiumLimitobj.setId(1);
		MaxiumLimitobj.setMaxOrder(10);
		MaximumLimitDaoobj.update(MaxiumLimitobj);
		
		MaximumLimitDaoobj.delete(2);*/

		MaximumLimitDaoobj.list();
}
}
