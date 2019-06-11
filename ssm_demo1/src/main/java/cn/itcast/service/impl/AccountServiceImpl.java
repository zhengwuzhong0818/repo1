package cn.itcast.service.impl;

import cn.itcast.dao.AccountDao;
import cn.itcast.domain.Account;
import cn.itcast.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Package: cn.itcast.service.impl
 * @Author: Zheng WZ
 * @Date: 2019-04-27 11:20
 */
@Service("accountService")
public class AccountServiceImpl implements AccountService{
    @Autowired
    private AccountDao accountDao;
    @Override
    public List<Account> findAll() {
        System.out.println("业务层:查询所有账户信息...");
        //调用service方法
        return accountDao.findAll();
    }

    @Override
    public void saveAccount(Account account) {
        System.out.println("业务层:保存账户...");
        accountDao.saveAccount(account);
    }
}
