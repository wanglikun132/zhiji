package com.likun.zhiji.config;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @author 汪立坤
 * @version 1.0
 * @description swagger配置类
 * @create 2020/6/29
 */
@Configuration
@EnableSwagger2
@ConditionalOnProperty(name = "swagger.enable",  havingValue = "true")
public class SwaggerConfig {
	@Bean
	public Docket customDocket(){
		return new Docket(DocumentationType.SWAGGER_2)
				.apiInfo(apiInfo())
				.select()
				.apis(RequestHandlerSelectors.basePackage("com.likun.zhiji.controller"))
				.build();
	}

	private ApiInfo apiInfo(){
		return new ApiInfoBuilder()
				.title("知己项目接口文档")
				.version("1.0.0")
				.contact(new Contact("wanglikun",null,"likunwang888@163.com"))
				.build();

	}
}
