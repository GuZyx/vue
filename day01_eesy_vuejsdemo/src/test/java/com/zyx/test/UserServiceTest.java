package com.zyx.test;

import com.zyx.domain.User;
import com.zyx.service.IUserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * 用户的业务层测试
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext.xml")
public class UserServiceTest {
    @Autowired
    private IUserService userService;

    @Test
    public void testFindAll() throws Exception { //测试查询所有用户
        List<User> users = userService.findAll();
        System.out.println(users);
    }

    @Test
    public void testFindById() throws Exception { //测试根据id查询用户
        User user = userService.findById(1);
        System.out.println(user);
    }

    @Test
    public void testUpdate() throws Exception { //测试修改用户
        User user = userService.findById(1);
        user.setAge(33);
        userService.updateUser(user);
        System.out.println(user);
    }
}

