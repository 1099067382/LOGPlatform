package com.example.logplatform.mapper;

import com.example.logplatform.entity.Address;
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
public class AddressMapperTests {
    @Autowired
    private AddressMapper addressMapper;

    @Test
    public void insert() {
        Address address = new Address();
        address.setUid(21);
        address.setName("Red");
        address.setPhone("17346111215");
        address.setAddress("台江区乃裳圆");
        Integer rows = addressMapper.insert(address);
        System.out.println("rows=" + rows);
    }

    @Test
    public void countByUid() {
        Integer uid = 21;
        Integer count = addressMapper.countByUid(uid);
        System.out.println("count=" + count);
    }

    @Test
    public void findByUid() {
        Integer uid = 11;
        List<Address> list = addressMapper.findByUid(uid);
        System.out.println("count=" + list.size());
        for (Address item : list) {
            System.out.println(item);
        }
    }

    @Test
    public void findByAid() {
        Integer aid = 1;
        Address result = addressMapper.findByAid(aid);
        System.out.println(result);
    }

    @Test
    public void updateDefaultByAid() {
        Integer aid = 1;
        String modifiedUser = "真红";
        Date modifiedTime = new Date();
        Integer rows = addressMapper.updateDefaultByAid(aid, modifiedUser, modifiedTime);
        System.out.println("rows=" + rows);
    }

    @Test
    public void updateNonDefaultByUid() {
        Integer uid = 2;
        Integer rows = addressMapper.updateNonDefaultByUid(uid);
        System.out.println("rows=" + rows);
    }

    @Test
    public void deleteByAid() {
        Integer aid = 4;
        Integer rows = addressMapper.deleteByAid(aid);
        System.out.println("rows=" + rows);
    }

    @Test
    public void findLastModified() {
        Integer uid = 21;
        Address result = addressMapper.findLastModified(uid);
        System.out.println(result);
    }
}

