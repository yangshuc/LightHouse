package com.lighthouse.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.lighthouse.entity.Comments;
import com.lighthouse.service.ICommentsService;
import org.springframework.stereotype.Service;
import com.lighthouse.mapper.CommentsMapper;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author ysc
 * @since 2024-10-27
 */
@Service
public class CommentsServiceImpl extends ServiceImpl<CommentsMapper, Comments> implements ICommentsService {

}
