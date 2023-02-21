package com.example.logplatform.service;

import com.example.logplatform.vo.CartVO;

import java.util.List;

public interface CartService {
    void addToCart(Integer uid, Integer pid, Integer rentTime, Integer amount, String username);

    List<CartVO> getVOByUid(Integer uid);

    Integer addNum(Integer cid, Integer uid, String username);

    Integer reduceNum(Integer cid, Integer uid, String username);

    List<CartVO> getVOByCids(Integer uid, Integer[] cids);

    void delete(Integer cid, Integer uid);
}