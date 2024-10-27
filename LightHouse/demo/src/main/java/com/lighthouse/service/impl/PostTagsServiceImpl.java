package com.lighthouse.service.impl;


import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.lighthouse.entity.PostTags;
import com.lighthouse.mapper.PostTagsMapper;
import com.lighthouse.service.IPostTagsService;
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
public class PostTagsServiceImpl extends ServiceImpl<PostTagsMapper, PostTags> implements IPostTagsService {

}
