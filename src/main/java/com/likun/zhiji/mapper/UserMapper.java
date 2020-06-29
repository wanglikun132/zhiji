package com.likun.zhiji.mapper;

import com.likun.zhiji.entity.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 * 用户表 Mapper 接口
 * </p>
 *
 * @author wanglikun
 * @since 2020-06-28
 */
@Mapper
public interface UserMapper extends BaseMapper<User> {

}
