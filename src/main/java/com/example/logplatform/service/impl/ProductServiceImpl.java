package com.example.logplatform.service.impl;

import com.example.logplatform.entity.Product;
import com.example.logplatform.mapper.ProductMapper;
import com.example.logplatform.service.ProductService;
import com.example.logplatform.service.ex.InsertException;
import com.example.logplatform.service.ex.ProductNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductMapper productMapper;

    @Override
    public List<Product> findHotList() {
        List<Product> list = productMapper.findHotList();
        for (Product product : list) {
            product.setPriority(null);
            product.setCreatedUser(null);
            product.setCreatedTime(null);
            product.setModifiedUser(null);
            product.setModifiedTime(null);
        }
        return list;
    }

    @Override
    public Product findById(Integer id) {// 根据参数id调用私有方法执行查询，获取商品数据
        Product product = productMapper.findById(id);
        // 判断查询结果是否为null
        if (product == null) {
            throw new ProductNotFoundException("尝试访问的商品数据不存在");
        }
        // 将查询结果中的部分属性设置为null
        product.setPriority(null);
        product.setCreatedUser(null);
        product.setCreatedTime(null);
        product.setModifiedUser(null);
        product.setModifiedTime(null);
        // 返回查询结果
        return product;
    }

    @Override
    public void addNewProduct(String username, Product product) {
        Date now = new Date();
        product.setCreatedUser(username);
        product.setCreatedTime(now);
        product.setModifiedUser(username);
        product.setModifiedTime(now);
        Integer rows = productMapper.insert(product);
        if (rows != 1) {
            throw new InsertException("数据时出现未知错误，请联系系统管理员！");
        }
    }
}
