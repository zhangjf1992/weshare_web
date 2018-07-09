package com.wetwo.weshare.mapper;

import com.wetwo.weshare.model.Information;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

import java.util.List;

public interface InformationMapper {
    List<Information> getInformation(@Param("longitude") String longitude,@Param("latitude") String latitude);
}
