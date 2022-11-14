package HW5;

import java.util.ArrayList;

public class Project {
	
	
	private String name;
	
	ArrayList <Student> students = new ArrayList();
	//->one to many association
	
	
	
	
	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	
	public void addMember(Student student) {
		students.add(student);
	}
	
	public ArrayList<Student> getMembers( ) {
		return students;
	}

}
