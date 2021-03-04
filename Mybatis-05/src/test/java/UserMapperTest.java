import com.zeng.dao.UserMapper;
import com.zeng.pojo.User;
import com.zeng.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

/**
 * @ClassName UserMapperTest
 * @Description TODO
 * @Author years
 * @Date 2021-03-04 下午7:23
 * @Version 1.0
 **/

public class UserMapperTest {
    @Test
    public void test(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        List<User> users = mapper.getUsers();

        users.forEach(System.out::println);
        sqlSession.close();
    }
}
