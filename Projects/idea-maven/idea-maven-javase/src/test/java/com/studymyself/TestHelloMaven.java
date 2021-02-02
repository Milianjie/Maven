package com.studymyself;

import org.junit.Assert;
import org.junit.Test;

public class TestHelloMaven {

    @Test
    public void testAdd1(){

        System.out.println("测试1：测试方法add，执行testAdd");

        HelloMaven helloMaven = new HelloMaven();

        int res = helloMaven.add(10,20);

        Assert.assertEquals(30,res);

    }

    @Test
    public void testAdd2(){

        System.out.println("测试2：测试方法add，执行testAdd2");

        HelloMaven helloMaven = new HelloMaven();

        int res = helloMaven.add(10,20);

        Assert.assertEquals(30,res);

    }

}
