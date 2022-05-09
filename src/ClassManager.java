import java.util.ArrayList;
import java.util.Scanner;

import classes.Class;
import classes.ClassInput;
import classes.ClassKind;
import classes.DynamicClass;
import classes.ElectiveClass;
import classes.ProgrammingClass;

public class ClassManager {
	ArrayList<ClassInput> classes = new ArrayList<ClassInput>();
	Scanner input;
	ClassManager(Scanner input){
		this.input = input;
	}
	
	public void addClass() {
		int kind = 0;
		ClassInput classInput;
		while (kind != 1 && kind != 2 ) {
			System.out.println("1 for Dynamic ");
			System.out.println("2 for Programming ");
			System.out.println("3 for Elective ");
			System.out.println("Select num 1, 2, or 3 for Class Kind: ");
			kind = input.nextInt();
			if (kind == 1) {
				classInput = new DynamicClass(ClassKind.Dynamic);
				classInput.getUserInput(input);
				classes.add(classInput);
				break;
			}
			else if (kind == 2) {
				classInput = new ProgrammingClass(ClassKind.Programming);
				classInput.getUserInput(input);
				classes.add(classInput);
				break;
			}
			else if (kind == 3) {
				classInput = new ElectiveClass(ClassKind.Elective);
				classInput.getUserInput(input);
				classes.add(classInput);
				break;
			}
			else {
				System.out.print("Select num for Class Kind between 1 and 2: ");
			}
		}
		
	}
	
	public void deleteClass() {
		System.out.print("Class Name:");
		String ClassName = input.next();
		int index = -1;
		for (int i = 0; i<classes.size(); i++) {
			if (classes.get(i).getClassName().equals(ClassName)) {
				index = i;
				break;
			}
		}
		
		if (index >= 0) {
			classes.remove(index);
			System.out.println("the class " + ClassName + " is deleted");
		}
		else {
			System.out.println("the class has not been registered");
			return;
		}
		
	}
	public void editClass() {
		System.out.print("Class Name:");
		String ClassName = input.next();
		for (int i = 0; i<classes.size(); i++) {
			ClassInput classInput = classes.get(i);
			if (classInput.getClassName().equals(ClassName)) {
				int num = -1;
				while (num != 5) {
					System.out.println("** Class Info Edit Menu **");
					System.out.println(" 1. Edit ClassName");
					System.out.println(" 2. Edit ProfessorName");
					System.out.println(" 3. View Classroom");
					System.out.println(" 4. Exit");
					System.out.print("Select one number between 1 - 4: ");
					num = input.nextInt();
					if (num == 1) {
						System.out.print("Class Name: ");
						String classname = input.next();
						classInput.setClassName(classname);
					}
					else if (num == 2) {
						System.out.print("Professor Name: ");
						String professorname = input.next();
						classInput.setProfessorName(professorname);
					}
					else if (num == 3) {
						System.out.print("Classroom: ");
						String classroom = input.next();
						classInput.setClassroom(classroom);
					}
					else {
						continue;
					} // else
				} // while
				break;
		} // if
		} // for
	}
	public void viewClasses() {
//		System.out.print("Class Name:");
//		String ClassName = input.next();
		System.out.println("# of registered classes: " + classes.size());
		for (int i = 0; i<classes.size(); i++) {
			classes.get(i).printInfo();
		}
	}
}
