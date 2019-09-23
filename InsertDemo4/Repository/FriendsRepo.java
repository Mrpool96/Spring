package com.InsertDemo.InsertDemo4.Repository;

import com.InsertDemo.InsertDemo4.model.Friends;

import java.util.List;

public interface FriendsRepo {
    List<Friends>getData(String address);
}
