package com.lighthouse.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.lighthouse.entity.Posts;
import com.lighthouse.mapper.PostsMapper;
import com.lighthouse.service.PostsService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author ysc
 * @since 2024-10-27
 */
@Service
public class PostsServiceImpl extends ServiceImpl<PostsMapper, Posts> implements PostsService {
    @Autowired
    PostsMapper postsMapper;
    @Override
    public List<Posts> searchPostByUserId(Integer userId) {
        QueryWrapper<Posts> postsQueryWrapper = new QueryWrapper<>();
        postsQueryWrapper.eq("user_id",userId);
        return postsMapper.selectList(postsQueryWrapper);
    }

    @Override
    public Posts searchPostById(Integer id) {
        QueryWrapper<Posts> postsQueryWrapper = new QueryWrapper<>();
        postsQueryWrapper.eq("id",id);
        return postsMapper.selectOne(postsQueryWrapper);
    }
}
