package com.travel.blog.service;

import com.travel.blog.entity.BlogComment;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 * InnoDB free: 5120 kB 服务类
 * </p>
 *
 * @author yjj
 * @since 2020-05-18
 */
public interface IBlogCommentService extends IService<BlogComment> {

    //根据博客ID 查询  博客的评论
    List<BlogComment> getBlogCommentByBlogId(Integer blogId);
}