package madhealth;

import java.util.Scanner;

public class BeginnerMadhealth extends IntermediateMadhealth {

	protected int goalFatmass;
	protected int goalMusclemass;

	public BeginnerMadhealth(MadhealthKind kind) {
		super(kind);
	}

	public void getMembershipInput(Scanner input) {
		setMembershipHeight(input);
		setMembershipWeight(input);
		setMembershipFatmasswithYN(input);
		setParentFatmasswithYN(input);
		setMembershipMusclemass(input);
	}

	public void setParentFatmasswithYN(Scanner input) {
		char answer = 'x';
		while (answer != 'y' && answer != 'Y' && answer != 'n' && answer != 'N') {
			System.out.println("Do you have your goal fat mass goal? (Y/N)");
			answer = input.next().charAt(0);
			if (answer == 'y' || answer == 'Y' ) {
				setMembershipFatmass(input);
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

	public void printInfo() {
		String skind = getKindString();
		System.out.println("kind:" + skind + " Height:" + height + " Weight:" + weight + " Fatmass:" + fatmass + " Musclemass:" + musclemass + " Fatmass goal:" + fatmass + " Musclemass goal:" + musclemass);
	}

}
