package madhealth;

import java.util.Scanner;

public abstract class IntermediateMadhealth extends Madhealth {

	public IntermediateMadhealth(MadhealthKind kind) {
		super(kind);
	}

	@Override
	public abstract void getMembershipInput(Scanner input);

	@Override
	public void printInfo() {
		String skind = getKindString();
		System.out.println("kind:" + skind + " Height:" + height + " Weight:" + weight + " Fatmass:" + fatmass + " Musclemass:" + musclemass);
	}

	public void setMembershipFatmasswithYN(Scanner input) {
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
	}

}
