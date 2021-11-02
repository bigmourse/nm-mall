package com.xuan.nm01.service.impl;

import com.xuan.nm01.entity.User;
import com.xuan.nm01.mapper.UserMapper;
import com.xuan.nm01.service.USERervice;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author xuanran
 * @since 2021-11-02
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements USERervice {

}
