package com.springboot.demosecurityemployeemanagementsystem.dao;

import com.springboot.demosecurityemployeemanagementsystem.entity.User;

public interface UserDao {

    User findByUserName(String userName);

    void save(User theUser);
}
