package com.stramapi2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.streamapi.Course;
import com.streamapi.Student;

public class main2 {
	
	
	public static void main(String[] args) {
		
		List<Student>students=new ArrayList<>();
		
		
		 students.add(new Student(1, "Akshay", 26, "male", Arrays.asList(
		            new Course("Java Full Stack", 10)
		        )));
		 students.add(new Student(2, "Mangesh", 24, "male", Arrays.asList(
				 new Course("java fullstack", 10),
				 new Course("Data Science",8)
				 )));
		 students.add(new Student(3, "Priya", 23, "Female",Arrays.asList(
				 new Course("Python Developer", 6))));
		 
		 students.add(new Student(4, "Punam", 21, "Female", Arrays.asList(new Course("Data Science", 10))));
		
		
	}
	
	
	

}
