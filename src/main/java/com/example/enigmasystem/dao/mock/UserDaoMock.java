package com.example.enigmasystem.dao.mock;

import com.example.enigmasystem.dao.interfaces.UserDao;
import com.example.enigmasystem.models.User;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class UserDaoMock implements UserDao {
    List<User> users = new ArrayList<>();
    public UserDaoMock(){
        users.add(new User("User1", 1));
        users.add(new User("User2", 2));
        users.add(new User("User3", 3));
    }
    @Override
    public User getUserById(int id) {
        return users.get(id);
    }

    public void addUser(User user){
        users.add(user);
    }
}
