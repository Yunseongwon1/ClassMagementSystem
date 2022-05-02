package classes;

import java.util.Scanner;

public class Class {
	protected ClassKind kind = ClassKind.Dynamic;
	protected String ClassName;
	protected String ProfessorName;
	protected String Classroom;
	
	public Class() {
		
	}
	public Class(ClassKind kind) {
		this.kind = kind;
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
	public Class(ClassKind kind, String ClassName, String ProfessorName, String Classroom) {
		this.kind = kind;
		this.ClassName = ClassName;
		this.ProfessorName = ProfessorName;
		this.Classroom = Classroom;
	}
	public ClassKind getKind() {
		return kind;
	}
	public void setKind(ClassKind kind) {
		this.kind = kind;
	}
	public String getClassName() {
		return ClassName;
	}
	public void setClassName(String className) {
		ClassName = className;
	}
	public String getProfessorName() {
		return ProfessorName;
	}
	public void setProfessorName(String professorName) {
		ProfessorName = professorName;
	}
	public String getClassroom() {
		return Classroom;
	}
	public void setClassroom(String classroom) {
		Classroom = classroom;
	}
	
	public void printInfo() {
		String skind = "none";
		switch(this.kind) {
		case Dynamic:
			skind = "Dynamic.";
			break;
		case Programming:
			skind = "Programming.";
			break;
		case Elective:
			skind = "Elective.";
			break;
		default:
		}
		System.out.println("Kind: "+ skind + "Class Name: " + ClassName + " Professor Name: " + ProfessorName + " Classroom: " + Classroom);
	}
	
	public void getUserInput(Scanner input) {
		System.out.print("Class Name:");
		String classname = input.next();
		this.setClassName(classname);
		
		System.out.print("Professor Name:");
		String professorname = input.next();
		this.setProfessorName(professorname);
		
		System.out.print("Classroom:");
		String classroom = input.next();
		this.setClassroom(classroom);
	}
}

