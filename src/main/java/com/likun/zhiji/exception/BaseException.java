package com.likun.zhiji.exception;

/**
 * @author 汪立坤
 * @version 1.0
 * @description
 * @create 2020/6/29
 */
public class BaseException extends RuntimeException {
	/**
	 * 错误信息
 	 */
	private String errorMsg;
	/**
	 * 服务器状态码
	 */
	private Integer code;

	public BaseException(String errorMsg) {
		super(errorMsg);
		this.errorMsg = errorMsg;
	}

	public BaseException(Integer code, String errorMsg) {
		super(errorMsg);
		this.errorMsg = errorMsg;
		this.code = code;
	}


	public String getErrorMsg() {
		return errorMsg;
	}

	public Integer getCode() {
		return code;
	}
}

