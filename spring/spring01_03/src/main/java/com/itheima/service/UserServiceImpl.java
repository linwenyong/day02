package com.itheima.service;

import com.itheima.dao.IUserDao;
import com.itheima.dao.impl.UserDaoMySqlImpl;
import com.itheima.dao.impl.UserDaoOracleImpl;
import com.itheima.factory.BeanFactory;
import com.itheima.service.IUserService;

public class UserServiceImpl implements IUserService {

    private UserDaoMySqlImpl UserDao1 = new UserDaoMySqlImpl();
    private UserDaoOracleImpl UserDao2 = new UserDaoOracleImpl();


    @Override
    public void save() {
        //UserDao1.save();
        //UserDao2.save();
        IUserDao userDao = BeanFactory.getBean("userDao");
        userDao.save();
    }
}
