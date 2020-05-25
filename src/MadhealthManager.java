import java.io.Serializable;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;
import madhealth.BeginnerMadhealth;
import madhealth.MadhealthInput;
import madhealth.MadhealthKind;
import madhealth.MasterMadhealth;
import madhealth.TrainerMadhealth;

public class MadhealthManager implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -680697281474698744L;
	
	ArrayList<MadhealthInput> madhealths = new ArrayList<MadhealthInput>();
	transient Scanner input;
	MadhealthManager(Scanner input) {
		this.input = input;
	}
	
	public void setScanner(Scanner input) {
		this.input = input;
	}
	
	public void addmembershipinformation() {
		int kind = 0;
		MadhealthInput madhealthInput;
		while(kind < 1 || kind > 3) {
			try {
				System.out.println("1 for Trainer");
				System.out.println("2 for Master");
				System.out.println("3 for Beginner");
				System.out.print("Select num 1, 2 or 3 for Madhealth Kind : ");
				kind = input.nextInt();
				if(kind == 1) {
					madhealthInput = new TrainerMadhealth(MadhealthKind.Trainer);
					madhealthInput.getMembershipInput(input);
					madhealths.add(madhealthInput);
					break;
				}
				else if(kind == 2) {
					madhealthInput = new MasterMadhealth(MadhealthKind.Master);
					madhealthInput.getMembershipInput(input);
					madhealths.add(madhealthInput);
					break;
				}
				else if(kind == 3) {
					madhealthInput = new BeginnerMadhealth(MadhealthKind.Beginner);
					madhealthInput.getMembershipInput(input);
					madhealths.add(madhealthInput);
					break;
				}
				else {
					System.out.println("Select num for Madhealth Kind between 1 and 2 :");
				}
			}
			catch(InputMismatchException e) {
				System.out.println("Please put an integer between 1 and 3!");
				if (input.hasNext()) {
					input.next();
				}
				kind = -1;
			}
		}
	}
	public void deletemembership() {
		System.out.print("Height : ");
		int membershipheight = input.nextInt();
		int index = findIndex(membershipheight);
		removefrommemberships(index, membershipheight);
	}

	public int findIndex(int membershipheight) {
		int index = -1;
		for(int i = 0; i<madhealths.size(); i++) {
			if (madhealths.get(i).getHeight() == membershipheight) {
				index = i;
				break;
			}
		}
		return index;
	}

	public int removefrommemberships(int index, int membershipheight) {
		if(index >= 0) {
			madhealths.remove(index);
			System.out.println("the madhealth "+ membershipheight + " is deleted");
			return 1;
		}
		else {
			System.out.println("the madhealth has not been registered");
			return -1;
		}
	}

	public void editmembership() {
		System.out.println("Height : ");
		int membershipheight = input.nextInt();
		for(int i=0; i<madhealths.size(); i++) {
			MadhealthInput madhealth = madhealths.get(i);
			if (madhealth.getHeight() == membershipheight) {
				int num = 1;
				while (num != 5) {
					showEditMenu();
					num =input.nextInt();
					switch(num) {
					case 1:
						madhealth.setMembershipHeight(input);
						break;
					case 2:
						madhealth.setMembershipWeight(input);
						break;
					case 3:
						madhealth.setMembershipFatmass(input);
						break;
					case 4:
						madhealth.setMembershipMusclemass(input);
						break;
					default:
						continue;
					}
				}
				break;
			}
		}
	}
	public void viewmemberships() {
		//		 System.out.println("Height : ");
		//		 int membershipheight = input.nextInt();
		System.out.println("# of registered memberships:" + madhealths.size());
		for(int i=0; i<madhealths.size(); i++) {
			madhealths.get(i).printInfo();
		}
	}

	public void showEditMenu() {
		System.out.println("** Madhealth Info Edit Menu **");
		System.out.println(" 1. Edit Height");
		System.out.println(" 2. Edit Weight");
		System.out.println(" 3. Edit Fat mass");
		System.out.println(" 4. Edit Muscle mass");
		System.out.println(" 5. Exit");
		System.out.println("Select one number between 1 - 5:");

	}
}