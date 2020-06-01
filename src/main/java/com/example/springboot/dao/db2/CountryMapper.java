package com.example.springboot.dao.db2;

import com.example.springboot.model.Country;

import java.util.List;

public interface CountryMapper {
    int deleteByPrimaryKey(String code);

    int insert(Country record);

    int insertSelective(Country record);

    Country selectByPrimaryKey(String code);

    int updateByPrimaryKeySelective(Country record);

    int updateByPrimaryKey(Country record);

    List<Country> selectAll();
}