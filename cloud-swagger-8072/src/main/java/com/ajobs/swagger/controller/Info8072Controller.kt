package com.ajobs.swagger.controller

import io.swagger.annotations.Api
import io.swagger.annotations.ApiOperation
import org.springframework.beans.factory.BeanFactory
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.beans.factory.config.AutowireCapableBeanFactory
import org.springframework.beans.factory.support.BeanDefinitionBuilder
import org.springframework.beans.factory.support.DefaultListableBeanFactory
import org.springframework.context.ApplicationContext
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

/**
 * description
 *
 * @author 28107 2020/07/21 16:43
 */
@RestController
@ApiOperation("信息控制器")
class Info8072Controller {

    @Autowired
    private lateinit var applicationContext: ApplicationContext

    private var beanFactory: DefaultListableBeanFactory? = null

    @GetMapping("/")
    @ApiOperation("默认路径")
    fun default() = "welcom"

    @GetMapping("/hi")
    @ApiOperation("打招呼")
    fun sayHi() = "hi"


    /**
     * 动态注入Bean
     */
    @GetMapping("/create-bean")
    fun createBean(): String {
        beanFactory = applicationContext.autowireCapableBeanFactory as DefaultListableBeanFactory
        beanFactory?.registerBeanDefinition("a", BeanDefinitionBuilder.genericBeanDefinition(A::class.java).beanDefinition)
        return applicationContext.getBean("a").toString()
    }
}

class A {
    override fun toString(): String {
        return "A in here"
    }
}