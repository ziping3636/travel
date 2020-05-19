package com.travel.user.controller;


import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.travel.user.config.ResultEntity;
import com.travel.user.entity.User;
import com.travel.user.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.sql.SQLException;
import java.util.UUID;

/**
 * <p>
 * 前端控制器
 * </p>
 *
 * @author wangziping
 * @since 2020-05-18
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private IUserService iUserService;

    /**
     * 查询所有用户
     *
     * @param current
     * @param size
     * @param user
     * @return
     */
    @RequestMapping("/list")
    public Page<User> selectAllUser(@RequestParam(defaultValue = "1") int current, @RequestParam(defaultValue = "5") int size, User user) {
        Page page = new Page(current, size);
        QueryWrapper wrapper = new QueryWrapper();
        if (user.getName() != null && !"".equals(user.getName())) {
            wrapper.like("name", user.getName());
        }
        return iUserService.page(page, wrapper);
    }

    /**
     * 用户注册/添加用户
     *
     * @param user
     * @return
     */
    @RequestMapping("/regist")
    public ResultEntity regist(@RequestBody User user) {
        int regist = iUserService.regist(user);
        if (regist > 0) {
            return ResultEntity.ok("注册成功");
        }
        return ResultEntity.error("注册失败");
    }

    /**
     * 用户登录
     *
     * @param user
     * @return
     */
    @RequestMapping("/login")
    public ResultEntity login(User user) {
        User login = iUserService.login(user);
        if (login != null) {
            return ResultEntity.ok(login);
        }
        return ResultEntity.error("登录失败");
    }

    /**
     * 根据id修改
     *
     * @param user
     * @return
     */
    @RequestMapping("/updateUserById")
    public ResultEntity updateUserById(User user) {
        int i = iUserService.updateUserById(user);
        if (i > 0) {
            return ResultEntity.ok("修改成功");
        }
        return ResultEntity.error("修改失败");
    }

    /**
     * 根据id查询
     *
     * @param id
     * @return
     */
    @RequestMapping("/findById")
    public ResultEntity findById(Integer id) {
        User byId = iUserService.findById(id);
        if (byId != null) {
            return ResultEntity.ok(byId);
        }
        return ResultEntity.error("没有查到具体信息");
    }

    @RequestMapping("/upload")
    public ResultEntity upload(MultipartFile file) {
        try {
            if (file != null && !file.isEmpty()) {
                String path = "d:\\pic\\";
                String newFileName = UUID.randomUUID() + "_" + file.getOriginalFilename();
                File file1 = new File(path, newFileName);
                file.transferTo(file1);
                return ResultEntity.ok("http://localhost:92/img/" + newFileName);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return ResultEntity.error("上传失败");
    }
}

