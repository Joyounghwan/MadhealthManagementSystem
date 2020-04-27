package madhealth;
import java.util.Scanner;

public class MasterMadhealth extends Madhealth {
	
	public MasterMadhealth(MadhealthKind kind) {
		super(kind);
	}
	
	public void getMembershipInput(Scanner input) {
		System.out.print("Height : ");
		int height = input.nextInt();
		this.setHeight(height);

		System.out.print("Weight : ");
		int weight = input.nextInt();
		this.setWeight(weight);

		char answer = 'x';
		while (answer != 'y' && answer != 'Y' && answer != 'n' && answer != 'N')
		{
			System.out.println("Do you know your fat mass? (Y/N)");
			answer = input.next().charAt(0);
			if (answer == 'y' || answer == 'Y' ) {
				System.out.print("Fat mass :");
				int fatmass = input.nextInt();
				this.setFatmass(fatmass);
				break;
			}
			else if (answer == 'n' || answer == 'N' ) {
				this.setFatmass(0);
				break;
			}
			else {
			}
		}
		System.out.print("Muscle mass :");
		int musclemass = input.nextInt();
		this.setMusclemass(musclemass);
	}
}