package com.likun.zhiji.controller;


import com.likun.zhiji.entity.User;
import com.likun.zhiji.model.BaseResult;
import com.likun.zhiji.request.FindByIdRequest;
import com.likun.zhiji.service.IUserService;
import com.likun.zhiji.util.ResultUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * <p>
 * 用户表 前端控制器
 * </p>
 *
 * @author wanglikun
 * @since 2020-06-28
 */
@RestController
@Api(tags = "用户服务")
@RequestMapping("/user")
public class UserController {

	@Autowired
	private IUserService userService;

	/**
	 * 参数类型为对象的通过id获取用户
	 * @param findByIdRequest
	 * @return
	 */
	@PostMapping("/findByIdRequest")
	@ApiOperation(value = "通过id查找用户")
	public BaseResult<User> findByIdRequest(@RequestBody FindByIdRequest findByIdRequest){
		Integer id = findByIdRequest.getId();
		User user = userService.getById(id);
		return ResultUtil.success(user);
	}

	/**
	 * 参数类型为具体值
	 * @param id
	 * @return
	 */
	@PostMapping("/findById")
	@ApiOperation(value = "通过id查找用户")
	public BaseResult<User> findById(@RequestParam(value = "id") Integer id){
		User user = userService.getById(id);
		return ResultUtil.success(user);
	}
}
