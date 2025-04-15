package com.sampath.SpringBootWebApp.dao;

import com.sampath.SpringBootWebApp.model.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class UserRepository {
    @Autowired
    private JdbcTemplate jdbc;
    public void save(Users user)
    {
        String sql="insert into users values(?,?,?)";
        jdbc.update(sql,user.getUid(),user.getName(),user.getEmail());
    }
}
