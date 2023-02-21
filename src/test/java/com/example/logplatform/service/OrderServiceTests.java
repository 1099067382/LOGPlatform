package com.example.logplatform.service;

import com.example.logplatform.entity.Order;
import com.example.logplatform.service.ex.ServiceException;
import com.example.logplatform.vo.CartVO;
import com.example.logplatform.vo.OrderVO;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class OrderServiceTests {

    @Autowired
    private OrderService orderService;

    @Test
    public void create() {
        try {
            Integer aid = 26;
            Integer[] cids = {4, 5, 6,7};
            Integer uid = 11;
            String username = "Red";
            Order order = orderService.create(aid, cids, uid, username);
            System.out.println(order);
        } catch (ServiceException e) {
            System.out.println(e.getClass().getSimpleName());
            System.out.println(e.getMessage());
        }
    }

    @Test
    public void getVOByUid() {
        List<OrderVO> list = orderService.getVOByUid(11);
        System.out.println("count=" + list.size());
        for (OrderVO item : list) {
            System.out.println(item);
        }
    }

    @Test
    public void setStatus() {
        try {
            Integer id = 11;
            Integer status = 4;
            String username = "Red";
            orderService.setStatus(id, status, username);
            System.out.println("OK.");
        } catch (ServiceException e) {
            System.out.println(e.getClass().getSimpleName());
            System.out.println(e.getMessage());
        }
    }
}
