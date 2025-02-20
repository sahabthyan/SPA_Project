package com.SPA.SPA_Project.service;

import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.SPA.SPA_Project.repository.LoginRepository;

@Service
public class LoginService {

	@Autowired
	LoginRepository loginRepository;
	
	public boolean userLogin(String userName, String password) {
		boolean flag = false;
		try {
			flag = loginRepository.fetchUserLoginQuery(userName, password);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return flag;
	}
}
