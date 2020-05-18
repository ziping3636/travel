package com.travel.blog.service.impl;

import com.travel.blog.entity.Blog;
import com.travel.blog.mapper.BlogMapper;
import com.travel.blog.service.IBlogService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * InnoDB free: 5120 kB 服务实现类
 * </p>
 *
 * @author yjj
 * @since 2020-05-18
 */
@Service
public class BlogServiceImpl extends ServiceImpl<BlogMapper, Blog> implements IBlogService {

}
