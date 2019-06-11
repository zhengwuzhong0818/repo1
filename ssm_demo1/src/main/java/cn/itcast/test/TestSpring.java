package cn.itcast.test;

import cn.itcast.service.AccountService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Package: cn.itcast.test
 * @Author: Zheng WZ
 * @Date: 20 19-04-27 11:29
 */

public class TestSpring {
    @Test
    public void test01(){
        //加载配置
        ApplicationContext ac = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
        //获取对象
        AccountService accountService = (AccountService)ac.getBean("accountService");
        //调用方法
        accountService.findAll();
    }
}
