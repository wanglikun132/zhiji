package com.likun.zhiji.request;

import com.fasterxml.jackson.annotation.JsonIgnore;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

/**
 * @author 汪立坤
 * @version 1.0
 * @description
 * @create 2020/6/29
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public abstract class BaseRequest implements Serializable {

	private static final long serialVersionUID = -1532657905705751678L;

	/**
	 * app唯一标识
	 */
	@ApiModelProperty(value = "客户端唯一标识",required = true,example = "立坤测试app")
	private String appName;

	@ApiModelProperty(value = "请求时间")
	@JsonIgnore
	private Date date = new Date();


}
