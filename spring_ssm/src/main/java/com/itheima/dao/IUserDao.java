package com.itheima.dao;

import com.itheima.entity.User;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface IUserDao {

    @Select("SELECT * FROM USER ")
    List<User> findAll();
}
