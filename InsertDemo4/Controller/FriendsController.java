package com.InsertDemo.InsertDemo4.Controller;

import com.InsertDemo.InsertDemo4.Dao.FriendsDao;
import com.InsertDemo.InsertDemo4.model.Friends;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class FriendsController {
    @Autowired
    FriendsDao friendsDao;
    @GetMapping(value = "/address/{address}")
    List<Friends>getData(@PathVariable String address){
        List<Friends>friends=friendsDao.getData(address);
        return friends;
    }
}
