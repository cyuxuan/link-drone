package com.linkdrone.common.domain.entity;

import com.baomidou.mybatisplus.annotation.*;
import lombok.Data;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * 用户实体类
 */
@Data
@Accessors(chain = true)
@TableName("user")
public class User implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 用户ID
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 用户类型（1-个人用户，2-企业用户）
     */
    private Integer userType;

    /**
     * 用户名
     */
    private String username;

    /**
     * 密码
     */
    private String password;

    /**
     * 手机号
     */
    private String phone;

    /**
     * 邮箱
     */
    private String email;

    /**
     * 真实姓名/企业名称
     */
    private String realName;

    /**
     * 身份证号
     */
    private String idCard;
    
    /**
     * 企业名称
     */
    private String companyName;
    
    /**
     * 营业执照号
     */
    private String businessLicense;

    /**
     * 头像
     */
    private String avatar;

    /**
     * 信用分
     */
    private Integer creditScore;

    /**
     * 状态（0-禁用，1-正常）
     */
    private Integer status;

    /**
     * 创建时间
     */
    @TableField(fill = FieldFill.INSERT)
    private LocalDateTime createTime;

    /**
     * 更新时间
     */
    @TableField(fill = FieldFill.INSERT_UPDATE)
    private LocalDateTime updateTime;

    /**
     * 是否删除（0-未删除，1-已删除）
     */
    @TableLogic
    private Integer deleted;
}