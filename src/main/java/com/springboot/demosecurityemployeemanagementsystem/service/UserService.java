package com.springboot.demosecurityemployeemanagementsystem.service;

import com.springboot.demosecurityemployeemanagementsystem.entity.User;
import com.springboot.demosecurityemployeemanagementsystem.user.WebUser;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserService extends UserDetailsService {

	public User findByUserName(String userName);

	void save(WebUser webUser);

}
