/**
 * @ClassName StudentMapper
 * @Description TODO
 * @Author years
 * @Date 2021-03-04 下午7:56
 * @Version 1.0
 **/
package com.zeng.dao;

import com.zeng.pojo.Student;

import java.util.List;

public interface StudentMapper {
    List<Student> getStudent();
    List<Student> getStudent2();
}

