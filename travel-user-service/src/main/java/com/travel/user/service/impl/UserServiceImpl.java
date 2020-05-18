package com.travel.user.service.impl;

import com.travel.user.entity.User;
import com.travel.user.mapper.UserMapper;
import com.travel.user.service.IUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.DigestUtils;
import sun.security.provider.MD5;

import java.security.MessageDigest;

/**
 * <p>
 * 服务实现类
 * </p>
 *
 * @author wangziping
 * @since 2020-05-18
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

    @Autowired
    private UserMapper userMapper;

    /**
     * 注册/添加用户
     *
     * @param user
     * @return
     */
    @Override
    public int regist(User user) {
        // 密码加密
        user.setPassword(DigestUtils.md5DigestAsHex(user.getPassword().getBytes()));
        return userMapper.regist(user);
    }

    /**
     * 登录
     *
     * @param user
     * @return
     */
    @Override
    public User login(User user) {
        // 密码加密
        user.setPassword(DigestUtils.md5DigestAsHex(user.getPassword().getBytes()));
        return userMapper.login(user);
    }

    /**
     * 根据id修改用户信息
     *
     * @param user
     * @return
     */
    @Override
    public int updateUserById(User user) {
        if (user.getPassword() != null && !"".equals(user.getPassword())){
            // 密码加密
            user.setPassword(DigestUtils.md5DigestAsHex(user.getPassword().getBytes()));
        }
        return userMapper.updateUserById(user);
    }

    /**
     * 根据id查询
     * @param id
     * @return
     */
    @Override
    public User findById(Integer id) {
        return userMapper.findById(id);
    }
}
