package com.travel.user.service;

import com.travel.user.entity.User;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author wangziping
 * @since 2020-05-18
 */
public interface IUserService extends IService<User> {

    /**
     * 注册/添加用户
     * @param user
     * @return
     */
    int regist(User user);

    /**
     * 登录
     * @param user
     * @return
     */
    User login(User user);

    /**
     * 根据id修改用户信息
     * @param user
     * @return
     */
    int updateUserById(User user);


    /**
     * 根据id查询
     * @param id
     * @return
     */
    User findById(Integer id);
}
