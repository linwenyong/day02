package com.itheima.entity;

public class Account {
    private int accountId;
    private int uid;
    private double money;

    @Override
    public String toString() {
        return "Account{" +
                "accountId=" + accountId +
                ", uid=" + uid +
                ", money=" + money +
                '}';
    }

    /* public Account() {
        }

        public Account(int accountId, int uid, double money) {
            this.accountId = accountId;
            this.uid = uid;
            this.money = money;
        }
    */
    public int getAccountId() {
        return accountId;
    }

    public void setAccountId(int accountId) {
        this.accountId = accountId;
    }

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }
}
