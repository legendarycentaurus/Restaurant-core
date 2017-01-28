package com.nanda.dao;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

import com.nanda.model.MaximumLimit;
import com.nanda.util.ConnectionUtil;

public class MaximumLimitDao {

	JdbcTemplate jdbcTemplate = ConnectionUtil.getJdbcTemplate();
	public void save(MaximumLimit MaxiumLimitobj) {

		String sql = "insert into Maximum_limit(id,max_order,type) values(?,?,?)";
		Object[] params = { MaxiumLimitobj.getId(),MaxiumLimitobj.getMaxOrder(),MaxiumLimitobj.getType() };
		int rows = jdbcTemplate.update(sql, params);
		System.out.println("No of rows inserted: " + rows);

	}

	public void update(MaximumLimit MaxiumLimitobj) {

		String sql = "update Maximum_limit set max_order=? where id=?";
		Object[] params = { MaxiumLimitobj.getMaxOrder(), MaxiumLimitobj.getId() };
		int rows = jdbcTemplate.update(sql, params);
		System.out.println("No of rows updated: " + rows);

	}

	public void delete(int id) {

		String sql = "delete from Maximum_limit where id=?";
		int rows = jdbcTemplate.update(sql, id);
		System.out.println("No of rows deleted: " + rows);

	}
	public void list(){
		String sql="select ID,Max_order,Type from Maximum_Limit";
		List<MaximumLimit> maxlimit= jdbcTemplate.query(sql,(rs,rowNum)->{
			MaximumLimit maximumlimitobj=new MaximumLimit();
			maximumlimitobj.setId(rs.getInt("id"));
			maximumlimitobj.setMaxOrder(rs.getInt("Max_order"));
			maximumlimitobj.setType(rs.getString("Type"));
			return maximumlimitobj;
			
		});
		 for(MaximumLimit m:maxlimit){
			 System.out.println(m);
		 }
		
	}
}
