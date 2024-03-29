package com.baomidou.entity;

import java.util.Date;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableLogic;
import com.baomidou.mybatisplus.mapper.SqlCondition;
import com.baomidou.entity.enums.AgeEnum;
import com.baomidou.entity.enums.PhoneEnum;

/**
 * 用户表
 */
@SuppressWarnings("serial")
public class User extends SuperEntity<User> {


    /**
     * 名称 condition 注入查询条件【可无】
     */
    @TableField(condition = SqlCondition.LIKE)
    private String name;
    /**
     * 年龄
     */
    private AgeEnum age;
    /**
     * 这里故意演示注解可无
     */
    @TableField("test_type")
    @TableLogic
    private Integer testType;

    /**
     * 注入更新内容【可无】
     */
    @TableField(update = "now()")
    private Date testDate;

    private Long role;
    private PhoneEnum phone;

    public User() {
    }

    public User(Long id, String name, AgeEnum age, Integer testType) {
        this.setId(id);
        this.name = name;
        this.age = age;
        this.testType = testType;
    }

    public User(String name, AgeEnum age, Integer testType) {
        this.name = name;
        this.age = age;
        this.testType = testType;
    }


    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public AgeEnum getAge() {
        return this.age;
    }

    public void setAge(AgeEnum age) {
        this.age = age;
    }

    public Integer getTestType() {
        return this.testType;
    }

    public void setTestType(Integer testType) {
        this.testType = testType;
    }

    public Long getRole() {
        return this.role;
    }

    public void setRole(Long role) {
        this.role = role;
    }

    public PhoneEnum getPhone() {
        return this.phone;
    }

    public void setPhone(PhoneEnum phone) {
        this.phone = phone;
    }

    public Date getTestDate() {
        return testDate;
    }

    public void setTestDate(Date testDate) {
        this.testDate = testDate;
    }

    @Override
    public String toString() {
        return "User [id=" + this.getId() + ", name=" + name + ", age=" + age
                + ", testType=" + testType + ", testDate="
                + testDate + ", role=" + role + ", phone=" + phone + "]";
    }

}
