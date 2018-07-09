package com.wetwo.weshare.service.impl;

import com.wetwo.weshare.mapper.InformationMapper;
import com.wetwo.weshare.model.Information;
import com.wetwo.weshare.service.InformationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InformationServiceImpl implements InformationService {

    @Autowired
    private InformationMapper informationMapper;
    @Override
    public List<Information> get(String longitude, String latitude) {
        return informationMapper.getInformations(longitude,latitude);
    }
}
