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
//	@Service("user")	//service��
//	@Controller("user") //web��
	@Repository("user") //dao��
//ָ����������÷�Χ
@Scope(scopeName="singleton")
public class User {
//	@Value("tom")//ͨ�������Filed��ֵ���ƻ�����ķ�װ��
	private String name;
	private int age;
	private Car car;
		
	public Car getCar() {
		return car;
	}
//	@Autowired //�Զ�װ��. ���⣺���ƥ��������һ�µĶ��󣬽��޷�ѡ�����ע����һ������
//	@Qualifier("car2")//ʹ��Qualifierע�����Spring�����Զ�װ���ĸ����ƵĶ���
	@Resource(name="car2")//�ֶ�ע�룬ָ��ע���ĸ����ƵĶ���
	public void setCar(Car car) {
		this.car = car;
	}
	@Value("tom")//ͨ��set������ֵ���Ƽ�ʹ��
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
	@PostConstruct//�ڶ��󱻴����� ����. init-method
	public void init() { 
		System.out.println("���ǳ�ʼ���������ڷ�����");
	}
	@PreDestroy  //�ڶ�������֮ǰ����. destroy-method
	public void destroy() {
		System.out.println("���������������ٷ�����");
	}@Override
	public String toString() {
		// TODO �Զ����ɵķ������
		return "User [name=" + name + ",age="+ age+ ",car=" + car + "]";
	}
}
