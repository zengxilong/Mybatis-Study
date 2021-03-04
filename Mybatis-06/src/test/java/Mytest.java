import com.zeng.dao.StudentMapper;
import com.zeng.dao.TeacherMapper;
import com.zeng.pojo.Student;
import com.zeng.pojo.Teacher;
import com.zeng.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

/**
 * @ClassName Mytest
 * @Description TODO
 * @Author years
 * @Date 2021-03-04 下午8:01
 * @Version 1.0
 **/

public class Mytest {

//    @Test
//    public static void main(String[] args) {
//        SqlSession sqlSession = MybatisUtils.getSqlSession();
//        StudentMapper mapper = sqlSession.getMapper(StudentMapper.class);
//        List<Student> student = mapper.getStudent();
//
//        student.forEach(System.out::println);
//
//        sqlSession.close();
//    }

    @Test
    public void TestStudent(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        StudentMapper mapper = sqlSession.getMapper(StudentMapper.class);
        List<Student> student = mapper.getStudent();

        student.forEach(System.out::println);

        sqlSession.close();
    }

    @Test
    public void TestStudent2(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        StudentMapper mapper = sqlSession.getMapper(StudentMapper.class);
        List<Student> student = mapper.getStudent2();

        student.forEach(System.out::println);

        sqlSession.close();
    }
}
