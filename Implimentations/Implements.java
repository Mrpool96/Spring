package com.Mark1.Sagar.Implimentations;

import com.Mark1.Sagar.Repository.Repositor;
import org.springframework.stereotype.Service;

@Service
public class Implements implements Repositor {
    @Override
    public String getdata() {
        return "welcome to SpringBoot Practice-2";
    }
}
