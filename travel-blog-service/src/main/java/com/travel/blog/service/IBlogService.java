package com.travel.blog.service;

import com.travel.blog.entity.Blog;
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
public interface IBlogService extends IService<Blog> {

    void delByArray(Integer[] ids) throws Exception;

    Blog getBlogsById(Integer id);
}
