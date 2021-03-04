import com.zeng.dao.TeacherMapper;
import com.zeng.pojo.Teacher;
import com.zeng.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

/**
 * @ClassName MyTest
 * @Description TODO
 * @Author years
 * @Date 2021-03-04 下午9:19
 * @Version 1.0
 **/

public class MyTest {
    @Test
    public void test(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        TeacherMapper mapper = sqlSession.getMapper(TeacherMapper.class);
//        List<Teacher> teacher = mapper.getTeacher();
//        teacher.forEach(System.out::println);
        Teacher teacher = mapper.getTeacher(1);
        System.out.println(teacher);
        sqlSession.close();
    }

    @Test
    public void test2(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        TeacherMapper mapper = sqlSession.getMapper(TeacherMapper.class);
//        List<Teacher> teacher = mapper.getTeacher();
//        teacher.forEach(System.out::println);
        Teacher teacher = mapper.getTeacher2(1);
        System.out.println(teacher);
        sqlSession.close();
    }
}
