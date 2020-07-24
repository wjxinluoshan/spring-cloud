package com.ajobs.domain.entity;

import javax.validation.constraints.NotNull;

/**
 * description
 *
 * @author 28107 2020/07/24 17:38
 */
public class Pet {

   @NotNull
    private String name;
    @NotNull
    private Integer age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
