package classes;

import java.util.Scanner;

public class DynamicClass extends Class {
	
	public DynamicClass(ClassKind kind) {
		super(kind);
	}
	
	public void getUserInput(Scanner input) {
		setClassName(input);
		setProfessorName(input);
		setClassroom(input);
	}
	
	public void printInfo() {
		String skind = getKindString();
		System.out.println("Kind: "+ skind + "Class Name: " + ClassName + " Professor Name: " + ProfessorName + " Classroom: " + Classroom);
	}
}
