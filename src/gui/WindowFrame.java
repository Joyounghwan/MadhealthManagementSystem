package gui;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class WindowFrame extends JFrame {

	MenuSelection menuselection;
	MembershipAdder membershipadder;
	MembershipViewer membershipviewer ;	

	public WindowFrame() {
		this.menuselection = new MenuSelection(this);
		this.membershipadder = new MembershipAdder(this);
		this.membershipviewer = new MembershipViewer(this);	
		
		this.setSize(500, 300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			
		this.setupPanel(menuselection);

		this.setVisible(true);
	}

	public void setupPanel(JPanel panel) {
		this.getContentPane().removeAll();
		this.getContentPane().add(panel);
		this.revalidate();
		this.repaint();
	}
	
	public MenuSelection getMenuselection() {
		return menuselection;
	}

	public void setMenuselection(MenuSelection menuselection) {
		this.menuselection = menuselection;
	}

	public MembershipAdder getMembershipadder() {
		return membershipadder;
	}

	public void setMembershipadder(MembershipAdder membershipadder) {
		this.membershipadder = membershipadder;
	}

	public MembershipViewer getMembershipviewer() {
		return membershipviewer;
	}

	public void setMembershipviewer(MembershipViewer membershipviewer) {
		this.membershipviewer = membershipviewer;
	}
	
}
