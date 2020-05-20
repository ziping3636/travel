package com.travel.blog.mapper;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.travel.blog.entity.Blog;
import com.travel.blog.entity.BlogComment;
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
public interface BlogCommentMapper extends BaseMapper<BlogComment> {

    /**
     * 获取一篇博客的评论
     * @param blogId
     * @return
     */
    List<BlogComment> getBlogsById(Integer blogId);

    IPage<Blog> selectPageVo(Page page,Integer blogId);
}
