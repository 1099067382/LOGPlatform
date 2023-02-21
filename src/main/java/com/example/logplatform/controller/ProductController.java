package com.example.logplatform.controller;

import com.example.logplatform.entity.Product;
import com.example.logplatform.service.ProductService;
import com.example.logplatform.util.JsonResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;
import java.util.List;

@RestController
@RequestMapping("products")
public class ProductController extends BaseController {

    @Autowired
    private ProductService productService;

    @RequestMapping("hot_list")
    public JsonResult<List<Product>> getHotList() {
        List<Product> data = productService.findHotList();
        return new JsonResult<List<Product>>(OK, data);
    }

    @GetMapping("{id}/details")
    public JsonResult<Product> getById(@PathVariable("id") Integer id) {
        // 调用业务对象执行获取数据
        Product data = productService.findById(id);
        // 返回成功和数据
        return new JsonResult<Product>(OK, data);
    }

    @RequestMapping("add_new_product")
    public JsonResult<Void> addNewProduct(Product product, HttpSession session) {
        // 从Session中获取uid和username
        String username = getUsernameFromSession(session);

        // 调用业务对象的方法执行业务
        productService.addNewProduct(username, product);
        // 响应成
        return new JsonResult<Void>(OK);
    }
}
