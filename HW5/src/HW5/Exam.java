package HW5;

import java.util.ArrayList;

public class Exam {
	
	private int maxValue;
	
	private Question question;
	//->Composition durch Instanzvariable der jeweiligen Klasse
	
	
	
	
	//public boolean register(Student student) {
	//}
	
	
	ArrayList <Student> registeredStudents = new ArrayList();

	ArrayList <Question> questions = new ArrayList();
	//->1...* multiplicitiy

	
	
	public void addQuestion(int id, String task, int value) {
	
		question = new Question(id,task,value);
		questions.add(question);
		
		
	}
	
	
	
	
	public ArrayList<Student> getRegisteredStudents() {
		return registeredStudents;
	}
	
	
	public void setMaxValue(int max) {
		this.maxValue = max;
	}

}
