package com.neusoft.platform.system.dao;

import com.neusoft.platform.system.model.User;

/**
 * Created by will on 16-10-23.
 */
public interface SystemUserMapper {
    User selectByPrimaryKey(Long id);

    void insert(User user);
}
