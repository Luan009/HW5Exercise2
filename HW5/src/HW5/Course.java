package HW5;

import java.util.ArrayList;

public class Course {
	
	
	private int id;
	private String name;
	private int maxCapacity;
	private boolean isFull;
	
	private Professor prof;
	
	
	
	public Course(int id, String name, int cap, Professor prof) {
		this.id = id;
		this.name = name;
		this.maxCapacity = cap;
		this.prof = prof;
		
	}
	
	
		
		
		public void setMaxCap(int max) {
			this.maxCapacity = max;
			
		}
		
		Student[] students = new Student[maxCapacity];		//Kursteilnehmer
		
		//-> many to many Association, da mehrere Kursteilnehmer mehrere
		//Kurse haben können
		
		
		ArrayList <Project> ta = new ArrayList();		//Ein Kurs kann beliebig viele TA's haben
		
		
		
		
		
	
	public void enroll(Student student) {
		
		if(students[students.length-1]!=null) {
			isFull = false;
		} else {
			isFull = true;
		}
		
		
		if(isFull == false) {							//Wenn noch Platz ist, wird der Student eingeschrieben
			
		for(int i = 0; i < students.length; i++) {
			
			if(students[i]== null) {
				
				students[i] = student;
				continue;
			}
		}
		
		}
		
		
	}
	
	
	
	public void apply(TA ta) {
		
		
		System.out.println("TA Applied!");
	}
	
	
	
	public Professor getProf() {
		return prof;
	}
	
//	public TA getTA() {
//		
//		TA ta = new TA(this);
//		
//	}
	
	public void setTA() {
		
	}
	
	
	public void setName(String name) {
		this.name = name;
	}
	
	
	
	
	
	

}



