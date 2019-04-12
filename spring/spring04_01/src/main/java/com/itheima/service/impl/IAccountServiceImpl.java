package com.itheima.service.impl;

import com.itheima.service.IAccountService;
import org.springframework.stereotype.Service;

@Service("service")
public class IAccountServiceImpl implements IAccountService {
    @Override
    public void save() {
        System.out.println("保存用户！");
    }
}


