package com.example.SpringJDBC.SpringJdbc.repository;

import com.example.SpringJDBC.SpringJdbc.model.Movies;

import java.util.List;
import java.util.Map;

public interface MoviesRepo {
    List<Movies>getData(String year);
    String insert(Movies movies);
    String update(Integer id,String name,String year);
    String delete(Integer id);
    List<Map<String,Object>>getCombinedData();

}
