package HW5;

import java.util.ArrayList;

public class Department {
	
	
	private String name;
	private Employee employee;
	
	
	Department(String name, Employee employee) {
		this.name = name;
		this.employee = employee;
	}
	
	
	ArrayList <Course> courses = new ArrayList();
	
	//->one-to-many association, da ein Department mehrere Kurse haben kann und ein Kurs nur
	//einem Department angehören kann

}
