import java.util.Scanner;

public class MenuManager {

	public static void main(String[] args) {
		int num = -1;
		Scanner input = new Scanner(System.in);
		ClassManager classmanager = new ClassManager(input);
		
		while (num != 5) {
			System.out.println("*** Class Management System Menu ***");
			System.out.println("1. Add the Class");
			System.out.println("2. Delete the Class");
			System.out.println("3. Edit the Class");
			System.out.println("4. View the Class");
			System.out.println("5. Exit");
			System.out.print("Select one number between 1 - 6 :");
			num = input.nextInt();
			
			if (num == 1) {
				classmanager.addClass();
			}
			else if (num == 2) {
				classmanager.deleteClass();
			}
			else if (num == 3) {
				classmanager.editClass();
			}
			else if (num == 4) {
				classmanager.viewClass();
			}
		}
	}

}
