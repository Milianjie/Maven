package com.studymyself;

import org.junit.Assert;
import org.junit.Test;
import com.studymyself.HelloMaven;

public class TestHelloMaven{

	@Test
	public void testAdd(){
		
		System.out.println("���Է���1��Maven == junit ==ִ��testAdd()");
		
		//�����д���ǲ���add�����Ƿ���ȷ�Ĵ���
		HelloMaven hello = new HelloMaven();
		
		int res = hello.add(10,20);
		
		//��֤10+20�ǲ��ǵ���30����Ҫʹ��junit�ṩ�ķ������ԱȽ��
		//junit���е�Assert�е�һ������
		//Assert.assertEquals(����ֵ���õ���ʵ��ֵ),�÷������������ֵ���֤����ȷ���������׳��쳣
		Assert.assertEquals(30,res);
		
	}
	@Test
		public void testAdd2(){
			
			System.out.println("���Է���2��Maven == junit ==ִ��testAdd2()");
			
			//�����д���ǲ���add�����Ƿ���ȷ�Ĵ���
			HelloMaven hello = new HelloMaven();
			
			int res = hello.add(10,20);
			
			//��֤10+20�ǲ��ǵ���30����Ҫʹ��junit�ṩ�ķ������ԱȽ��
			//junit���е�Assert�е�һ������
			//Assert.assertEquals(����ֵ���õ���ʵ��ֵ),�÷������������ֵ���֤����ȷ���������׳��쳣
			Assert.assertEquals(30,res);
			
		}		

}