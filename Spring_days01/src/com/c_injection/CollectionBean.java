package com.c_injection;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Properties;

import com.sun.xml.internal.bind.v2.runtime.reflect.Lister;

public class CollectionBean {
	private Object[] arr;	//数组类型注入
	private List list;   	//list、set 类型注入
	private Map map;     	//map类型注入
	private Properties prop;//properties类型注入
	
	public Object[] getArr() {
		return arr;
	}
	public List getList() {
		return list;
	}public Map getMap() {
		return map;
	}
	public Properties getProp() {
		return prop;
	}
	
	public void setArr(Object[] arr) {
		this.arr = arr;
	}
	public void setList(List list) {
		this.list = list;
	}
	public void setMap(Map map) {
		this.map = map;
	}
	public void setProp(Properties prop) {
		this.prop = prop;
	}
	@Override
	public String toString() {
		return "CollectionBean [arr=" + Arrays.toString(arr) + ", list=" + list + ", map=" + map + ", prop=" + prop
				+ "]";
	}

}
