package cn.itcast.service;

import cn.itcast.domain.Account;

import java.util.List;

/**
 * @Package: cn.itcast.service
 * @Author: Zheng WZ
 * @Date: 2019-04-27 11:19
 */

public interface AccountService {
    //查询所有账户信息
    public List<Account> findAll();
    //保存账户信息
    public void saveAccount(Account account);
}
