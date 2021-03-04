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
import org.apache.log4j.Logger;
import org.junit.Test;

public class UserMapperTest {
    static Logger logger= Logger.getLogger(UserMapperTest.class);
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
    public void TestLog4j(){
        logger.info("info:进入了TestLog4j");
        logger.debug("debug:进入了TestLog4j");
        logger.error("error:进入了TestLog4j");
    }

}
