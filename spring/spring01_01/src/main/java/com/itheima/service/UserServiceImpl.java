package com.itheima.service;



import com.itheima.dao.IUserDao;
import com.itheima.dao.impl.UserDaoOracleImpl;
import com.itheima.factory.BeanFactory;
import com.itheima.service.IUserService;

public class UserServiceImpl implements IUserService {

    //private IUserDao userDao = new UserDaoOracleImpl();

    private IUserDao userDao =  BeanFactory.getBean("userDao");
    @Override
    public void save() {
        userDao.save();
    }
}
