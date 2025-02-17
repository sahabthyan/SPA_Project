package com.SPA.SPA_Project.DBUtils;

import java.sql.Connection;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

import javax.inject.Inject;

public class DBConnection {
	
	private static JdbcTemplate jdbcTemplate;
	
	@Inject
	public DBConnection(DataSource dataSource) {
		jdbcTemplate = new JdbcTemplate(dataSource);
	}
	public static Connection dbStartConnection() throws SQLException {
		Connection connect = null;
		try {
			connect = jdbcTemplate.getDataSource().getConnection();
		}catch(Exception e) {
			connect.close();
		}finally {
			connect.close();
		}
		return connect;
	}
}
