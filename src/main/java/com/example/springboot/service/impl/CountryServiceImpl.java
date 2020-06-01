package com.example.springboot.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.example.springboot.dao.db2.CountryMapper;
import com.example.springboot.model.Country;
import com.example.springboot.service.CountryService;

import java.util.List;

@Service
public class CountryServiceImpl implements CountryService{

    @Resource
    private CountryMapper countryMapper;

    @Override
    public int deleteByPrimaryKey(String code) {
        return countryMapper.deleteByPrimaryKey(code);
    }

    @Override
    public int insert(Country record) {
        return countryMapper.insert(record);
    }

    @Override
    public int insertSelective(Country record) {
        return countryMapper.insertSelective(record);
    }

    @Override
    public Country selectByPrimaryKey(String code) {
        return countryMapper.selectByPrimaryKey(code);
    }

    @Override
    public int updateByPrimaryKeySelective(Country record) {
        return countryMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Country record) {
        return countryMapper.updateByPrimaryKey(record);
    }

    @Override
    public List<Country> selectAll() {
        return countryMapper.selectAll();
    }
}
