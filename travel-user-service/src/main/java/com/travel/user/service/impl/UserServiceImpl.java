package com.travel.user.service.impl;

import com.travel.user.entity.User;
import com.travel.user.mapper.UserMapper;
import com.travel.user.service.IUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;
import org.springframework.util.DigestUtils;
import sun.security.provider.MD5;

import java.security.MessageDigest;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

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

    @Autowired
    private RedisTemplate redisTemplate;

    /**
     * 注册/添加用户
     *
     * @param user
     * @return
     */
    @Override
    public int regist(User user) {
        // 密码加密
        if (user!=null) {
            if (user.getPassword() != null && !"".equals(user.getPassword())) {
                user.setPassword(DigestUtils.md5DigestAsHex(user.getPassword().getBytes()));
            }
        }
        user.setIsMark(1);
        return userMapper.insert(user);
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
        // 从 redis 中查询
        User travelUser = (User) redisTemplate.opsForValue().get(user.getUsername());
        if (travelUser == null) {
            System.out.println("mysql  -=-");
            User login = userMapper.login(user);
            // 存入redis 并设置过期时间
            redisTemplate.opsForValue().set(user.getUsername(), login, 30, TimeUnit.MINUTES);
            return login;
        } else {
            if (travelUser.getPassword().equals(user.getPassword())) {

                return travelUser;
            }
            System.out.println("redis  -=-");
            return null;
        }
    }

    /**
     * 根据id修改用户信息
     *
     * @param user
     * @return
     */
    @Override
    public int updateUserById(User user) {
        if (user.getPassword() != null && !"".equals(user.getPassword())) {
            // 密码加密
            user.setPassword(DigestUtils.md5DigestAsHex(user.getPassword().getBytes()));
        }
        return userMapper.updateById(user);
    }

    /**
     * 根据id查询
     *
     * @param id
     * @return
     */
    @Override
    public User findById(Integer id) {
        return userMapper.selectById(id);
    }
}
