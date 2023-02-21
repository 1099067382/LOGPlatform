package com.example.logplatform.mapper;

import com.example.logplatform.entity.District;
import com.example.logplatform.entity.Product;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

// @RunWith(SpringRunner.class)注解是一个测试启动器，可以加载Springboot测试注解
@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductMapperTests {
    @Autowired
    private ProductMapper productMapper;

    @Test
    public void countById() {
        Integer id = 10000038;
        Product product = productMapper.findById(id);
        System.out.println(product);
    }

    @Test
    public void insert() {
        Product product = new Product();
//        product.setId(100000426);
        product.setCategoryId(163);
        product.setItemType("机械键盘");
        product.setTitle("游戏动力V98PRO");
        product.setPrice(1234L);
        product.setRent(90L);
        product.setNum(999);
        Integer rows = productMapper.insert(product);
        System.out.println("rows=" + rows);
    }

}

