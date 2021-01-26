package com.kin.service;

import com.kin.bean.Account;

import java.util.List;

/**
 * @ClassName : IAccountService
 * @Author : LW
 * @Date: 2021/1/20 21:30
 */
public interface IAccountService {
    /**
     * 查询所有账户
     * @return
     */
    public List<Account> findAll();

    /**
     * 保存账户信息
     * @param account
     */
    public void saveAccount(Account account);
}
