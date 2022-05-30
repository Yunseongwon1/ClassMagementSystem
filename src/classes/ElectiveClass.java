package classes;

import java.util.Scanner;

import exception.ClassroomFormatException;

public class ElectiveClass extends ZoomClass {
	
	protected String ElectiveClassroom;
	
	public ElectiveClass(ClassKind kind) {
		super(kind);
	}
	
	public void getUserInput(Scanner input) {
		setClassName(input);
		setProfessorName(input);
		setClassroomwithYN(input);
		setZommClassroomwithYN(input);
	}
	
	public void setZommClassroomwithYN(Scanner input) {
		char answer = 'x';
		while(answer != 'y' && answer != 'Y' && answer != 'n' && answer != 'N')
		{
			System.out.print("Does that class have a Elective Classroom? (Y/N)");
			answer = input.next().charAt(0);
			
			try {
				if (answer == 'Y' || answer == 'y') {
					setClassroom(input);
					break;
				}
				else if(answer == 'n' || answer == 'N') {
					this.setClassroom("");
					break;
				}
				else {
				}
			}
			catch(ClassroomFormatException e) {
				System.out.println("Incorrect Classroom Format. put the classroom that contains µ¿");
			}
		}
	}
	
	public void printInfo() {
		String skind = getKindString();
		System.out.println("Kind: "+ skind + "Class Name: " + ClassName + " Professor Name: " + ProfessorName + " Classroom: " + Classroom + "Elective Classroom: " + Classroom);
	}
}
