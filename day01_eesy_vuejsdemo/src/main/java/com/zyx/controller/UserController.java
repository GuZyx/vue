package com.zyx.controller;

import com.zyx.domain.User;
import com.zyx.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private IUserService userService;

    /**
     * 查询全部用户
     * @return
     * @throws Exception
     */
    @RequestMapping("/findAll.do")
    public List<User> findAll() throws Exception {
        return userService.findAll();
    }

    /**
     * 根据id查询
     * @param id
     * @return
     * @throws Exception
     */
    @RequestMapping("/findById.do")
    public User findById(Integer id) throws Exception{
        return userService.findById(id);
    }

    /**
     * 更新用户
     * @param user
     * @throws Exception
     */
    @RequestMapping("/updateUser.do")
    public void updateUser(@RequestBody User user) throws Exception{
        userService.updateUser(user);
    }
}
