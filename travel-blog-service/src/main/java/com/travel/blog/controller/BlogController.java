package com.travel.blog.controller;


import com.netflix.discovery.converters.Auto;
import com.travel.blog.entity.Blog;
import com.travel.blog.service.IBlogCommentService;
import com.travel.blog.service.IBlogService;
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
@RequestMapping("/blog/")
public class BlogController {

    @Autowired
    private IBlogService iBlogService;

    @Autowired
    private IBlogCommentService iBlogCommentService;

    @RequestMapping("list")
    public List<Blog> list(){
        return iBlogService.list();
    }

    @RequestMapping("getBlogById")
    public Blog getById(Integer id){
        Blog blogById = iBlogService.getBlogsById(id);
        blogById.setBlogCommentList(iBlogCommentService.getBlogCommentByBlogId(id));
        return blogById;
    }

    @PostMapping("insert")
    public boolean insert(@RequestBody Blog blog){
        return iBlogService.save(blog);
    }

    @PostMapping("updata")
    public boolean updata(@RequestBody Blog blog){
        return iBlogService.updateById(blog);
    }

    /**
     * 批量删除
     */
    @RequestMapping("del")
    public boolean del(Integer ids[]){
        try{
            iBlogService.delByArray(ids);
            return true;
        }catch (Exception e){
            e.printStackTrace();
        }
        return false;
    }

}

