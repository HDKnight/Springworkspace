package com.bean;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

// <bean name="user" class="com.bean.User" />
//@Component("user")
//	@Service("user")	//service层
//	@Controller("user") //web层
	@Repository("user") //dao层
//指定对象的作用范围
@Scope(scopeName="singleton")
public class User {
//	@Value("tom")//通过反射的Filed赋值，破坏了类的封装性
	private String name;
	private int age;
	private Car car;
		
	public Car getCar() {
		return car;
	}
//	@Autowired //自动装配. 问题：如果匹配多个类型一致的对象，将无法选择具体注入哪一个对象
//	@Qualifier("car2")//使用Qualifier注解告诉Spring容器自动装配哪个名称的对象
	@Resource(name="car2")//手动注入，指定注入哪个名称的对象
	public void setCar(Car car) {
		this.car = car;
	}
	@Value("tom")//通过set方法赋值，推荐使用
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	@Value("20")
	public void setAge(int age) {
		this.age = age;	
	}
	public int getAge() {
		return age;	
	}
	@PostConstruct//在对象被创建后 调用. init-method
	public void init() { 
		System.out.println("我是初始化生命周期方法！");
	}
	@PreDestroy  //在对象销毁之前调用. destroy-method
	public void destroy() {
		System.out.println("我是生命周期销毁方法！");
	}@Override
	public String toString() {
		// TODO 自动生成的方法存根
		return "User [name=" + name + ",age="+ age+ ",car=" + car + "]";
	}
}
