package com.itheima.service;


import com.itheima.entity.User;
import org.springframework.stereotype.Repository;

import java.util.List;


public interface IUserService {
    List<User> findAll();
}
