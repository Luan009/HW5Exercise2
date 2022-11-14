package HW5;

public class Professor extends Employee{
	
	
	//->Subclass
	
	
	private String name;
	private int employeeId;
	private Department department;
	
	public Professor(String name, int employeeId, Department department) {
		super(name, employeeId, department = department);
	}
	
	
	
	
	
	public void publicCourse() {
		
	}
	
	public void assignTA() {
		
		
	}
	
	public void addCourse() {
		
		System.out.println("Course added!");
		
	}

}
