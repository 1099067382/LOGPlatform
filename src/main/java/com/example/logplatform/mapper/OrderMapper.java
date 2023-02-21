package com.example.logplatform.mapper;

import com.example.logplatform.entity.Order;
import com.example.logplatform.entity.OrderItem;
import com.example.logplatform.vo.OrderVO;
import org.apache.ibatis.annotations.Param;

import java.util.Date;
import java.util.List;

public interface OrderMapper {

    Integer insertOrder(Order order);

    Integer insertOrderItem(OrderItem orderItem);

    List<OrderVO> findVOByUid(Integer uid);

    Integer updateStatusByid(
            @Param("id") Integer id,
            @Param("status")Integer status,
            @Param("modifiedUser") String modifiedUser,
            @Param("modifiedTime") Date modifiedTime);


    Integer updateIsReturnByid(
            @Param("id") Integer id,
            @Param("modifiedUser") String modifiedUser,
            @Param("modifiedTime") Date modifiedTime);

    OrderItem findByid(Integer id);

    Integer updateStatusByid(Integer id);
}
