package com.example.logplatform.controller;

import com.example.logplatform.controller.ex.*;
import com.example.logplatform.service.ex.*;
import com.example.logplatform.util.JsonResult;
import org.springframework.web.bind.annotation.ExceptionHandler;

import javax.servlet.http.HttpSession;

//控制层的基类
public class BaseController {
    public static final int OK = 200;

    //请求处理方法，自动将异常对象传递给此方法的参数列表
    @ExceptionHandler({ServiceException.class, FileUploadException.class})
    public JsonResult<Void> handleException(Throwable e) {
        JsonResult<Void> result = new JsonResult<Void>(e);
        if (e instanceof UsernameDuplicateException) {
            result.setState(4000);
            result.setMessage("用户名已经被占用");
        } else if (e instanceof UserNotFoundException) {
            result.setState(4001);
            result.setMessage("用户名不存在");
        } else if (e instanceof PasswordNotMatchException) {
            result.setState(4002);
            result.setMessage("密码错误");
        } else if (e instanceof AddressCountLimitException) {
            result.setState(4003);
            result.setMessage("超出收货地址总数");
        } else if (e instanceof AddressNotFoundException) {
            result.setState(4004);
        } else if (e instanceof AccessDeniedException) {
            result.setState(4005);
        } else if (e instanceof ProductNotFoundException) {
            result.setState(4006);
        }else if (e instanceof CartNotFoundException) {
            result.setState(4007);
        } else if (e instanceof InsertException) {
            result.setState(5000);
            result.setMessage("未知的错误");
        } else if (e instanceof UpdateException) {
            result.setState(5001);
            result.setMessage("更新数据异常");
        } else if (e instanceof DeleteException) {
            result.setState(5002);
        } else if (e instanceof FileEmptyException) {
            result.setState(6000);
        } else if (e instanceof FileSizeException) {
            result.setState(6001);
        } else if (e instanceof FileTypeException) {
            result.setState(6002);
        } else if (e instanceof FileStateException) {
            result.setState(6003);
        } else if (e instanceof FileUploadIOException) {
            result.setState(6004);
        }
        return result;
    }

    //获得当前session对象的uid
    protected final Integer getUidFromSession(HttpSession session) {
        return Integer.valueOf(
                session.getAttribute("uid").toString());
    }

    //获得当前session对象的username
    protected final String getUsernameFromSession(HttpSession session) {
        return session.getAttribute("username").toString();
    }
}
