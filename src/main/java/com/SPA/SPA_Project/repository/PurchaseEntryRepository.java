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
public class PurchaseEntryRepository {

	private JdbcTemplate jdbcTemplate;
	
	@Inject
	public PurchaseEntryRepository(DataSource dataSource) {
		jdbcTemplate = new JdbcTemplate(dataSource);
	}
	
	public void fetchQuery() throws SQLException {
		Connection connect = null;
		PreparedStatement preparedStatement = null;

		try {
			connect = jdbcTemplate.getDataSource().getConnection();
			String query = "select count(*) from tbl_userlogin where userName = ? AND password = ?;";
			preparedStatement = connect.prepareStatement(query);
			
			ResultSet resultSet = preparedStatement.executeQuery();

			while (resultSet.next()) {
				Map<String, Object> result = new HashMap<String, Object>();
				result.put("user_id", resultSet.getString("user_id"));
				result.put("username", resultSet.getString("username"));
				result.put("password", resultSet.getString("password"));

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

	}
	
}
