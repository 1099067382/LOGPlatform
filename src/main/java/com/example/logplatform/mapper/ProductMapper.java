package com.example.logplatform.mapper;

import com.example.logplatform.entity.Product;
import org.apache.ibatis.annotations.Param;

import java.util.Date;
import java.util.List;

public interface ProductMapper {
    List<Product> findHotList();

    Product findById(Integer id);

    Integer insert(Product product);
}
