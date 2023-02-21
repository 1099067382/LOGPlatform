package com.example.logplatform.service;

import com.example.logplatform.entity.District;
import com.example.logplatform.vo.CartVO;
import com.example.logplatform.vo.OrderVO;

import java.util.List;

public interface DistrictService {
    List<District> getByParent(String parent);

    String getNameByCode(String code);
}
