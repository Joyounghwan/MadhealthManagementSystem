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
		madhealth.Height = input.nextInt();
		System.out.print("Weight : ");
		madhealth.Weight = input.nextInt();
		System.out.print("Fat mass :");
		madhealth.Fatmass = input.nextInt();
		System.out.print("Muscle mass :");
		madhealth.Musclemass = input.nextInt();		
	}
	public void Stretching() {
		System.out.print("Height : ");
		int membershipheight = input.nextInt();
		if (madhealth == null) {
			System.out.println("the madhealth has not been registered");
			return;
		}
		if (madhealth.Height == membershipheight) {
			madhealth = null;
			System.out.println("the madhealth is deleted");
		}
	}
	public void Bodybuilding() {
		System.out.println("Height : ");
		int membershipheight = input.nextInt();
		if (madhealth.Height == membershipheight) {
			System.out.println("the madhealth to be edited is" + membershipheight);
		}
	}
	public void Diet() {
		System.out.println("Height : ");
		int membershipheight = input.nextInt();
		if (madhealth.Height == membershipheight) {
			madhealth.printInfo();
		}
	}
}
