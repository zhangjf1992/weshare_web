package com.wetwo.weshare.service;

import com.wetwo.weshare.model.Information;

import java.util.List;

public interface InformationService {
    List<Information> get(String longitude, String latitude);
}
