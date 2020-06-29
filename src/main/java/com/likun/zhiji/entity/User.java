package com.likun.zhiji.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.likun.zhiji.entity.BaseEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 用户表
 * </p>
 *
 * @author wanglikun
 * @since 2020-06-28
 */
@Data
@EqualsAndHashCode(callSuper = true)
@ApiModel(value="User对象", description="用户表")
public class User extends BaseEntity {

	private static final long serialVersionUID = -1586163007933190302L;

	@ApiModelProperty(value = "用户名")
    private String name;

    @ApiModelProperty(value = "密码")
	@JsonIgnore
    private String password;

}
