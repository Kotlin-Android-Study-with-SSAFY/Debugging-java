package com.ssafy.equals;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

import com.ssafy.util.SHA256;

/*
 * Person 객체 설명
 * id, name, age 값이 모두 같을 때만 같은 Person 객체라고 인식합니다.
 */
public class Person {
	private String id;
    private String name;
    private int age;

    // ID를 자동으로 생성하는 생성자
    public Person(String name, int age) {
    	this.id = SHA256.generateID();
        this.name = name;
        this.age = age;
    }
    
    public Person(String id, String name, int age) {
    	this.id = id;
        this.name = name;
        this.age = age;
    }

    
    public String getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
    public boolean equals(Object obj) {

    }

    @Override
    public int hashCode() {

    }
    
    @Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", age=" + age + "]";
	}
}
