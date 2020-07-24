package com.ajobs.domain.entity;


import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

import javax.validation.Valid;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

/**
 * description
 *
 * @author 28107 2020/07/24 13:32
 */

@Service
//开启方法检验
@Validated
public class User {
    //    @NotNull
    public String name;

    //    @Min(10)
    public Integer age;

    //嵌套校验
    @Valid
    //@NotNull
    public Pet pet;

    public @NotNull String sex(String sex) {
        return sex;
    }

}
