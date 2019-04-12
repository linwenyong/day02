package com.itheima.dao.impl;

import com.itheima.dao.IUserDao;

public class UserDaoMySqlImpl implements IUserDao {
    @Override
    public void save() {
        System.out.println("保存用户，默认使用mysql数据库");
    }
}
