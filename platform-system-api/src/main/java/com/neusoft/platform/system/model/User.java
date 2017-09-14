package com.neusoft.platform.system.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by will on 2016/10/10.
 */
@ApiModel(value = "com.neusoft.platform.system.model.User",description = "用户信息")
public class User implements Serializable  {
    @ApiModelProperty("用户id")
    private Long id;
    @ApiModelProperty("用户代码")
    private String usercode;
    @ApiModelProperty("用户名称")
    private String username;
    @ApiModelProperty("密码")
    private String password;
    @ApiModelProperty("年龄")
    private int age;
    @ApiModelProperty("登录状态")
    private String status;
    @ApiModelProperty("创建时间")
    private Date createDate;

    private String suId;

    public String getUsercode() {
        return usercode;
    }

    public void setUsercode(String usercode) {
        this.usercode = usercode;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSuId() {
        return suId;
    }

    public void setSuId(String suId) {
        this.suId = suId;
    }
}
