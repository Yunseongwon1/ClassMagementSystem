package classes;

import java.util.Scanner;

import exception.ClassroomFormatException;

public abstract class ZoomClass extends Class {
	
	public ZoomClass(ClassKind kind) {
		super(kind);
	}

	@Override
	public abstract void getUserInput(Scanner input);

	@Override
	public void printInfo() {
		String skind = getKindString();
		System.out.println("Kind: "+ skind + "Class Name: " + ClassName + " Professor Name: " + ProfessorName + " Classroom: " + Classroom);
	}
	
	public void setClassroomwithYN(Scanner input) {
		char answer = 'x';
		while(answer != 'y' && answer != 'Y' && answer != 'n' && answer != 'N')
		{
			System.out.print("Does that class have a Classroom? (Y/N)");
			answer = input.next().charAt(0);
			try {
				if (answer == 'Y' || answer == 'y') {
					System.out.print("Classroom:");
					String classroom = input.next();
					this.setClassroom(classroom);
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

}
