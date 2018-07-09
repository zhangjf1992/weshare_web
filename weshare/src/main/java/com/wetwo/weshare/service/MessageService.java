package com.wetwo.weshare.service;

import com.wetwo.weshare.model.Message;

import java.util.List;

public interface MessageService {
    List<Message> get(String longitude, String latitude);
}
