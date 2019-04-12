package com.itheima.service;

import com.itheima.entity.Account;

import java.util.List;

public interface IAccountService {
    void save(Account account);

    void delete(int id);

    void update(Account account);

    List<Account> findAll();
}
