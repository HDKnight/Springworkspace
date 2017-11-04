package com.bean;

public class User {
	private String name;
	private int age;
	private Car car;
	
	public User(String name, Car car) {
		System.out.println("User(String name, Car car)!!");
		this.name = name;
		this.car = car;
	}
	public User(Car car,String name) {
		System.out.println("User(Car car,String name)!!");
		this.name = name;
		this.car = car;
	}
	public User(Integer name, Car car) {
		System.out.println("User(Integer name, Car car)!!");
		this.name = name+"";
		this.car = car;
	}
	
	public Car getCar() {
		return car;
	}
	public void setCar(Car car) {
		this.car = car;
	}
	public User() {
		System.out.println("这是User对象的空参构造！！");
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	
	public void setAge(int age) {
		this.age = age;	
	}
	public int getAge() {
		return age;	
	}
	public void init() { 
		System.out.println("我是初始化生命周期方法！");
	}
	public void destroy() {
		System.out.println("我是生命周期销毁方法！");
	}@Override
	public String toString() {
		
		return "User [name=" + name + ",age="+ age+ ",car=" + car + "]";
	}
}
