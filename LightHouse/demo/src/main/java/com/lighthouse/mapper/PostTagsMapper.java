package com.lighthouse.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.lighthouse.entity.PostTags;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

@Mapper
public interface PostTagsMapper extends BaseMapper<PostTags> {
}
