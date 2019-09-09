package com.zyx.service;

import com.zyx.domain.User;

import java.util.List;

//用户业务层接口
public interface IUserService {
    //查询全部用户
    List<User> findAll() throws Exception;

    //根据id查询用户
    User findById(Integer id) throws Exception;

    //更新用户
    void updateUser(User user) throws Exception;
}
