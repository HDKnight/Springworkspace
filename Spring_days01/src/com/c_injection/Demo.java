package com.c_injection;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bean.User;

public class Demo {
	/**
	 * 创建方式一：空参构造
	 */
	@Test
	public void fun1() {
		// 1.创建容器对象
		ApplicationContext ac = new ClassPathXmlApplicationContext("com\\c_injection\\applicationContext.xml");
		// 2.向容器要user对象
		User u= (User)ac.getBean("user");
		// 3.打印user对象
		System.out.println(u);
	}
	/**
	 * 构造函数注入
	 */
	@Test
	public void fun2() {
		// 1.创建容器对象
		ApplicationContext ac = new ClassPathXmlApplicationContext("com\\c_injection\\applicationContext.xml");
		// 2.向容器要user对象
		User u= (User)ac.getBean("user2");
		// 3.打印user对象
		System.out.println(u);
	}
	/**
	 *  P名称注入方式: 走set方法
	 */
	@Test
	public void fun3() {
		// 1.创建容器对象
		ApplicationContext ac = new ClassPathXmlApplicationContext("com\\c_injection\\applicationContext.xml");
		// 2.向容器要user对象
		User u= (User)ac.getBean("user3");
		// 3.打印user对象
		System.out.println(u);
	}
	/**
	 * spel注入：spring Expression Language spring表达式语言
	 */
	@Test
	public void fun4() {
		// 1.创建容器对象
		ApplicationContext ac = new ClassPathXmlApplicationContext("com\\c_injection\\applicationContext.xml");
		// 2.向容器要user对象
		User u= (User)ac.getBean("user4");
		// 3.打印user对象
		System.out.println(u);
	}
	/**
	 *  复杂类型关注入
	 */
	@Test
	public void fun5() {
		// 1.创建容器对象
		ApplicationContext ac = new ClassPathXmlApplicationContext("com\\c_injection\\applicationContext.xml");
		// 2.向容器要user对象
		CollectionBean cb= (CollectionBean)ac.getBean("cb");
		// 3.打印user对象
		System.out.println(cb);
	}
}
