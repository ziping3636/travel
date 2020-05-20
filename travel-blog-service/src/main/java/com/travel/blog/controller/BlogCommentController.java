package com.travel.blog.controller;


import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.travel.blog.config.ResultEntity;
import com.travel.blog.entity.BlogComment;
import com.travel.blog.service.IBlogCommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 * InnoDB free: 5120 kB 前端控制器
 * </p>
 *
 * @author yjj
 * @since 2020-05-18
 */
@RestController
@RequestMapping("/blog_comment/")
public class BlogCommentController {

    @Autowired
    private IBlogCommentService iBlogCommentService;

    @RequestMapping("list")
    public ResultEntity list(Page page,Integer blogId){
        return ResultEntity.ok(iBlogCommentService.selectPageVo(page,blogId));
    }

    @PostMapping("insert")
    public boolean save(@RequestBody BlogComment blogComment){
        return iBlogCommentService.save(blogComment);
    }



}

