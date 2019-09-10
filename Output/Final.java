package com.Mark1.Sagar.Output;

import com.Mark1.Sagar.Implimentations.Implements;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Final {
    @Autowired
    Implements Implements;
    @GetMapping(value="/Welcome")
    public String getData(){
        String str=Implements.getdata();
        return str;


    }


}
