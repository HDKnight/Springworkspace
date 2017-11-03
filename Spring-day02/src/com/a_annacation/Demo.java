package com.a_annacation;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bean.User;

public class Demo {
	@Test
	/**
	 * 创建方式一：空参构造
	 */
	public void fun1() {
		// 1.创建容器对象
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		// 2.向容器要user对象
		User u1= (User)ac.getBean("user");
		User u2= (User)ac.getBean("user");
		// 3.打印user对象
		System.out.println(u1==u2);
		System.out.println(u2);
		((AbstractApplicationContext) ac).close();
	}
}
