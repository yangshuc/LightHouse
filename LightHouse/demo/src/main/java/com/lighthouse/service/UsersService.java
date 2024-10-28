package com.lighthouse.service;

import com.lighthouse.entity.Users;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author ysc
 * @since 2024-10-27
 */
public interface UsersService extends IService<Users> {
    //根据名字获取用户信息
    Users searchUserByName(String name);
}
