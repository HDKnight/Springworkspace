package com.bean;

public class Car {
	private String name;
	private String color;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	@Override
	public String toString() {
		// TODO 自动生成的方法存根
		return "Car [name=" + name + ", color=" + color + "]";
	}

}
