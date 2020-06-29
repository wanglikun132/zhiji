package com.likun.zhiji;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.likun.zhiji.mapper")
public class ZhijiApplication {

	public static void main(String[] args) {
		SpringApplication.run(ZhijiApplication.class, args);
	}

}
