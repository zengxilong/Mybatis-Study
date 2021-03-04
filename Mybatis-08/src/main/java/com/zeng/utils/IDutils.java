/**
 * @ClassName IDutils
 * @Description TODO
 * @Author years
 * @Date 2021-03-04 下午10:06
 * @Version 1.0
 **/
package com.zeng.utils;

import org.junit.Test;

import java.util.UUID;

public class IDutils {
    public static String getId(){
        return UUID.randomUUID().toString().replaceAll("-","");
    }



    @Test
    public void test(){
        System.out.println(getId());
    }
}
