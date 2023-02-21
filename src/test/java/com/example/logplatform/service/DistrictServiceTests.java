package com.example.logplatform.service;

import com.example.logplatform.entity.Address;
import com.example.logplatform.entity.District;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.osgi.framework.ServiceException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@SpringBootTest
@RunWith(SpringRunner.class)
public class DistrictServiceTests {

    @Autowired
    private DistrictService districtService;

    @Test
    public void getByParent() {
        try {
            List<District> list = districtService.getByParent("86");
            for (District item : list) {
                System.out.println(item);
            }
        } catch (ServiceException e) {
            System.out.println(e.getClass().getSimpleName());
            System.out.println(e.getMessage());
        }
    }
}
