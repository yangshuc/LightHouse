package com.lighthouse.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Getter;
import lombok.Setter;

@TableName("post_tags")
@Getter
@Setter
public class PostTags {
    private Long postId;

    private Long tagId;

}
