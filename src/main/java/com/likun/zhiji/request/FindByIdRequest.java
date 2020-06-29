package com.likun.zhiji.request;

import com.sun.istack.internal.NotNull;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author 汪立坤
 * @version 1.0
 * @description
 * @create 2020/6/29
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class FindByIdRequest extends BaseRequest{
	private static final long serialVersionUID = 2733362260302426856L;

	@ApiModelProperty(value = "主键",required = true,example = "1")
	@NotNull
	private Integer id;
}
