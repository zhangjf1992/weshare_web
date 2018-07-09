package com.wetwo.weshare.controller;

import com.wetwo.weshare.service.InformationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.json.GsonJsonParser;
import org.springframework.boot.json.JsonParser;
import org.springframework.boot.json.JsonParserFactory;
import org.springframework.http.converter.json.GsonFactoryBean;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("information")
public class InformationController {

    @Autowired
    private InformationService informationService;

    @RequestMapping("{longitude}/{latitude}")
    public String get(@PathVariable("longitude") String longitude,@PathVariable("latitude") String latitude){
        return informationService.get(longitude,latitude).toString();
    }
}
