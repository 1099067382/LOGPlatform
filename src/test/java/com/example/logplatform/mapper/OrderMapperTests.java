package com.example.logplatform.mapper;

import com.example.logplatform.entity.District;
import com.example.logplatform.entity.Order;
import com.example.logplatform.entity.OrderItem;
import com.example.logplatform.vo.CartVO;
import com.example.logplatform.vo.OrderVO;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;
import java.util.List;

// @RunWith(SpringRunner.class)注解是一个测试启动器，可以加载Springboot测试注解
@RunWith(SpringRunner.class)
@SpringBootTest
public class OrderMapperTests {
    @Autowired
    private OrderMapper orderMapper;

    @Test
    public void insertOrder() {
        Order order = new Order();
        order.setUid(31);
        order.setRecvName("小王");
        Integer rows = orderMapper.insertOrder(order);
        System.out.println("rows=" + rows);
    }

    @Test
    public void insertOrderItem() {
        OrderItem orderItem = new OrderItem();
        orderItem.setOid(1);
        orderItem.setPid(2);
        orderItem.setTitle("高档铅笔");
        Integer rows = orderMapper.insertOrderItem(orderItem);
        System.out.println("rows=" + rows);
    }

    @Test
    public void findVOByUid() {
        List<OrderVO> list = orderMapper.findVOByUid(11);
        System.out.println(list);
    }

    @Test
    public void updateStatusByid() {
        Integer id = 1;
        Integer status = 0;
        String modifiedUser = "Red";
        Date modifiedTime = new Date();
        Integer rows = orderMapper.updateStatusByid(id, status, modifiedUser, modifiedTime);
        System.out.println("rows=" + rows);
    }

    @Test
    public void updateIsReturnByid() {
        Integer id = 1;
        String modifiedUser = "Red";
        Date modifiedTime = new Date();
        Integer rows = orderMapper.updateIsReturnByid(id, modifiedUser, modifiedTime);
        System.out.println("rows=" + rows);
    }

    @Test
    public void findByid() {
        Integer id = 11;
        OrderItem result = orderMapper.findByid(id);
        System.out.println(result);
    }
}

