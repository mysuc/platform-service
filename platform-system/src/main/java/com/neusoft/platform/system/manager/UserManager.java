package com.neusoft.platform.system.manager;

import com.neusoft.platform.system.dao.SystemUserMapper;
import com.neusoft.platform.system.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;

/**
 * Created by will on 16-10-24.
 */
@Component
public class UserManager {
    @Autowired
    private SystemUserMapper systemUserMapper;

    public User selectByPrimaryKey(Long id){
        return systemUserMapper.selectByPrimaryKey(id);
    }

    @Transactional
    public void add(User user) {
        user.setStatus("0");
        user.setCreateDate(new Date());
        systemUserMapper.insert(user);
    }

    @Transactional
    public void addError(User user) {
        systemUserMapper.insert(user);
        throw new RuntimeException("执行错误！");
    }
}
