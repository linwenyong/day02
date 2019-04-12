package com.itheima.service.impl;

import com.itheima.dao.IAccountDao;
import com.itheima.entity.Account;
import com.itheima.service.IAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;


@Service
@Transactional(
        propagation = Propagation.REQUIRED,
        readOnly = false,
        noRollbackFor = {ArithmeticException.class,NullPointerException.class}
)
public class AccountService implements IAccountService {

    @Autowired
    private IAccountDao accountDao;


    @Override
    public void save(Account account) {
        accountDao.save(account);
        String str = null;
        int len = str.length();
        accountDao.save(account);

    }
}
