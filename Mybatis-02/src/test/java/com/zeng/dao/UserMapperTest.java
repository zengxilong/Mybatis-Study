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

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UserMapperTest {
    public static void main(String[] args) {
        new UserMapperTest().getUserById();
    }
    @Test
    public void test(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();


        try {
            UserMapper mapper = sqlSession.getMapper(UserMapper.class);
            List<User> userList = mapper.getUserList();

            for (User u:
                    userList) {
                System.out.println(u);
            }
        }catch(Exception e){
            e.printStackTrace();;
        }finally {
            sqlSession.close();

        }





    }
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

    @Test
    public void addUser(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        int res = mapper.addUser(new User(4,"哈哈","124515"));

        if(res > 0 ){
            System.out.println("插入成功！");
        }
        /**提交事物*/
        sqlSession.commit();
        sqlSession.close();
    }

    @Test
    public void updateUser(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        int res = mapper.updateUser(new User(4,"呵呵","124515"));

        if(res > 0 ){
            System.out.println("更新成功！");
        }
        /**提交事物*/
        sqlSession.commit();
        sqlSession.close();
    }

    @Test
    public void deleteUser(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        int res = mapper.deleteUser(4);

        if(res > 0 ){
            System.out.println("删除成功！");
        }
        /**提交事物*/
        sqlSession.commit();
        sqlSession.close();
    }


}
