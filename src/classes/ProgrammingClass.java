package classes;

import java.util.Scanner;

public class ProgrammingClass extends ZoomClass {
	
	public ProgrammingClass(ClassKind kind) {
		super(kind);
	}
	
	public void getUserInput(Scanner input) {
		setClassName(input);
		setProfessorName(input);
		setClassroomwithYN(input);
	}
}
