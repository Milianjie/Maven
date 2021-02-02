package com.studymyself;

import org.junit.Assert;
import org.junit.Test;
import com.studymyself.HelloMaven;

public class TestHelloMaven{

	@Test
	public void testAdd(){
		
		System.out.println("测试方法1：Maven == junit ==执行testAdd()");
		
		//下面编写的是测试add方法是否正确的代码
		HelloMaven hello = new HelloMaven();
		
		int res = hello.add(10,20);
		
		//验证10+20是不是等于30，需要使用junit提供的方法来对比结果
		//junit包中的Assert中的一个方法
		//Assert.assertEquals(期望值，得到的实际值),该方法中如果两个值相等证明正确，不等则抛出异常
		Assert.assertEquals(30,res);
		
	}
	@Test
		public void testAdd2(){
			
			System.out.println("测试方法2：Maven == junit ==执行testAdd2()");
			
			//下面编写的是测试add方法是否正确的代码
			HelloMaven hello = new HelloMaven();
			
			int res = hello.add(10,20);
			
			//验证10+20是不是等于30，需要使用junit提供的方法来对比结果
			//junit包中的Assert中的一个方法
			//Assert.assertEquals(期望值，得到的实际值),该方法中如果两个值相等证明正确，不等则抛出异常
			Assert.assertEquals(30,res);
			
		}		

}