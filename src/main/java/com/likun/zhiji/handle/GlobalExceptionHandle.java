package com.likun.zhiji.handle;

import com.likun.zhiji.exception.BaseException;
import com.likun.zhiji.model.BaseResult;
import com.likun.zhiji.util.ResultUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author 汪立坤
 * @version 1.0
 * @description 全局捕获异常
 * @create 2020/6/29
 */
@ControllerAdvice
@Slf4j
public class GlobalExceptionHandle {
	@ExceptionHandler(value = Exception.class)
	@ResponseBody
	public <T> BaseResult<T> handle(Exception e) {
		log.error("errorMessage:{},cause:{}",e.getMessage(),e);
		if (e instanceof BaseException) {
			Integer code = 104;
			BaseException exception = (BaseException) e;
			if (exception.getCode() != 0) {
				code = exception.getCode();
			}
			return ResultUtil.error(code, e.getMessage());
		}
		return ResultUtil.error(500, e.getMessage() == null ? "服务器内部错误" : e.getMessage());
	}
}

