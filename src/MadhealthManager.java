import java.util.ArrayList;
import java.util.Scanner;

public class MadhealthManager {
	ArrayList<Madhealth> madhealths = new ArrayList<Madhealth>();
	Scanner input;
	MadhealthManager(Scanner input) {
		this.input = input;
	}

	public void addmembershipinformation() {
		Madhealth madhealth = new Madhealth();
		System.out.print("Height : ");
		madhealth.height = input.nextInt();
		System.out.print("Weight : ");
		madhealth.weight = input.nextInt();
		System.out.print("Fat mass :");
		madhealth.fatmass = input.nextInt();
		System.out.print("Muscle mass :");
		madhealth.musclemass = input.nextInt();
		madhealths.add(madhealth);
	}
	public void deletemembership() {
		System.out.print("Height : ");
		int membershipheight = input.nextInt();
		int index = -1;
		for(int i = 0; i<madhealths.size(); i++) {
			if (madhealths.get(i).height == membershipheight) {
				index = i;
				break;
			}
		}
		if(index >= 0) {
			madhealths.remove(index);
			Madhealth.numMadhealthsRegistered--;
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
			if (madhealth.height == membershipheight) {
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
						madhealth.height = input.nextInt();
					}
					else if (num == 2) {
						System.out.print("Weight : ");
						madhealth.weight = input.nextInt();
					}
					else if (num == 3) {
						System.out.print("Fat mass :");
						madhealth.fatmass = input.nextInt();
					}
					else if (num == 4) {
						System.out.print("Muscle mass :");
						madhealth.musclemass = input.nextInt();	
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
		System.out.println("# of registered memberships:" + Madhealth.numMadhealthsRegistered);
		for(int i=0; i<madhealths.size(); i++) {
			madhealths.get(i).printInfo();
		}
	}
}
