package com.example.logplatform.service;

import com.example.logplatform.entity.User;
import org.apache.ibatis.annotations.Param;

import java.util.Date;

// 用户模块业务层接口
public interface UserService {
    //用户注册方法
    void register(User user);

    //用户登录方法
    User login(String username, String password);

    //用户修改密码方法
    void changePassword(Integer uid, String username, String oldPassword, String newPassword);

    User getByUid(Integer uid);

    void changeInfo(Integer uid, String username, User user);

    void changeAvatar(Integer uid, String username, String avatar);
}
