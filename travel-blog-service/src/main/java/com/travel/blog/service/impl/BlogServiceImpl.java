package com.travel.blog.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.travel.blog.entity.Blog;
import com.travel.blog.mapper.BlogMapper;
import com.travel.blog.service.IBlogService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Arrays;
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
public class BlogServiceImpl extends ServiceImpl<BlogMapper, Blog> implements IBlogService {

    @Autowired
    private BlogMapper blogMapper;

    @Transactional
    @Override
    public void delByArray(Integer[] ids) throws Exception {
        if(ids != null && ids.length>0){
            for(Integer id : ids){
                QueryWrapper wrapper = new QueryWrapper();
                wrapper.eq("id",id);
                blogMapper.delete(wrapper);
            }
            //批量删除
            blogMapper.deleteBatchIds(Arrays.asList(ids));
        }
    }

    @Override
    public Blog getBlogsById(Integer id) {
        return blogMapper.getBlogsById(id);
    }


}
