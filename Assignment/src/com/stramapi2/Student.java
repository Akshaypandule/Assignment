package com.stramapi2;

import java.util.List;

import com.streamapi.Course;

public class Student {
	
	private int rollNum;
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
	
}
