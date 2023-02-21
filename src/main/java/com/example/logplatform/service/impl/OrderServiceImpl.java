package com.example.logplatform.service.impl;

import com.example.logplatform.entity.Address;
import com.example.logplatform.entity.Order;
import com.example.logplatform.entity.OrderItem;
import com.example.logplatform.mapper.OrderMapper;
import com.example.logplatform.service.AddressService;
import com.example.logplatform.service.CartService;
import com.example.logplatform.service.OrderService;
import com.example.logplatform.service.ex.*;
import com.example.logplatform.vo.CartVO;
import com.example.logplatform.vo.OrderVO;
import org.apache.ibatis.javassist.NotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.Iterator;
import java.util.List;

@Service
public class OrderServiceImpl implements OrderService {
    @Autowired
    private OrderMapper orderMapper;
    @Autowired
    private AddressService addressService;
    @Autowired
    private CartService cartService;

    @Transactional
    @Override
    public Order create(Integer aid, Integer[] cids, Integer uid, String username) {
        // 创建当前时间对象
        Date now = new Date();

        // 根据cids查询所勾选的购物车列表中的数据
        List<CartVO> carts = cartService.getVOByCids(uid, cids);

        // 计算这些商品的总价
        long totalPrice = 0;
        for (CartVO cart : carts) {
            totalPrice += cart.getRealPrice() * cart.getNum();
        }

        // 创建订单数据对象
        Order order = new Order();
        // 补全数据：uid
        order.setUid(uid);
        // 查询收货地址数据
        Address address = addressService.getByAid(aid, uid);
        // 补全数据：收货地址相关的6项
        order.setRecvName(address.getName());
        order.setRecvPhone(address.getPhone());
        order.setRecvProvince(address.getProvinceName());
        order.setRecvCity(address.getCityName());
        order.setRecvArea(address.getAreaName());
        order.setRecvAddress(address.getAddress());
        // 补全数据：totalPrice
        order.setTotalPrice(totalPrice);
        // 补全数据：status
        order.setStatus(1);
        // 补全数据：下单时间
        order.setOrderTime(now);
        // 补全数据：日志
        order.setCreatedUser(username);
        order.setCreatedTime(now);
        order.setModifiedUser(username);
        order.setModifiedTime(now);
        // 插入订单数据
        Integer rows1 = orderMapper.insertOrder(order);
        if (rows1 != 1) {
            throw new InsertException("插入订单数据时出现未知错误，请联系客服");
        }

        // 遍历carts，循环插入订单商品数据
        for (CartVO cart : carts) {
            // 创建订单商品数据
            OrderItem item = new OrderItem();
            // 补全数据：setOid(order.getOid())
            item.setOid(order.getOid());
            // 补全数据：pid, title, image, price, num
            item.setPid(cart.getPid());
            item.setTitle(cart.getTitle());
            item.setImage(cart.getImage());
            item.setPrice(cart.getRealPrice());
            item.setRent(cart.getRent());
            item.setNum(cart.getNum());
            item.setRentTime(cart.getRentTime());
            // 补全数据：4项日志
            if (cart.getRentTime()==0 | cart.getRentTime() == null){
                item.setIsReturn(1);
            }else {
                item.setIsReturn(0);
            }
            item.setCreatedUser(username);
            item.setCreatedTime(now);
            item.setModifiedUser(username);
            item.setModifiedTime(now);
            // 插入订单商品数据
            Integer rows2 = orderMapper.insertOrderItem(item);
            if (rows2 != 1) {
                throw new InsertException("插入订单商品数据时出现未知错误，请联系客服");
            }
        }

        // 返回
        return order;
    }

    @Override
    public List<OrderVO> getVOByUid(Integer uid) {
        return orderMapper.findVOByUid(uid);
    }

    @Override
    public List<OrderVO> getVOByOids(Integer uid, Integer[] oids) {
//        Iterator<OrderVO> it = list.iterator();
//        while (it.hasNext()) {
//            OrderVO order = it.next();
//            if (!oider.getUid().equals(uid)) {
//                it.remove();
//            }
//        }
//        return list;
        return null;
    }
    @Transactional
    @Override
    public void setStatus(Integer id, Integer status, String username) {
        // 根据参数id，调用orderMapper中的findByAid()查询收货地址数据
        OrderItem result = orderMapper.findByid(id);
        // 判断查询结果是否为null
        if (result == null) {
            // 是：抛出AddressNotFoundException
            throw new OrderItemNotFoundException("尝试访问的订单数据不存在");
        }

        // 判断查询结果中的uid与参数uid是否不一致(使用equals()判断)
        if (!result.getId().equals(id)) {
            // 是：抛出AccessDeniedException
            throw new OrderItemDeniedException("非法访问的异常");
        }

        // 调用addressMapper的updateDefaultByAid()将指定aid的收货地址设置为默认，并获取返回的受影响的行数
        if (status<1 || status>4){
            throw new UpdateException("设置订单状态时出现未知错误[2]");
        }else {
            Integer rows = orderMapper.updateStatusByid(id, status, username, new Date());
            // 判断受影响的行数是否不为1
            if (rows != 1) {
                throw new UpdateException("设置默认收货地址时出现未知错误[3]");
            }
        }
    }

    @Transactional
    @Override
    public void setIsReturn(Integer id, String username) {
        // 根据参数id，调用orderMapper中的findByAid()查询收货地址数据
        OrderItem result = orderMapper.findByid(id);
        // 判断查询结果是否为null
        if (result == null) {
            // 是：抛出AddressNotFoundException
            throw new OrderItemNotFoundException("尝试访问的订单数据不存在");
        }

        // 判断查询结果中的uid与参数uid是否不一致(使用equals()判断)
        if (!result.getId().equals(id)) {
            // 是：抛出AccessDeniedException
            throw new OrderItemDeniedException("非法访问的异常");
        }

        // 调用addressMapper的updateDefaultByAid()将指定aid的收货地址设置为默认，并获取返回的受影响的行数
        Integer rows = orderMapper.updateIsReturnByid(id, username, new Date());
        // 判断受影响的行数是否不为1
        if (rows != 1) {
            // 是：抛出UpdateException
            throw new UpdateException("归还订单时出现未知错误[2]");
        }
    }
}
