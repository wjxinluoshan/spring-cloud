package com.ajobs.swagger.config

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import springfox.documentation.service.ApiInfo
import springfox.documentation.service.Contact
import springfox.documentation.spi.DocumentationType
import springfox.documentation.spring.web.plugins.Docket
import springfox.documentation.swagger2.annotations.EnableSwagger2

/**
 * description
 *
 * @author 28107 2020/07/21 16:31
 */
@Configuration
@EnableSwagger2
open class SwaggerConfig  {

    @Bean
    open fun customAppInfo(): Docket {
        return Docket(DocumentationType.SWAGGER_2).apiInfo(ApiInfo(
                "Ajobs Documentation",
                "normal",
                "1.0.0",
                "http://localhost:8072",
                Contact("", "", ""),
                "no",
                "no",
                mutableListOf()
        )).groupName("ajobs")
    }



}