package gui;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SpringLayout;

import event.ClassAdderCancelListener;
import event.ClassAdderListener;
import manager.ClassManager;

public class ClassAdder extends JPanel {
	
	WindowFrame frame;
	ClassManager classmanager;
	
	public ClassAdder(WindowFrame frame, ClassManager classmanager) {
		this.frame = frame;
		this.classmanager = classmanager;
		
		JPanel panel = new JPanel(new SpringLayout());
		panel.setLayout(new SpringLayout());
		
		JLabel labelNAME = new JLabel("CLASSNAME: ",JLabel.TRAILING);
		JTextField fieldNAME = new JTextField(10);
		labelNAME.setLabelFor(fieldNAME);
		panel.add(labelNAME);
		panel.add(fieldNAME);
		
		JLabel labelPROF = new JLabel("PROFESSOR NAME: ",JLabel.TRAILING);
		JTextField fieldPROF = new JTextField(10);
		labelPROF.setLabelFor(fieldPROF);
		panel.add(labelPROF);
		panel.add(fieldPROF);
		
		JLabel labelROOM = new JLabel("CLASSROOM: ",JLabel.TRAILING);
		JTextField fieldROOM = new JTextField(10);
		labelROOM.setLabelFor(fieldROOM);
		
		JButton saveButton = new JButton("save");
		saveButton.addActionListener(new ClassAdderListener(fieldNAME,fieldPROF,fieldROOM,classmanager));
		
		JButton cancelButton = new JButton("cancel");
		cancelButton.addActionListener(new ClassAdderCancelListener(frame));
		
		panel.add(labelROOM);
		panel.add(fieldROOM);
		
		panel.add(saveButton);
		panel.add(cancelButton);
		
		SpringUtilities.makeCompactGrid(panel, 4, 2, 6, 6, 6, 6);
		
		this.add(panel);
		this.setVisible(true);
	}
}
