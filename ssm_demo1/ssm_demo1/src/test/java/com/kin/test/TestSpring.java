package com.kin.test;

import com.kin.bean.Account;
import com.kin.service.IAccountService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * @ClassName : TestSpring
 * @Author : LW
 * @Date: 2021/1/20 21:42
 */
public class TestSpring {
    @Test
    public void run1() {
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
        IAccountService service = context.getBean("accountService", IAccountService.class);
        List<Account> accountList = service.findAll();
        for (Account account : accountList) {
            System.out.println(account);
        }
    }
}
