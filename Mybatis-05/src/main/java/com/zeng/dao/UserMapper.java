package com.zeng.dao;

import com.zeng.pojo.User;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author years
 */
public interface UserMapper {
    @Select("select * from mybatis.user")
    List<User> getUsers();
}
