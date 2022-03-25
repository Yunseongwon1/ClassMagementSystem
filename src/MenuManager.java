import java.util.Scanner;

public class MenuManager {
	
	public static void addClass() {
		Scanner input = new Scanner(System.in);
		System.out.print("Class Name:");
		String className = input.next();
		System.out.print("Professor Name:");
		String professorName = input.next();
		System.out.print("Classroom:");
		String classroom = input.next();
	}
	public static void deleteClass() {
		Scanner input = new Scanner(System.in);
		System.out.print("Class Name:");
		String className = input.next();
	}
	public static void editClass() {
		Scanner input = new Scanner(System.in);
		System.out.print("Class Name:");
		String className = input.next();
	}
	public static void viewClass() {
		Scanner input = new Scanner(System.in);
		System.out.print("Class Name:");
		String className = input.next();
	}

	public static void main(String[] args) {
		int num = 0;
		Scanner input = new Scanner(System.in);
		
		while (num != 6) {
			System.out.println("*** Class Management Sysytem Menu ***");
			System.out.println("1. Add the Class");
			System.out.println("2. Delete the Class");
			System.out.println("3. Edit the Class");
			System.out.println("4. View the Class");
			System.out.println("5. Show a menu");
			System.out.println("6. Exit");
			System.out.print("Select one number between 1 - 6 :");
			num = input.nextInt();
			
			if (num == 1) {
				addClass();
			}
			else if (num == 2) {
				deleteClass();
			}
			else if (num == 3) {
				editClass();
			}
			else if (num == 4) {
				viewClass();
			}
		}
	}

}
