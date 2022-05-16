import java.util.InputMismatchException;
import java.util.Scanner;

public class MenuManager {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		ClassManager classmanager = new ClassManager(input);
		
		selectMenu(input, classmanager);
	}
	
	public static void  selectMenu(Scanner input,ClassManager classmanager ) {
		int num = -1;
		while (num != 5) {
			try {
				showMenu();
				num = input.nextInt();
				switch(num) {
				case 1:
					classmanager.addClass();
					break;
				case 2:
					classmanager.deleteClass();
					break;
				case 3:
					classmanager.editClass();
					break;
				case 4:
					classmanager.viewClasses();
					break;
				default:
					continue;
				}
			}
			catch(InputMismatchException e) {
				System.out.println("Please put a integer between 1 and 5!");
				if(input.hasNext()) {
					input.next();
				}
				num = -1;
			}
		}
	}
	
	public static void  showMenu() {
		System.out.println("*** Class Management System Menu ***");
		System.out.println("1. Add the Class");
		System.out.println("2. Delete the Class");
		System.out.println("3. Edit the Class");
		System.out.println("4. View the Classes");
		System.out.println("5. Exit");
		System.out.print("Select one number between 1 - 6 :");
	}

}
