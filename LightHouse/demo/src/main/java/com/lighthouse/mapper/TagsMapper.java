package com.lighthouse.mapper;

import com.lighthouse.entity.Tags;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author ysc
 * @since 2024-10-27
 */
@Mapper
public interface TagsMapper extends BaseMapper<Tags> {

}
