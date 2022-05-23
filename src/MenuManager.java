import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.InputMismatchException;
import java.util.Scanner;

import log.EventLogger;

public class MenuManager {
	static EventLogger logger = new EventLogger("log.txt");

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		ClassManager classmanager = getObject("classmanager.ser");
		if(classmanager == null) {
			classmanager = new ClassManager(input);
		}

		selectMenu(input, classmanager);
		putObject(classmanager,"classmanager.ser");
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
					logger.log("add a class");
					break;
				case 2:
					classmanager.deleteClass();
					logger.log("delete a class");
					break;
				case 3:
					classmanager.editClass();
					logger.log("edit a class");
					break;
				case 4:
					classmanager.viewClasses();
					logger.log("view a list of class");
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
	
	public static ClassManager getObject(String filename) {
		ClassManager classmanager = null;
		
		try {
			FileInputStream file = new FileInputStream(filename);
			ObjectInputStream in = new ObjectInputStream(file);
			
			classmanager = (ClassManager)in.readObject();
			
			in.close();
			file.close();
		} catch (FileNotFoundException e) {
			return classmanager;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return classmanager;
	}
	
	public static void putObject(ClassManager classmanager, String filename) {
		try {
			FileOutputStream file = new FileOutputStream(filename);
			ObjectOutputStream out = new ObjectOutputStream(file);
			
			out.writeObject(classmanager);
			
			out.close();
			file.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


}
