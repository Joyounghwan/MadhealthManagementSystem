package gui;

import java.util.Vector;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;

import madhealth.MadhealthInput;
import manager.MadhealthManager;

public class MembershipViewer extends JPanel {

	WindowFrame frame;

	MadhealthManager madhealthManager;
	
	public MembershipViewer(WindowFrame frame, MadhealthManager madhealthManager) {
		this.frame = frame;
		this.madhealthManager = madhealthManager;
		
		System.out.println("***" + madhealthManager.size() + "***");
		
		DefaultTableModel model = new DefaultTableModel();
		model.addColumn("Height");
		model.addColumn("Weight");
		model.addColumn("Fatmass");
		model.addColumn("Musclemass");

		for(int i=0; i<madhealthManager.size(); i++) {
			Vector row = new Vector();
			MadhealthInput ma = madhealthManager.get(i);
			row.add(ma.getHeight());
			row.add(ma.getWeight());
			row.add(ma.getFatmass());
			row.add(ma.getMusclemass());
			model.addRow(row);
			
		}
		
		JTable table = new JTable(model);
		JScrollPane sp = new JScrollPane(table);

		this.add(sp);
	}

}
