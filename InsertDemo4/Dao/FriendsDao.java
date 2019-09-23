package com.InsertDemo.InsertDemo4.Dao;

import com.InsertDemo.InsertDemo4.Repository.FriendsRepo;
import com.InsertDemo.InsertDemo4.model.Friends;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class FriendsDao implements FriendsRepo {
@Autowired
    JdbcTemplate jdbcTemplate;
    @Override
    public List<Friends> getData(String address) {
        List<Friends> friends=jdbcTemplate.query("select * from friends where address=?",new Object[]{address},new BeanPropertyRowMapper<>(Friends.class ));

        return friends;
    }
}
