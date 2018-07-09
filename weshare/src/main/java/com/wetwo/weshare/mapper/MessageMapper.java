package com.wetwo.weshare.mapper;

import com.wetwo.weshare.model.Message;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

import java.util.List;

public interface MessageMapper {
    List<Message> getMessages(@Param("longitude") String longitude,@Param("latitude") String latitude);
}
