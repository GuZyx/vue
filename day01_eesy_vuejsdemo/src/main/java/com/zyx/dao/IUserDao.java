package com.zyx.dao;

import com.zyx.domain.User;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 用户的持久层接口
 */
@Repository("userDao")
public interface IUserDao {
    //查询用户列表
    @Select("select * from user")
    List<User> findAll() throws Exception;

    //根据id查询
    @Select("select * from user where id = #{id}")
    User findById(Integer id) throws Exception;

    //修改用户胡
    @Update("update user set age = #{age},username = #{username},password = #{password},email = #{email},sex = #{sex} where id = #{id}")
    void updateUser(User user) throws Exception;
}
