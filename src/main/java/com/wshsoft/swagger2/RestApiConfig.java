package com.wshsoft.swagger2;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;


@Configuration //配置注解，自动在本类上下文加载一些环境变量信息
@EnableWebMvc 
@EnableSwagger2 //使swagger2生效
@ComponentScan(basePackages ={"com.wshsoft.controller"}) //需要扫描的包路径

public class RestApiConfig extends WebMvcConfigurationSupport{
	/* 
	 * Restful API 访问路径: 
	 * http://IP:port/{context-path}/swagger-ui.html 
	 * eg:http://localhost:8080/jd-config-web/swagger-ui.html 
    */ 

    @Bean
    public Docket createRestApi(){
        return new Docket(DocumentationType.SWAGGER_2)
        		.pathMapping("/api")//api测试请求地址
        		.apiInfo(apiInfo())  
        		.select()  
        	    //.apis(RequestHandlerSelectors.basePackage("com.wshsoft.controller"))  
        	    .paths(PathSelectors.any())  
        	    .build();  


    }

    private ApiInfo apiInfo() {  
    	 Contact contact = new Contact("谢建", null, "larry838@126.com");
        return new ApiInfoBuilder()  
                .title("** 系统平台 RESTful APIs")//大标题
                .description("** 系统平台各领域  RESTful APIs 文档定义及测试") //小标题
                .termsOfServiceUrl("http://blog.csdn.net/he90227")  
                .contact(contact)  
                .version("1.1")//版本 
                .build();  
    }  

}

