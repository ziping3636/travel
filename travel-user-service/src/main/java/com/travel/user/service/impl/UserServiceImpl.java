package com.travel.user.service.impl;

import com.travel.user.entity.User;
import com.travel.user.mapper.UserMapper;
import com.travel.user.service.IUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author wangziping
 * @since 2020-05-18
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

}
