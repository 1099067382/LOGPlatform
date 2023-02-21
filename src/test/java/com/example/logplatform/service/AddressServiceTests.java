package com.example.logplatform.service;

import com.example.logplatform.entity.Address;
import com.example.logplatform.entity.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.osgi.framework.ServiceException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
@RunWith(SpringRunner.class)
public class AddressServiceTests {

    @Autowired
    private AddressService addressService;

    @Test
    public void addNewAddress() {
        try {
            Integer uid = 20;
            String username = "Red";
            Address address = new Address();
            address.setName("真红");
            address.setPhone("17346111215");
            address.setAddress("台江区乃裳园");
            addressService.addNewAddress(uid, username, address);
            System.out.println("OK.");
        } catch (ServiceException e) {
            System.out.println(e.getClass().getSimpleName());
            System.out.println(e.getMessage());
        }
    }

    @Test
    public void setDefault() {
        try {
            Integer aid = 4;
            Integer uid = 11;
            String username = "Red";
            addressService.setDefault(aid, uid, username);
            System.out.println("OK.");
        } catch (ServiceException e) {
            System.out.println(e.getClass().getSimpleName());
            System.out.println(e.getMessage());
        }
    }

    @Test
    public void delete() {
        try {
            Integer aid = 21;
            Integer uid = 11;
            String username = "明明";
            addressService.delete(aid, uid, username);
            System.out.println("OK.");
        } catch (ServiceException e) {
            System.out.println(e.getClass().getSimpleName());
            System.out.println(e.getMessage());
        }
    }
}
