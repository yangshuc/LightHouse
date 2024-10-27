package com.lighthouse.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import java.time.LocalDateTime;
import lombok.Getter;
import lombok.Setter;

/**
 * <p>
 *
 * </p>
 *
 * @author ysc
 * @since 2024-10-27
 */
@Getter
@Setter
public class Users{

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 用户名，唯一
     */
    private String username;

    /**
     * 密码
     */
    private String password;

    /**
     * 邮箱，唯一
     */
    private String email;

    /**
     * 创建时间
     */
    private LocalDateTime createdTime;

    /**
     * 更新时间
     */
    private LocalDateTime updatedTime;
}
