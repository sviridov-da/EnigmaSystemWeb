package com.example.enigmasystem.services.interfaces;

import com.example.enigmasystem.models.User;

public interface UserService {
    User getUserById(int id);
    void addUser(User user);
}
