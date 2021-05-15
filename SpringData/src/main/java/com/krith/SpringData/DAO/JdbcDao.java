package com.krith.SpringData.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.stereotype.Component;

import com.krith.SpringData.model.Circle;

@Component
public class JdbcDao {

	@Autowired
	private DataSource dataSource;
	private JdbcTemplate jdbcTemplate;
	private NamedParameterJdbcTemplate namedParameterJdbcTemplate;
	
	public Circle getCircle(int id) throws Exception {
		

		Connection con = dataSource.getConnection();
		
		PreparedStatement ps = con.prepareStatement("SELECT * FROM circle WHERE id= ?");
		ps.setInt(1,id);
		
		Circle circle = null;
		
		ResultSet rs = ps.executeQuery();
		
		if(rs.next()) {
			circle = new Circle(id,rs.getString("name"));
		}
		rs.close();
		con.close();
		return circle;
	}
	
	public int getCount() {
		String sql = "SELECT COUNT(*) FROM circle";
		//jdbcTemplate.setDataSource(dataSource);
		return jdbcTemplate.queryForObject(sql,Integer.class);
	}
	
	@SuppressWarnings("deprecation")
	public String getCircleName(int id) {
		String sql = "SELECT name FROM circle WHERE id = ?";
		return jdbcTemplate.queryForObject(sql,new Object[] {id}, String.class);
	}
	
	public DataSource getDataSource() {
		return dataSource;
	}
	
	@SuppressWarnings("deprecation")
	public Circle getCircleByJdbc(int id) {
		String sql = "SELECT * FROM circle WHERE id=?";
		return jdbcTemplate.queryForObject(sql,new Object[] {id},new CircleMapper());
	}
	
	public List<Circle> getAllCircle(){
		String sql = "SELECT * FROM circle";
		return jdbcTemplate.query(sql,new CircleMapper());
		
	}
	
	/*public void insertCircle(Circle circle) {
		String sql = "INSERT INTO circle (id, name) VALUES (?, ?)";
		jdbcTemplate.update(sql, new Object[] {circle.getId(),  circle.getName()});
	}*/

	public void insertCircle(Circle circle) {
		String sql = "INSERT INTO CIRCLE (id, name) VALUES (:id, :name)";
		SqlParameterSource namedParameters = new MapSqlParameterSource("id",circle.getId())
													.addValue("name", circle.getName());
		namedParameterJdbcTemplate.update(sql, namedParameters);
	}
	
	public void createTriangle() {
		String sql = "CREATE TABLE triangle (id INTEGER PRIMARY KEY, name VARCHAR(30))";
		jdbcTemplate.execute(sql);
	}
	
	private static class CircleMapper implements RowMapper<Circle>{

		public Circle mapRow(ResultSet resultSet, int rowNo) throws SQLException {
			Circle circle = new Circle();
			circle.setId(resultSet.getInt("id"));
			circle.setName(resultSet.getString("name"));
			return circle;
		}
		
	}
	@Autowired
	public void setDataSource(DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
		this.namedParameterJdbcTemplate = new NamedParameterJdbcTemplate(dataSource);
	}


	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}


	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
}
