package madhealth;
import java.util.ArrayList;
import java.util.Scanner;
public class MadhealthManager {
	ArrayList<Madhealth> madhealths = new ArrayList<Madhealth>();
	Scanner input;
	MadhealthManager(Scanner input) {
		this.input = input;
	}
	public void addmembershipinformation() {
		int kind = 0;
		Madhealth madhealth;
		while(kind != 1 && kind != 2) {
			System.out.println("1 for Trainer");
			System.out.println("2 for Master");
			System.out.println("3 for Beginner");
			System.out.print("Select num 1, 2 or 3 for Madhealth Kind : ");
			kind = input.nextInt();
			if(kind == 1) {
				madhealth = new Madhealth(MadhealthKind.Trainer);
				madhealth.getMembershipInput(input);
				madhealths.add(madhealth);
				break;
			}
			else if(kind == 2) {
				madhealth = new MasterMadhealth(MadhealthKind.Master);
				madhealth.getMembershipInput(input);
				madhealths.add(madhealth);
				break;
			}
			else if(kind == 3) {
				madhealth = new BeginnerMadhealth(MadhealthKind.Beginner);
				madhealth.getMembershipInput(input);
				madhealths.add(madhealth);
				break;
			}
			else {
				System.out.println("Select num for Madhealth Kind between 1 and 2 :");
			}
		}
	}
	public void deletemembership() {
		System.out.print("Height : ");
		int membershipheight = input.nextInt();
		int index = -1;
		for(int i = 0; i<madhealths.size(); i++) {
			if (madhealths.get(i).getHeight() == membershipheight) {
				index = i;
				break;
			}
		}
		if(index >= 0) {
			madhealths.remove(index);
			System.out.println("the madhealth "+ membershipheight + " is deleted");
		}
		else {
			System.out.println("the madhealth has not been registered");
			return;
		}
	}
	public void editmembership() {
		System.out.println("Height : ");
		int membershipheight = input.nextInt();
		for(int i=0; i<madhealths.size(); i++) {
			Madhealth madhealth = madhealths.get(i);
			if (madhealth.getHeight() == membershipheight) {
				int num = 1;
				while (num != 5) {
					System.out.println("** Madhealth Info Edit Menu **");
					System.out.println(" 1. Edit Height");
					System.out.println(" 2. Edit Weight");
					System.out.println(" 3. Edit Fat mass");
					System.out.println(" 4. Edit Muscle mass");
					System.out.println(" 5. Exit");
					System.out.println("Select one number between 1 - 5:");
					num =input.nextInt();
					if (num == 1) {
						System.out.print("Height : ");
						int height = input.nextInt();
						madhealth.setHeight(height);
					}
					else if (num == 2) {
						System.out.print("Weight : ");
						int weight = input.nextInt();
						madhealth.setWeight(weight);
					}
					else if (num == 3) {
						System.out.print("Fat mass :");
						int fatmass = input.nextInt();
						madhealth.setFatmass(fatmass);
					}
					else if (num == 4) {
						System.out.print("Muscle mass :");
						int musclemass = input.nextInt();
						madhealth.setMusclemass(musclemass);
					}
					else {
						continue;
					}
				}
				break;
			}
		}
	}
	public void viewmemberships() {
		//		System.out.println("Height : ");
		//		int membershipheight = input.nextInt();
		System.out.println("# of registered memberships:" + madhealths.size());
		for(int i=0; i<madhealths.size(); i++) {
			madhealths.get(i).printInfo();
		}
	}
}