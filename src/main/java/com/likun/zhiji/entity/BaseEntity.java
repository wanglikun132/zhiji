package com.likun.zhiji.entity;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

/**
 * @author 汪立坤
 * @version 1.0
 * @description
 * @create 2020/6/28
 */
@Data
public abstract class BaseEntity implements Serializable {

	private static final long serialVersionUID = -1036660253763802246L;

	@ApiModelProperty(value = "id",example = "1")
	private Integer id;

	@ApiModelProperty(value = "0:未删除,1:删除",example = "0")
	private Integer deleted;
}
