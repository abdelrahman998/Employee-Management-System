package com.springboot.demosecurityemployeemanagementsystem.dao;

import com.springboot.demosecurityemployeemanagementsystem.entity.Role;

public interface RoleDao {

	public Role findRoleByName(String theRoleName);
	
}
