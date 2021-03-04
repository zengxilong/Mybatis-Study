package com.zeng.dao;

import com.zeng.pojo.User;

/**
 * @author years
 */
public interface UserMapper {


    /**
     * id:用户id
     *  根据id查询用户
     * */
    User getUserById(int id);

}
