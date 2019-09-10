package com.Spring3.Practice3.Controller;

import com.Spring3.Practice3.Repository.Repository;
import org.springframework.stereotype.Service;

@Service

public class Control implements Repository {
    @Override
    public String getdata() {
        return "practice 3";
    }
}
