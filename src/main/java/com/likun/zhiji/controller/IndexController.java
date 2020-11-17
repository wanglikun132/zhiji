package com.likun.zhiji.controller;

import com.likun.zhiji.util.ExportExcel;
import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 汪立坤
 * @version 1.00000
 * @description
 * @create 2020/6/23
 */
@RestController
@Api(tags = "主页")
@RequestMapping(value = "/index")
public class IndexController {

	@GetMapping(value = "/hello")
	public String index(){
//		//异常返回拦截测试
//		int a = 4/0;
        ExportExcel.testExcel();
		return "hello, world";
	}


}
