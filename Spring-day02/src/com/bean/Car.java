package com.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

@Component("car")
public class Car {
	private String name;
	private String color;	
	@Value("玛萨拉蒂")
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	@Value("红色")
	public void setColor(String color) {
		this.color = color;
	}
	public String getColor() {
		return color;
	}
	
	@Override
	public String toString() {
		// TODO 自动生成的方法存根
		return "Car [name=" + name + ", color=" + color + "]";
	}

}
