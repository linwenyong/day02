package com.itheima.dao.impl;

import com.itheima.dao.IUserDao;


public class UserDaoOracleImpl implements IUserDao {
    @Override
    public void save() {
        System.out.println("保存用户，改为使用Oracle数据库");
    }
}
