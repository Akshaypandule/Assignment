package com.streamapi;

public class Course {
	
	private String courseName;
	private int courseduration;
	public Course(String courseName, int courseduration) {
		this.courseName = courseName;
		this.courseduration = courseduration;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public int getCourseduration() {
		return courseduration;
	}
	public void setCourseduration(int courseduration) {
		this.courseduration = courseduration;
	}
	@Override
	public String toString() {
		return "[courseName=" + courseName + ", courseduration=" + courseduration + "]";
	}
	

}
