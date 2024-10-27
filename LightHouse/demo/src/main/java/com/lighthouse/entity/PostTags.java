package com.lighthouse.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Getter;
import lombok.Setter;

@TableName("post_tags")
@Getter
@Setter
public class PostTags {
    @TableId(value = "post_id", type = IdType.INPUT)
    private Long postId;

    @TableId(value = "tag_id", type = IdType.INPUT)
    private Long tagId;
    
}
