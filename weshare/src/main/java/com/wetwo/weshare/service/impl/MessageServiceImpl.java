package com.wetwo.weshare.service.impl;

import com.wetwo.weshare.mapper.MessageMapper;
import com.wetwo.weshare.model.Message;
import com.wetwo.weshare.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MessageServiceImpl implements MessageService {

    @Autowired
    private MessageMapper messageMapper;
    @Override
    public List<Message> get(String longitude, String latitude) {
        return messageMapper.getMessages(longitude,latitude);
    }
}
