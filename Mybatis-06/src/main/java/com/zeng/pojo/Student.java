/**
 * @ClassName Student
 * @Description TODO
 * @Author years
 * @Date 2021-03-04 下午7:52
 * @Version 1.0
 **/
package com.zeng.pojo;

import lombok.Data;

@Data
public class Student {
    private int id;
    private String name;

//    学生需要关联一个老师！
    private Teacher teacher;
}
