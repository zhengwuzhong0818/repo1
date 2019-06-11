package cn.itcast.dao;

import cn.itcast.domain.Account;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Package: cn.itcast.dao
 * @Author: Zheng WZ
 * @Date: 2019-04-27 11:16
        */
@Repository
public interface AccountDao {
    //查询所有账户信息
    @Select("select* from account")
    public List<Account> findAll();
    //保存账户信息
    @Insert("insert into account (name,money) values(#{name},#{money})")
    public void saveAccount(Account account);
}
