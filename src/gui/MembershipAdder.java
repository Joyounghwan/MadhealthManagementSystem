package gui;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SpringLayout;

public class MembershipAdder extends JPanel {
	
	WindowFrame frame;
	
	public MembershipAdder(WindowFrame frame) {
		this.frame = frame;
		
		JPanel panel = new JPanel();
		panel.setLayout(new SpringLayout());
		
		JLabel labelHeight = new JLabel("Height: ", JLabel.TRAILING);
		JTextField fieldHeight = new JTextField(10);
		labelHeight.setLabelFor(fieldHeight);
		panel.add(labelHeight);
		panel.add(fieldHeight);
		
		JLabel labelWeight = new JLabel("Weight: ", JLabel.TRAILING);
		JTextField fieldWeight = new JTextField(10);
		labelWeight.setLabelFor(fieldWeight);
		panel.add(labelWeight);
		panel.add(fieldWeight);
		
		JLabel labelFatmass = new JLabel("Fatmass: ", JLabel.TRAILING);
		JTextField fieldFatmass = new JTextField(10);
		labelFatmass.setLabelFor(fieldFatmass);
		panel.add(labelFatmass);
		panel.add(fieldFatmass);
		
		JLabel labelMusclemass = new JLabel("Musclemass: ", JLabel.TRAILING);
		JTextField fieldMusclemass = new JTextField(10);
		labelMusclemass.setLabelFor(fieldMusclemass);
		panel.add(labelMusclemass);
		panel.add(fieldMusclemass);
		
		panel.add(new JButton("save"));
		panel.add(new JButton("cancel"));
		
		SpringUtilities.makeCompactGrid(panel, 5, 2, 6, 6, 6, 6);
		
		this.add(panel);
		this.setVisible(true);
		
	}

}
