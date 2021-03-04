/**
 * @ClassName UserDaoTest
 * @Description TODO
 * @Author years
 * @Date 2021-03-03 下午11:14
 * @Version 1.0
 **/
package com.zeng.dao;

import com.zeng.pojo.User;
import com.zeng.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class UserMapperTest {

    @Test
    public void getUserById(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();


        try {
            UserMapper mapper = sqlSession.getMapper(UserMapper.class);
            User userList = mapper.getUserById(1);

            System.out.println(userList);
        }catch(Exception e){
            e.printStackTrace();;
        }finally {
            sqlSession.close();
        }
    }



}
