package com.kin.dao;

import com.kin.bean.Account;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @ClassName : IAccountDao
 * @Author : LW
 * @Date: 2021/1/20 21:28
 */
@Repository
public interface IAccountDao {
    /**
     * 查询所有账户
     * @return
     */
    @Select("select * from account")
    public List<Account> findAll();

    /**
     * 保存账户信息
     * @param account
     */
    @Insert("insert into account(name,money)values(#{name},#{money})")
    public void saveAccount(Account account);
}
