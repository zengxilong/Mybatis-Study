package com.zeng.dao;

import com.zeng.pojo.User;

import java.util.List;
import java.util.Map;

/**
 * @author years
 */
public interface UserMapper {
    List<User> getUserList();

    /**
     * id:用户id
     *  根据id查询用户
     * */
    User getUserById(int id);


    int addUser(User user);
    int addUser2(Map<String,Object> map);

    int updateUser(User user);
    int deleteUser(int id);
}
