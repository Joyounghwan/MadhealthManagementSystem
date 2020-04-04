import java.util.Scanner;

public class MadhealthManager {
	Madhealth madhealth;
	Scanner input;
	MadhealthManager(Scanner input) {
		this.input = input;
	}
	
	public void Membershipinformation() {
		madhealth = new Madhealth();
		System.out.print("Height : ");
		madhealth.height = input.nextInt();
		System.out.print("Weight : ");
		madhealth.weight = input.nextInt();
		System.out.print("Fat mass :");
		madhealth.fatmass = input.nextInt();
		System.out.print("Muscle mass :");
		madhealth.musclemass = input.nextInt();		
	}
	public void Stretching() {
		System.out.print("Height : ");
		int membershipheight = input.nextInt();
		if (madhealth == null) {
			System.out.println("the madhealth has not been registered");
			return;
		}
		if (madhealth.height == membershipheight) {
			madhealth = null;
			System.out.println("the madhealth is deleted");
		}
	}
	public void Bodybuilding() {
		System.out.println("Height : ");
		int membershipheight = input.nextInt();
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
		}
	}
	public void Diet() {
		System.out.println("Height : ");
		int membershipheight = input.nextInt();
		if (madhealth.height == membershipheight) {
			madhealth.printInfo();
		}
	}
}
