package com.travel.blog.service.impl;

import com.travel.blog.entity.BlogComment;
import com.travel.blog.mapper.BlogCommentMapper;
import com.travel.blog.mapper.BlogMapper;
import com.travel.blog.service.IBlogCommentService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 * InnoDB free: 5120 kB 服务实现类
 * </p>
 *
 * @author yjj
 * @since 2020-05-18
 */
@Service
public class BlogCommentServiceImpl extends ServiceImpl<BlogCommentMapper, BlogComment> implements IBlogCommentService {

    @Autowired
    private BlogCommentMapper blogCommentMapper;

    @Override
    public List<BlogComment> getBlogCommentByBlogId(Integer blogId) {
        return blogCommentMapper.getBlogsById(blogId);
    }
}
