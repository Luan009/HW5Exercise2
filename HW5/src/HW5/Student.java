package HW5;

public class Student {

	
	private int id;
	private String name;
	
	private final Project project;
	//->Aggregation
	
	
	public Student(int id, String name, Project project) {
		this.id = id;
		this.name = name;
		this.project = project;
		
	}
	
	public String getName() {
		return name;
	}
	
	public Project getProject() {
		return project;
	}
}
