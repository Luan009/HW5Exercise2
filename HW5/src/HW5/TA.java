package HW5;

import java.util.ArrayList;

public class TA {
	
	private String name;
	private Course course;
	
	
	
	public TA(String name, Course course) {
		this.name = name;
		this.course = course;
	}
	
	public Course getCourse() {
		return course;
	}
	
	
	public String getName() {
		return null;
	}
	
	
	public void extendContract(Course course) {
		System.out.println("Contract of the Course " + course +  " extended!");
	}
	
	
	public void setName(String name) {
		this.name = name;
	}
	
	
		
	
	
		
	}


