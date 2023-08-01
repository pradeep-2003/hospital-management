package com.taskmanager.dao;

import com.taskmanager.model.User;

public interface UserDao {
    void registerUser(User user);
    boolean loginUser(String username, String password);
}