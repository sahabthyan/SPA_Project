package com.SPA.SPA_Project.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

import javax.inject.Inject;
import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class LoginRepository {

	private JdbcTemplate jdbcTemplate;
	
	@Inject
	public LoginRepository(DataSource dataSource) {
		jdbcTemplate = new JdbcTemplate(dataSource);
	}
	
	public boolean fetchUserLoginQuery(String userName,String password) throws SQLException {
		Connection connect = null;
		PreparedStatement preparedStatement = null;
		boolean flag = false;
		
		try {
			connect = jdbcTemplate.getDataSource().getConnection();
			String query = "select * from tbl_userlogin where userName = ?;";
			preparedStatement = connect.prepareStatement(query);
			preparedStatement.setString(1, userName);

			ResultSet resultSet = preparedStatement.executeQuery();

			while (resultSet.next()) {
				
				if(resultSet.getString("username").equals(userName)) {
					if(resultSet.getString("password").equals(password)) {
						flag = true;
						break;
					}
				}
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (connect != null) {
				connect.close();
				preparedStatement.close();
			}
		}
		return flag;
	}
	
}
