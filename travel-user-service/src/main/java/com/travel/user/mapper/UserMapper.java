package com.travel.user.mapper;

import com.travel.user.entity.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author wangziping
 * @since 2020-05-18
 */
public interface UserMapper extends BaseMapper<User> {

    /**
     * 登录
     * @param user
     * @return
     */
    User login(User user);
}
