package com.example.SpringJDBC.SpringJdbc.dao;

import com.example.SpringJDBC.SpringJdbc.model.Movies;
import com.example.SpringJDBC.SpringJdbc.repository.MoviesRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@Repository
public class MoviesDao implements MoviesRepo {
    @Autowired
    JdbcTemplate jdbcTemplate;
    @Override

    public List<Movies> getData(String year) {
        List<Movies>list=jdbcTemplate.query("select*from movies where year=?",new Object[]{year},new BeanPropertyRowMapper<>(Movies.class));
        return list;
    }

    @Override
    public String insert(Movies movies) {
        jdbcTemplate.update("insert into movies values(?,?,?)",new Object[]{movies.getId(),movies.getName(),movies.getYear()});
        return "Data Has Been Entered Succesfully into Marvel's";
    }

    @Override
    public String update(Integer id, String name, String year) {
        jdbcTemplate.update("update movies set name=?, year=? where id=?",new Object[]{id,name,year});
        return "Data Has Been Updated Succesfully into Marvel's";
    }

    @Override
    public String delete(Integer id) {
        jdbcTemplate.update("delete from movies where id=?",new Object[]{id});
        return "Data Has Been Deleted Succesfully into Marvel's";
    }

    @Override
    public List<Map<String, Object>> getCombinedData() {
        List<Map<String,Object>>list=jdbcTemplate.queryForList("select a.name,a.year,b.name from movies a,phase b where a.PhaseID=b.id");
        return list;
    }
}
