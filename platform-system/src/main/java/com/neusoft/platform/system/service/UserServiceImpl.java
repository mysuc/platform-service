package com.neusoft.platform.system.service;

import com.google.common.base.Throwables;
import com.neusoft.enjoy.web.api.entity.LoginResponse;
import com.neusoft.enjoy.web.api.entity.Response;
import com.neusoft.platform.system.manager.UserManager;
import com.neusoft.platform.system.model.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by will on 2016/10/9.
 */
@Service
public class UserServiceImpl implements UserService {
    private static final Logger log = LoggerFactory.getLogger(UserServiceImpl.class);

    @Autowired
    private UserManager userManager;

    @Override
    public Response<User> selectById(User user){
        Response<User> response=new Response<>();
        try {
            response.setResult(userManager.selectByPrimaryKey(user.getId()));
        }catch(Exception e){
            response.setError(e.getMessage());
            log.error(Throwables.getStackTraceAsString(e));
        }
        return response;
    }

    @Override
    public LoginResponse<User> login(){
        LoginResponse<User> response=new LoginResponse<>();
        try {
            User user=userManager.selectByPrimaryKey(1L);
            response.setResult(user);
            response.setExpire(null);
            response.setSessionUserId(user.getId().toString());
        }catch(Exception e){
            response.setError(e.getMessage());
            log.error(Throwables.getStackTraceAsString(e));
        }
        return response;
    }
}
