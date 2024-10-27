package com.lighthouse.service.impl;

import com.lighthouse.entity.Users;
import com.lighthouse.mapper.UsersMapper;
import com.lighthouse.service.UsersService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
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

}
