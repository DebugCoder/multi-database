package com.example.springboot.web;

import com.example.springboot.model.Country;
import com.example.springboot.service.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("country")
public class CountryController {

    @Autowired
    CountryService countryService;

    @GetMapping("all")
    public List<Country> all() {

        return countryService.selectAll();
    }
}
