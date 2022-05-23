import java.io.Serializable;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

import classes.ClassInput;
import classes.ClassKind;
import classes.DynamicClass;
import classes.ElectiveClass;
import classes.ProgrammingClass;

public class ClassManager implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -2031849398981426564L;
	
	ArrayList<ClassInput> classes = new ArrayList<ClassInput>();
	transient Scanner input;
	ClassManager(Scanner input){
		this.input = input;
	}
	
	public void addClass() {
		int kind = 0;
		ClassInput classInput;
		while (kind < 1 || kind > 3 ) {
			try {
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
			catch(InputMismatchException e) {
				System.out.println("Please put a integer between 1 and 3!");
				if(input.hasNext()) {
					input.next();
				}
				kind = -1;
			}
		}
		
	}
	
	public void deleteClass() {
		System.out.print("Class Name:");
		String ClassName = input.next();
		int index = findIndex(ClassName);
		removefromClasses(index, ClassName);
	}
	
	public int removefromClasses(int index, String ClassName) {
		if (index >= 0) {
			classes.remove(index);
			System.out.println("the class " + ClassName + " is deleted");
			return 1;
		}
		else {
			System.out.println("the class has not been registered");
			return -1;
		}
	}
	
	public int findIndex(String ClassName) {
		int index = -1;
		for (int i = 0; i<classes.size(); i++) {
			if (classes.get(i).getClassName().equals(ClassName)) {
				index = i;
				break;
			}
		}
		return index;
	}
	
	public void editClass() {
		System.out.print("Class Name:");
		String ClassName = input.next();
		for (int i = 0; i<classes.size(); i++) {
			ClassInput classInput = classes.get(i);
			if (classInput.getClassName().equals(ClassName)) {
				int num = -1;
				while (num != 5) {
					showEditMenu();
					num = input.nextInt();
					switch(num) {
					case 1:
						classInput.setClassName(input);
						break;
					case 2:
						classInput.setProfessorName(input);
						break;
					case 3:
						classInput.setClassroom(input);
						break;
					default:
						continue;
					}
				} // while
				break;
		} // if
		} // for
	}
	public void viewClasses() {
		System.out.println("# of registered classes: " + classes.size());
		for (int i = 0; i<classes.size(); i++) {
			classes.get(i).printInfo();
		}
	}
	
	public void showEditMenu() {
		System.out.println("** Class Info Edit Menu **");
		System.out.println(" 1. Edit ClassName");
		System.out.println(" 2. Edit ProfessorName");
		System.out.println(" 3. View Classroom");
		System.out.println(" 4. Exit");
		System.out.print("Select one number between 1 - 4: ");
	}
}
