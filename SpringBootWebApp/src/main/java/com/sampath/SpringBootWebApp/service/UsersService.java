package com.sampath.SpringBootWebApp.service;

import com.sampath.SpringBootWebApp.dao.UserRepository;
import com.sampath.SpringBootWebApp.model.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsersService {
    @Autowired
    private UserRepository repo;

    public void addUser(Users user)
    {
        repo.save(user);
        System.out.println("User added to Database");
    }
}
