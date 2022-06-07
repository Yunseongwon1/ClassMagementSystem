package gui;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SpringLayout;

public class ClassAdder extends JPanel {
	
	WindowFrame frame;
	
	public ClassAdder(WindowFrame frame) {
		this.frame = frame;
		
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
		panel.add(labelROOM);
		panel.add(fieldROOM);
		
		panel.add(new JButton("save"));
		panel.add(new JButton("cancel"));
		
		SpringUtilities.makeCompactGrid(panel, 4, 2, 6, 6, 6, 6);
		
		this.add(panel);
		this.setVisible(true);
	}
}
