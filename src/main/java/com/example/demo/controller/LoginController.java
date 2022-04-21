package com.example.demo.controller;


import com.example.demo.dao.UserRespority;
import com.example.demo.entity.Student;
import com.example.demo.entity.User;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;
import java.util.Map;

@Slf4j
@Controller
public class LoginController {
    @Autowired
    UserRespority userRespority;

    @ApiOperation("注册")
    @RequestMapping("/addone")
    public String AddOne(User user){
        userRespority.AddOne(user.id, user.username, user.password );
        return "login";
    }

    @RequestMapping("/login1")
    public String doLogin(User user, Map<String, Object> map, HttpSession session) {

        User loginUser = userRespority.getByUsernameAndPassword(user.username, user.password);
        if (loginUser != null) {
            session.setAttribute("loginUser", loginUser);
            log.info("登陆成功，用户名：" + loginUser.getUserName());
            return "redirect:/student/SelectAll";
        } else {
            map.put("msg", "用户名或密码错误");
            log.error("登陆失败");
            return "login";
        }

    }

    }





