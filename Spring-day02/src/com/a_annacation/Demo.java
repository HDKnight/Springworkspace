package com.a_annacation;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bean.User;

public class Demo {
	@Test
	/**
	 * ������ʽһ���ղι���
	 */
	public void fun1() {
		// 1.������������
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		// 2.������Ҫuser����
		User u1= (User)ac.getBean("user");
		User u2= (User)ac.getBean("user");
		// 3.��ӡuser����
		System.out.println(u1==u2);
		System.out.println(u2);
		((AbstractApplicationContext) ac).close();
	}
}
