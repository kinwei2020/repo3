package com.kin.test;

import com.kin.bean.Account;
import com.kin.dao.IAccountDao;
import com.kin.service.IAccountService;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * @ClassName : TestMybatis
 * @Author : LW
 * @Date: 2021/1/20 22:30
 */
public class TestMybatis {
    @Test
    public void run1() throws IOException {
        InputStream in = Resources.getResourceAsStream("SqlMapConfig.xml");
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(in);
        SqlSession sqlSession = factory.openSession();
        IAccountDao mapper = sqlSession.getMapper(IAccountDao.class);
        List<Account> accountList = mapper.findAll();
        for (Account account : accountList) {
            System.out.println(account);
        }
        sqlSession.close();
        in.close();
    }
    @Test
    public void run2() throws IOException {
        InputStream in = Resources.getResourceAsStream("SqlMapConfig.xml");
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(in);
        SqlSession sqlSession = factory.openSession();
        IAccountDao mapper = sqlSession.getMapper(IAccountDao.class);
        Account account = new Account();
        account.setName("kin");
        account.setMoney(500000);
        mapper.saveAccount(account);
        sqlSession.commit();
        sqlSession.close();
        in.close();
    }
}
