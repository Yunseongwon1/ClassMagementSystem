package gui;

import java.util.Vector;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import classes.ClassInput;
import manager.ClassManager;

public class ClassViewer extends JPanel{
	
	WindowFrame frame;
	ClassManager classmanager;

	public ClassViewer(WindowFrame frame, ClassManager classmanager) {
		this.frame = frame;
		this.classmanager = classmanager;
		
		System.out.println("***" + classmanager.size() + "***");

		DefaultTableModel model = new DefaultTableModel();
		model.addColumn("CLASSNAME");
		model.addColumn("PROFESSORNAME");
		model.addColumn("CLASSROOM");
		
		for(int i = 0; i < classmanager.size(); i++) {
			Vector row = new Vector();
			ClassInput ci = classmanager.get(i);
			row.add(ci.getClassName());
			row.add(ci.getProfessorName());
			row.add(ci.getClassroom());
			model.addRow(row);
		}
		
		JTable table = new JTable(model);
		JScrollPane sp = new JScrollPane(table);
		
		this.add(sp);
	}

}
