package com.lighthouse.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.lighthouse.entity.Users;
import com.lighthouse.mapper.UsersMapper;
import com.lighthouse.service.UsersService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author ysc
 * @since 2024-10-27
 */
@Service
public class UsersServiceImpl extends ServiceImpl<UsersMapper, Users> implements UsersService {
    @Autowired
    private UsersMapper usersMapper;
    //根据名字获取用户信息
    @Override
    public Users searchUserByName(String name){
        QueryWrapper<Users> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("username",name);
        return usersMapper.selectOne(queryWrapper);
    }
}
