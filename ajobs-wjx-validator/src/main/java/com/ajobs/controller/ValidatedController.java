package com.ajobs.controller;

import com.ajobs.domain.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * description
 *
 * @author 28107 2020/07/24 16:52
 */
@RestController
public class ValidatedController {
//    @Autowired
//    private User user;
    //@Validated指定验证对象 BindingResult紧跟Validated
    @RequestMapping(value="/user",method = RequestMethod.POST)
    public String user(@Validated @RequestBody User user){
       // System.out.println(user.sex(null));
        return "ok";
    }

}
