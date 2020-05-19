package com.travel.blog.controller;


import com.netflix.discovery.converters.Auto;
import com.travel.blog.config.ResultEntity;
import com.travel.blog.entity.Blog;
import com.travel.blog.service.IBlogCommentService;
import com.travel.blog.service.IBlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.UUID;

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

    /**
     * 博客列表
     * @return
     */
    @RequestMapping("list")
    public List<Blog> list(){
        return iBlogService.list();
    }

    /**
     * 博客 详情 评论 以及 评论的用户
     * @param id
     * @return
     */
    @RequestMapping("getBlogById")
    public Blog getById(Integer id){
        Blog blogById = iBlogService.getBlogsById(id);
        blogById.setBlogCommentList(iBlogCommentService.getBlogCommentByBlogId(id));
        return blogById;
    }

    /**
     * 博客的添加
     * @param blog
     * @return
     */
    @PostMapping("insert")
    public boolean insert(@RequestBody Blog blog){
        return iBlogService.save(blog);
    }

    /**
     * 修改博客
     * @param blog
     * @return
     */
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

    @RequestMapping("/upload")
    public ResultEntity upload(MultipartFile file) {
        try {
            if (file!= null &&!file.isEmpty()) {
                String path = "d:\\pic\\";
                String newFileName = UUID.randomUUID()+ "_" + file.getOriginalFilename();
                File file1 = new File(path, newFileName);
                file.transferTo(file1);
                return ResultEntity.ok("http://localhost:91/img/"+newFileName);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return ResultEntity.error("上传失败");
    }

}

