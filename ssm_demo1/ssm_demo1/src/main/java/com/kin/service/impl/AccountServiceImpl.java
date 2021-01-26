package com.kin.service.impl;

import com.kin.bean.Account;
import com.kin.dao.IAccountDao;
import com.kin.service.IAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ClassName : AccountServiceImpl
 * @Author : LW
 * @Date: 2021/1/20 21:30
 */
@Service("accountService")
public class AccountServiceImpl implements IAccountService {
    @Autowired
    private IAccountDao accountDao;
    @Override
    public List<Account> findAll() {
        System.out.println("业务层：查询所有账户信息。。。。。");
        return accountDao.findAll();
    }

    @Override
    public void saveAccount(Account account) {
        System.out.println("业务层：保存账户。。。。。。");
        accountDao.saveAccount(account);
    }
}
