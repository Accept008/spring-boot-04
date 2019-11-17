package com.qz.springboot.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;
@Component
@EnableSwagger2// 开启Swagger的自动配置
//@Configuration
public class SwaggerConfig {

    @Bean
    public Docket creatRestApi(){
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                //.select()
                //.apis(RequestHandlerSelectors.basePackage("com.qz.springboot.controller"))
                //.paths(PathSelectors.any())
                //.build()
        ;
    }

    public ApiInfo apiInfo(){
        return new ApiInfoBuilder()
                .title("利用Swagger2构建的API文档")
                .description("描述")
                //.termsOfServiceUrl("")
                //.version("1.0")
                .build();
    }
}
