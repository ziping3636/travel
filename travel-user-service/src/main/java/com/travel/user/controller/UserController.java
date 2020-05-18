package com.travel.user.controller;


import com.travel.user.entity.User;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author wangziping
 * @since 2020-05-18
 */
@RestController
@RequestMapping("/user")
public class UserController {


    @RequestMapping("/getInfo")
    public User getInfo() {
        User user = new User();
        user.setId(1).setName("zhangsan");
        return user;
    }

}

