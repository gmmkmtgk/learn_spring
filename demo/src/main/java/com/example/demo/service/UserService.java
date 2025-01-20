package com.example.demo.service;

import com.example.demo.api.model.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {

    private List<User> userList;

    public UserService() {
        userList = new ArrayList<>();

        // Initialize some sample users
        userList.add(new User(1, "John Doe", 25, "johndoe@example.com"));
        userList.add(new User(2, "Jane Smith", 30, "janesmith@example.com"));
        userList.add(new User(3, "Alice Johnson", 28, "alicejohnson@example.com"));
    }

    // Retrieve a user by ID
    public User getUser(Integer id) {
        return userList.stream()
                .filter(user -> user.getId().equals(id))
                .findFirst()
                .orElse(null); // Return null if no user is found with the given ID
    }

    // Add a new user
    public void addUser(User user) {
        userList.add(user);
    }

    // Retrieve all users
    public List<User> getAllUsers() {
        return userList;
    }

    // Delete a user by ID
    public boolean deleteUser(Integer id) {
        return userList.removeIf(user -> user.getId().equals(id));
    }
}
