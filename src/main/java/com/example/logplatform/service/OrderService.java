package com.example.logplatform.service;

import com.example.logplatform.entity.Order;
import com.example.logplatform.vo.OrderVO;

import java.util.List;

public interface OrderService {
    Order create(Integer aid, Integer[] cids, Integer uid, String username);

    List<OrderVO> getVOByUid(Integer uid);

    List<OrderVO> getVOByOids(Integer uid, Integer[] oids);

    void setStatus(Integer id, Integer status, String username);

    void setIsReturn(Integer id, String username);
}
