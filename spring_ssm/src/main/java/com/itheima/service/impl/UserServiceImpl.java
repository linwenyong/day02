package com.itheima.service.impl;

import com.itheima.dao.IUserDao;
import com.itheima.entity.User;
import com.itheima.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements IUserService {

    @Autowired
    private IUserDao userDao;


    @Override
    public List<User> findAll() {
        return userDao.findAll();
    }
}
