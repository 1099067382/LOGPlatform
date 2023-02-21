package com.example.logplatform.controller;

import com.example.logplatform.entity.Order;
import com.example.logplatform.service.OrderService;
import com.example.logplatform.util.JsonResult;
import com.example.logplatform.vo.CartVO;
import com.example.logplatform.vo.OrderVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;
import java.util.List;

@RestController
@RequestMapping("orders")
public class OrderController extends BaseController{
    @Autowired
    private OrderService orderService;

    @RequestMapping("create")
    public JsonResult<Order> create(Integer aid, Integer[] cids, HttpSession session) {
        // 从Session中取出uid和username
        Integer uid = getUidFromSession(session);
        String username = getUsernameFromSession(session);
        // 调用业务对象执行业务
        Order data = orderService.create(aid, cids, uid, username);
        // 返回成功与数据
        return new JsonResult<Order>(OK, data);
    }

    @GetMapping({"", "/"})
    public JsonResult<List<OrderVO>> getVOByUid(HttpSession session) {
        // 从Session中获取uid
        Integer uid = getUidFromSession(session);
        // 调用业务对象执行查询数据
        List<OrderVO> data = orderService.getVOByUid(uid);
        // 返回成功与数据
        return new JsonResult<List<OrderVO>>(OK, data);
    }

    @RequestMapping("{id}/set_status")
    public JsonResult<Void> setStatus(@PathVariable("id") Integer id, HttpSession session) {
        Integer status = 4;
        String username = getUsernameFromSession(session);
        orderService.setStatus(id, status, username);
        return new JsonResult<Void>(OK);
    }

    @RequestMapping("{id}/set_isReturn")
    public JsonResult<Void> setIsReturn(@PathVariable("id") Integer id, HttpSession session) {
        String username = getUsernameFromSession(session);
        orderService.setIsReturn(id, username);
        return new JsonResult<Void>(OK);
    }
}
