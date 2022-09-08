package com.example.enigmasystem.dao.interfaces;

import com.example.enigmasystem.models.User;

public interface UserDao {
    User getUserById(int id);
    void addUser(User user);
}
