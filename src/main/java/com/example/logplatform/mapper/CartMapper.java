package com.example.logplatform.mapper;

import com.example.logplatform.entity.Cart;
import com.example.logplatform.vo.CartVO;
import org.apache.ibatis.annotations.Param;

import java.util.Date;
import java.util.List;

public interface CartMapper {

    Integer insert(Cart cart);

    Integer updateNumByCid(
            @Param("cid") Integer cid,
            @Param("num") Integer num,
            @Param("modifiedUser") String modifiedUser,
            @Param("modifiedTime") Date modifiedTime);

    Cart findByUidAndPid(
            @Param("uid") Integer uid,
            @Param("pid") Integer pid);

    List<CartVO> findVOByUid(Integer uid);

    Cart findByCid(Integer cid);

    List<CartVO> findVOByCids(Integer[] cids);

    Integer deleteByCid(Integer cid);
}
