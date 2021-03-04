/**
 * @ClassName TeacherMapper
 * @Description TODO
 * @Author years
 * @Date 2021-03-04 下午7:56
 * @Version 1.0
 **/
package com.zeng.dao;

import com.zeng.pojo.Teacher;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

public interface TeacherMapper {
    @Select("select * from mybatis.teacher where id = #{tid}")
    Teacher getTeacher(@Param("tid") int id);
}
