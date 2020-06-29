package com.likun.zhiji.model;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @author 汪立坤
 * @version 1.0
 * @description
 * @create 2020/6/29
 */
@Data
public class BaseResult<T> {

	/**
	 * 错误码
	 */
	@ApiModelProperty(value = "错误码")
	private Integer code;

	@ApiModelProperty(value = "状态码")
	private Integer status;

	@ApiModelProperty("返回信息")
	private String msg;

	@ApiModelProperty(value = "返回参数")
	private T data;
}
