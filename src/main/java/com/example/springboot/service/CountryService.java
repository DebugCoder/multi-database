package com.example.springboot.service;

import com.example.springboot.model.Country;

import java.util.List;

public interface CountryService{


    int deleteByPrimaryKey(String code);

    int insert(Country record);

    int insertSelective(Country record);

    Country selectByPrimaryKey(String code);

    int updateByPrimaryKeySelective(Country record);

    int updateByPrimaryKey(Country record);

    List<Country> selectAll();
}
