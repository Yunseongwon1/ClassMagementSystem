
public class Class {
	String ClassName;
	String ProfessorName;
	String Classroom;
	
	public Class() {
		
	}
	public Class(String ClassName, String ProfessorName) {
		this.ClassName = ClassName;
		this.ProfessorName = ProfessorName;
	}
	public Class(String ClassName, String ProfessorName, String Classroom) {
		this.ClassName = ClassName;
		this.ProfessorName = ProfessorName;
		this.Classroom = Classroom;
	}
	
	public void printInfo() {
		System.out.println("Class Name :" + ClassName + "Professor Name :" + ProfessorName + "Classroom : " + Classroom);
	}
}

