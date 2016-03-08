package com.dongwt.spring.ioc.service;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.stereotype.Service;

import com.dongwt.spring.ioc.bean.User;

@Service
public class XmlService {

	private String name;
	private Integer age;
	private User user;
	private Map<String, String> maps;
	private Set<String> sets;
	private List<String> lists;

	public XmlService() {
	}

	public XmlService(String name, Integer age, User user, Map<String, String> maps, Set<String> sets, List<String> lists) {
		super();
		this.name = name;
		this.age = age;
		this.user = user;
		this.maps = maps;
		this.sets = sets;
		this.lists = lists;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Map<String, String> getMaps() {
		return maps;
	}

	public void setMaps(Map<String, String> maps) {
		this.maps = maps;
	}

	public Set<String> getSets() {
		return sets;
	}

	public void setSets(Set<String> sets) {
		this.sets = sets;
	}

	public List<String> getLists() {
		return lists;
	}

	public void setLists(List<String> lists) {
		this.lists = lists;
	}

	public void init() {
		System.out.println("init");
	}

	public void destory() {
		System.out.println("destory");
	}

	@Override
	public String toString() {
		return "name: " + this.name + " age: " + this.age + "\r\n" + "user: " + this.user + "\r\n" + "maps: " + maps + "\r\n" + "sets:" + sets + "\r\n" + "lists:" + lists;
	}

}
