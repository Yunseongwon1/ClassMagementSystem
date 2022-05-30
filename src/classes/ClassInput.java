package classes;

import java.util.Scanner;

import exception.ClassroomFormatException;

public interface ClassInput {
	
	public String getClassName();
	
	public void setClassName(String className);
	
	public void setProfessorName(String professorName);
	
	public void setClassroom(String classroom) throws ClassroomFormatException;
	
	public void getUserInput(Scanner input);
	
	public void printInfo();
	
	public void setClassName(Scanner input);
	
	public void setProfessorName(Scanner input);
	
	public void setClassroom(Scanner input);
}
