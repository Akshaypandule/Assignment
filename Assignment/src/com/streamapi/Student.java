package com.streamapi;


import java.util.List;

public class Student {
	
	public int rollNum;
	private String name;
	private int age;
	private String gender;
	List<Course> course;
	

	public Student(int rollNum, String name, int age, String gender, List<Course> course) {
		
		this.rollNum = rollNum;
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.course = course;
	}

	public int getRollNum() {
		return rollNum;
	}

	public void setRollNum(int rollNum) {
		this.rollNum = rollNum;
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

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public List<Course> getCourse() {
		return course;
	}

	public void setCourse(List<Course> course) {
		this.course = course;
	}

	@Override
	public String toString() {
		return " [rollNum=" + this.rollNum + ", name=" +this.name + ", age=" + this.age + ", gender=" + this.gender + ", course="
				+ this.course + "]";
	}

}
