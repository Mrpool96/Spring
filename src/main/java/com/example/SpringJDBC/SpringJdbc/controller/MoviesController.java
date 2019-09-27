package com.example.SpringJDBC.SpringJdbc.controller;

import com.example.SpringJDBC.SpringJdbc.dao.MoviesDao;
import com.example.SpringJDBC.SpringJdbc.model.Movies;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
public class MoviesController {
    @Autowired
    MoviesDao moviesDao;
    @GetMapping(value = "/getData/{year}")
    List<Movies>getData(@PathVariable String year){
        List<Movies>list=moviesDao.getData(year);
        return list;

    }
    @PostMapping(value = "insertData")
    String insert(@RequestBody Movies movies){
        String insert=moviesDao.insert(movies);
        return insert;
    }
    @PutMapping(value = "/update/{id}/{name}/{year}")
    String update(@PathVariable Integer id,@PathVariable String name,@PathVariable String year){
        String update=moviesDao.update(id,name,year);
        return update;
    }
    @PutMapping(value = "/delete/{id}")
    String delete(@PathVariable Integer id){
        String delete =moviesDao.delete(id);
        return delete;
    }
    @GetMapping(value = "/getCombinedData")
    List<Map<String, Object>>getCombinedData(){
        List<Map<String,Object>>list=moviesDao.getCombinedData();
        return list;
    }


}
