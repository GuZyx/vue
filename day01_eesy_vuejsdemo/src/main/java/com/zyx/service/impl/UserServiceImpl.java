package com.zyx.service.impl;

import com.zyx.dao.IUserDao;
import com.zyx.domain.User;
import com.zyx.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 业务层实现类
 */
@Service
public class UserServiceImpl implements IUserService {
    @Autowired
    private IUserDao userDao;

    @Override
    public List<User> findAll() throws Exception {
        return userDao.findAll();
    }

    @Override
    public User findById(Integer id) throws Exception {
        return userDao.findById(id);
    }

    @Override
    public void updateUser(User user) throws Exception {
        userDao.updateUser(user);
//        int i = 1/0;  //测试事务
    }
}
