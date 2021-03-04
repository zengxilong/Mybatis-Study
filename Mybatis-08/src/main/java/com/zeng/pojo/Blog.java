/**
 * @ClassName Blog
 * @Description TODO
 * @Author years
 * @Date 2021-03-04 下午10:01
 * @Version 1.0
 **/
package com.zeng.pojo;

import lombok.Data;

import java.util.Date;

@Data
public class Blog {
    private String id;
    private String title;
    private String author;
    private Date createTime; //属性名和字段名不一致，需要开启经典数据库命名到驼峰命名映射
    private int views;
}
