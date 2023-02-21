package com.example.logplatform.service;

import com.example.logplatform.entity.Address;
import com.example.logplatform.entity.Product;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.osgi.framework.ServiceException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
@RunWith(SpringRunner.class)
public class ProductServiceTests {

    @Autowired
    private ProductService productService;

    @Test
    public void addNewProduct() {
        try {
            Integer uid = 20;
            String username = "Red";
            Product product = new Product();
            product.setCategoryId(163);
            product.setItemType("机械键盘");
            product.setTitle("游戏动力V98PRO");
            product.setPrice(1234L);
            product.setRent(90L);
            product.setNum(999);
            productService.addNewProduct(username, product);
            System.out.println("OK.");
        } catch (ServiceException e) {
            System.out.println(e.getClass().getSimpleName());
            System.out.println(e.getMessage());
        }
    }
}
