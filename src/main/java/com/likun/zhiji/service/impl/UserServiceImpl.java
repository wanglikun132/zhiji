package com.likun.zhiji.service.impl;

import com.likun.zhiji.entity.User;
import com.likun.zhiji.mapper.UserMapper;
import com.likun.zhiji.service.IUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户表 服务实现类
 * </p>
 *
 * @author wanglikun
 * @since 2020-06-28
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

}
