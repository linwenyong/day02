package com.itheima.service.impl;

import com.itheima.dao.IAccountDao;
import com.itheima.entity.Account;
import com.itheima.service.IAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.TransactionCallback;
import org.springframework.transaction.support.TransactionTemplate;


@Service
public class AccountService implements IAccountService {

    @Autowired
    private IAccountDao accountDao;

    @Autowired
    private TransactionTemplate transactionTemplate;

    @Override
    public void save(Account account) {
        TransactionCallback<Object> callback = new TransactionCallback<Object>() {
            @Override
            public Object doInTransaction(TransactionStatus status) {
                accountDao.save(account);
                String str = null;
                str.length();
                return null;
            }
        };
        transactionTemplate.execute(callback);
    }
}
