package com.example.logplatform.service;

import com.example.logplatform.entity.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.osgi.framework.ServiceException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
@RunWith(SpringRunner.class)
public class UserServiceTests {

    @Autowired
    private UserService userService;

    @Test
    public void register() {
        try {
            User user = new User();
            user.setUsername("test03");
            user.setPassword("123");
            userService.register(user);
            System.out.println("ok");
        } catch (ServiceException e) {
            //获取类的对象和名称
            System.out.println(e.getClass().getSimpleName());
            e.printStackTrace();
        }
    }

    @Test
    public void login() {
        User user = userService.login("test03", "123");
        System.out.println(user);
    }

    @Test
    public void changePassword() {
        try {
            Integer uid = 11;
            String username = "test03";
            String oldPassword = "123";
            String newPassword = "321";
            userService.changePassword(uid, username, oldPassword, newPassword);
            System.out.println("密码修改成功！");
        } catch (ServiceException e) {
            System.out.println("密码修改失败！" + e.getClass().getSimpleName());
            System.out.println(e.getMessage());
        }
    }

    @Test
    public void getByUid() {
        System.err.println(userService.getByUid(4));
        try {
            Integer uid = 4;
            User user = userService.getByUid(uid);
            System.out.println(user);
        } catch (ServiceException e) {
            System.out.println(e.getClass().getSimpleName());
            System.out.println(e.getMessage());
        }
    }

    @Test
    public void changeInfo() {
        try {
            User user = new User();
            Integer uid = 4;
            String username = "RedTest";
            user.setPhone("17346111215");
            user.setEmail("1099067382@qq.com");
            user.setGender(2);
            userService.changeInfo(uid, username, user);
            System.out.println("OK.");
        } catch (ServiceException e) {
            System.out.println(e.getClass().getSimpleName());
            System.out.println(e.getMessage());
        }
    }

    @Test
    public void changeAvatar() {
        try {
            Integer uid = 4;
            String username = "avatarTest";
            String avatar = "/upload/avatarTest.png";
            userService.changeAvatar(uid, username, avatar);
            System.out.println("OK");
        } catch (ServiceException e) {
            System.out.println(e.getClass().getSimpleName());
            System.out.println(e.getMessage());
        }
    }
}
