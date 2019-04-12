package com.itheima.dao;

import com.itheima.entity.Account;

import java.util.List;

public interface IAccountDao {

    void save(Account account);

    void delete(int id);

    void update(Account account);

    List<Account> findAll();
}
