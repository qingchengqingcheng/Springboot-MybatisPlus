
package com.springbootmybatisplus.demo.common.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;


/**
 * @ClassName Swagger2Config
 * @Discription swagger2配置类
 * @Date 2020/1/5 16:53
 * @Version V1.0
 */
@Configuration
public class Swagger2Config {
    @Bean
    public Docket api() {
        return new Docket( DocumentationType.SWAGGER_2 )
                .apiInfo( apiInfo() )
                .select()
                // 自行修改为自己的包路径
                .apis( RequestHandlerSelectors.basePackage( "com.springbootmybatisplus.demo.controller" ) )
                .paths( PathSelectors.any() )
                .build();
    }

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title( "MyBatisPlus测试在线接口文档" )
                .version( "1.0" )
                .build();
    }

}

