package com.itheima.service.impl;

import com.itheima.service.IUserService;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements IUserService {
    @Override
    public void save() {
        System.out.println("保存用户");
    }

    @Override
    public String update(int num) {
        System.out.println("传入的方法参数："+num);
        return "更新成功";
    }


}
