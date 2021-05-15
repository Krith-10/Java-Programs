package com.krith.SpringData.DAO;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component
public class SimpleJdbcDaoImpl extends JdbcTemplate {
	
	public int getCount() {
		String sql = "SELECT COUNT(*) FROM circle";
		//jdbcTemplate.setDataSource(dataSource);
		return this.queryForObject(sql,Integer.class);
	}
}
