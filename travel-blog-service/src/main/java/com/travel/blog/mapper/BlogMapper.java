package com.travel.blog.mapper;

import com.travel.blog.entity.Blog;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.List;

/**
 * <p>
 * InnoDB free: 5120 kB Mapper 接口
 * </p>
 *
 * @author yjj
 * @since 2020-05-18
 */
public interface BlogMapper extends BaseMapper<Blog> {

    Blog getBlogsById(Integer id);
}
