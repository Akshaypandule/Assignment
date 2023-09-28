package com.streamapi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class Main {
	
	
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
		 
		 
		 for(Student student:students) {
			 System.out.println(student);
		 }
		 System.out.println("===================================================");
		 
		 
		 // Make a list all Male students
		 
		 //List<Student> malestudeList=students.stream().filter(student->"male".equalsIgnoreCase(students.getGender())).collect(Collectors.toList());
		 List<Student> maleStudentList = students.stream()
				    .filter(student -> "male".equalsIgnoreCase(student.getGender()))
				    .collect(Collectors.toList());
		 
		 System.out.print(maleStudentList);
		 System.out.println("============================================================");
		 
		//  Make a list of names of all Female student's with age less than 25yrs 
		 
		 List<Student> femalestudent=students.stream().filter(student->"female".equalsIgnoreCase(student.getGender()) 
				 && student.getAge()<25).collect(Collectors.toList());
		 
		 System.out.println("============================================================");
		 System.out.println(femalestudent);
		 
		// Update age of all students by 2yrs
		 
		students.forEach(student->student.setAge(student.getAge()+2));
		System.out.println(students);
		
		System.out.println();
		
		// List students who subscribed to "Java Full Stack" course 
		
		List<Student> javaFullStackStudents = students.stream()
		        .filter(student -> student.getCourse().stream()
		                .anyMatch(course -> "Java Full Stack".equalsIgnoreCase(course.getCourseName().trim())))
		        .collect(Collectors.toList());
		javaFullStackStudents.forEach(student->System.out.println(student.getName()));
		
		
		//Identify all the gender names from the student list
		
		//List<Student>gendername=students.stream().filter(student->students.getGender()).distinct().collect(Collectors.toList());
		Set<String> uniquegender=students.stream().map(student->student.getGender()).collect(Collectors.toSet());
		
		System.out.println(uniquegender);
		
		// Check if any student with age > 50
		
		boolean checkabove50=students.stream().anyMatch(student->student.getAge()>50);
		if(checkabove50) {
			System.out.println("No any above 50");
		}
		else
		{
			System.out.println("above 50 age students avaliable");
		}
		
		
		// Make a set of all the Course which are subscribed by students
		
		Set<Course> allcourse=students.stream().flatMap(student->student.course.stream()).collect(Collectors.toSet());
		allcourse.forEach(course->System.out.println(course.getCourseName()));
		
		
		
		//  Make List of all students which are subscribed to only one Course
		
		List<Student> onlyonecourse=students.stream().filter(student->student.getCourse().size()==1).collect(Collectors.toList());
		System.out.println(onlyonecourse);
		
		onlyonecourse.forEach(student->System.out.println(student.getName()));
		System.out.println("========================================================================");
		
		
		System.out.println();
		
		// Make List of all students which are subscribed to a Course with duration more tha 6 months
		
		List<Student> durationmorethasix=students.stream().filter(student->student.getCourse().stream().
				anyMatch(course->course.getCourseduration()>6)).collect(Collectors.toList());
		System.out.println(durationmorethasix);
		
		
//		Map<Integer, String> rollNumberToNameMap = students.stream()
//                .collect(Collectors.toMap(student -> student.rollNo, student -> student.name));
		System.out.println("=========================================================================");
		 // Create a Map that maps roll numbers to names
        Map<Object, Object> rollNumberToNameMap = students.stream()
                .collect(Collectors.toMap(student -> student.getRollNum(), student -> student.getName()));

        // Print the roll number to name mapping
        System.out.println("Roll Number to Name Map:");
        rollNumberToNameMap.forEach((rollNo, name) -> System.out.println("Roll No: " + rollNo + ", Name: " + name));
        
        
        
       //  Create Course name to duration Map out of given student list
        
//        Map<String, Integer> courseNameToDurationMap = students.stream()
//                .flatMap(student -> student.getCourse().stream())
//                .collect(Collectors.toMap(Course::getCourseName, Course::getCourseduration));
////        Map<String,Integer> courseNameTodurationMap=students.stream()
////        		.flatMap(student->student.getCourse().stream()).collect(Collectors.toMap(Course::getCourseName, Course::getCourseduration));
//        System.out.println("Course Name to duration Map:");
//        courseNameToDurationMap.forEach((coursename,duration)->System.out.println("course Name"+coursename+" "+"duration"+duration));
        
		
        
        double averageAgeOfFemaleStudents = students.stream()
                .filter(student -> student.getGender().equalsIgnoreCase("Female"))
                .mapToInt(Student::getAge)
                .average()
                .orElse(0.0);
        System.out.println("Average Age of Female Students: " + averageAgeOfFemaleStudents);
        
        
       
        
        
        
        List<Student>sortStudents=students.stream().sorted(Comparator.comparing(Student::getName).thenComparingInt(Student::getAge)
        		).collect(Collectors.toList());
        
        System.out.println("Students sorted by name and age:");
        sortStudents.forEach(student -> System.out.println(student.getName() + " - " + student.getAge() + " years old"));
        
        
        // sort student on basis of class joins
        
        List<Student> sortoncoursejoin=students.stream()
        		.sorted(Comparator.comparingInt(student->student.getCourse().size()))
        		.collect(Collectors.toList());
        sortoncoursejoin.forEach(student->System.out.println(student.getName()+"- "+student.getCourse()));
        

	
	}

}
