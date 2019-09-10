package com.Spring3.Practice3.Final;

import com.Spring3.Practice3.Controller.Control;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Final {

    @Autowired
    Control control;

    @GetMapping (value= "/SpringBoot Practice")
    public String getData(){
        String str=control.getdata();
                return str;
        }

    }


