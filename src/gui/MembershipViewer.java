package gui;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;

public class MembershipViewer extends JFrame {

	public MembershipViewer() {
		DefaultTableModel model = new DefaultTableModel();
		model.addColumn("Height");
		model.addColumn("Weight");
		model.addColumn("Fatmass");
		model.addColumn("Musclemass");
		
		JTable table = new JTable(model);
		JScrollPane sp = new JScrollPane(table);
		
		this.add(sp);
		this.setSize(300, 300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}

}
