package com.example.logplatform.mapper;

import com.example.logplatform.entity.District;

import java.util.List;

public interface DistrictMapper {
    List<District> findByParent(String parent);

    String findNameByCode(String code);
}
