import java.util.Scanner;

public class ClassManager {
	Class class1;
	
	Scanner input;
	ClassManager(Scanner input){
		this.input = input;
	}
	
	public void addClass() {
		class1 = new Class();
		System.out.print("Class Name:");
		class1.ClassName = input.next();
		System.out.print("Professor Name:");
		class1.ProfessorName = input.next();
		System.out.print("Classroom:");
		class1.Classroom = input.next();
	}
	
	public void deleteClass() {
		System.out.print("Class Name:");
		String ClassName = input.next();
		if (class1 == null) {
			System.out.println("the class has not been registered");
			return;
		}
		if (class1.ClassName.equals(ClassName)) {
			class1 = null;
			System.out.println("the class is deleted");
		}
	}
	public void editClass() {
		System.out.print("Class Name:");
		String ClassName = input.next();
		if (class1.ClassName.equals(ClassName)) {
			System.out.println("the class to be edited is " + ClassName);
		}
	}
	public void viewClass() {
		System.out.print("Class Name:");
		String ClassName = input.next();
		if (class1.ClassName.equals(ClassName)) {
			class1.printInfo();
		}
	}
}
