package com.itheima.dao.impl;

import com.itheima.dao.IAccountDao;
import com.itheima.entity.Account;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

public class AccountDaoImpl implements IAccountDao {
    private JdbcTemplate jdbcTemplate;

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate){
        this.jdbcTemplate=jdbcTemplate;
    }


    @Override
    public void save(Account account) {
        jdbcTemplate.update("INSERT INTO account VALUES (NULL,?,?)",account.getUid(),account.getMoney());
    }

    @Override
    public void delete(int id) {
        jdbcTemplate.update("DELETE FROM account WHERE accountId = ?",id);
    }

    @Override
    public void update(Account account) {
        jdbcTemplate.update("UPDATE account SET uid=?,money=? WHERE accountId=?",account.getUid(),account.getMoney(),account.getAccountId());
    }

    @Override
    public List<Account> findAll() {
        return jdbcTemplate.query("select * from account",new BeanPropertyRowMapper<Account>(Account.class));
    }
}
