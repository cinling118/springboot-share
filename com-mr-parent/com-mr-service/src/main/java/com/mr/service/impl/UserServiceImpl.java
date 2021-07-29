package com.mr.service.impl;

import com.mr.dao.UserDao;
import com.mr.entity.User;
import com.mr.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("userService")
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;

    public List<User> queryService() {
        return userDao.queryUser();
    }
}
