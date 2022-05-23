package classes;

import java.io.Serializable;
import java.util.Scanner;

import exception.ClassroomFormatException;

public abstract class Class implements ClassInput, Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -303644683496282707L;
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
		this.ClassName = className;
	}
	
	public String getProfessorName() {
		return ProfessorName;
	}
	
	public void setProfessorName(String professorName) {
		this.ProfessorName = professorName;
	}
	
	public String getClassroom() {
		return Classroom;
	}
	
	public void setClassroom(String classroom) throws ClassroomFormatException {
		if(!classroom.contains("µ¿") && !classroom.equals("")) {
			throw new ClassroomFormatException();
		}
		
		this.Classroom = classroom;
	}
	
	public abstract void printInfo();
	
	public void setClassName(Scanner input) {
		System.out.print("Class Name: ");
		String classname = input.next();
		this.setClassName(classname);
	}
	 
	public void setProfessorName(Scanner input) {
		System.out.print("Professor Name: ");
		String professorname = input.next();
		this.setProfessorName(professorname);
	}
	
	public void setClassroom(Scanner input) {
		String classroom = "";
		while(!classroom.contains("µ¿")) {
			System.out.print("Classroom: ");
			classroom = input.next();
			try {
				this.setClassroom(classroom);
			} catch (ClassroomFormatException e) {
				System.out.println("Incorrect Classroom Format. put the classroom that contains µ¿");
			}
		}
	}
	
	public String getKindString() {
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
		return skind;
	}
}

