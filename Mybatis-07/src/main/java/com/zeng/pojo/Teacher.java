/**
 * @ClassName Teacher
 * @Description TODO
 * @Author years
 * @Date 2021-03-04 下午7:53
 * @Version 1.0
 **/
package com.zeng.pojo;

import lombok.Data;

import java.util.List;

@Data
public class Teacher {
    private int id;
    private String name;
    private List<Student> students;
}
