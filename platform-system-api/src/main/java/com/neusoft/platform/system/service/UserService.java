package com.neusoft.platform.system.service;

import com.neusoft.enjoy.web.api.annotation.Param;
import com.neusoft.enjoy.web.api.entity.LoginResponse;
import com.neusoft.enjoy.web.api.entity.Response;
import com.neusoft.platform.system.model.User;
import io.swagger.annotations.*;

/**
 * Created by will on 2016/10/9.
 */
@Api(description="用户操作")
public interface UserService {

    @ApiOperation(value="查询用户信息1",notes ="查询用户信息2")
    @ApiImplicitParams(value = {
            @ApiImplicitParam(name = "id", value = "用户id", required = true, paramType = "query", dataType = "long")
    })
//    @ApiResponses(value = {
//            @ApiResponse(code = 200, message = "用户信息",response=User.class)
//    })
    Response<User> selectById(@Param(value = "user",handleNames = {"suId","username"}) User user);

    @ApiOperation(value="登录", notes="所有系统的登录均走此方法",response=User.class)
    LoginResponse<User> login();


}