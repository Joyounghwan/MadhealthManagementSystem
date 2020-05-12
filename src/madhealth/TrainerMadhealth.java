package madhealth;

import java.util.Scanner;

public class TrainerMadhealth extends Madhealth {

	public TrainerMadhealth(MadhealthKind kind) {
		super(kind);
	}

	public void getMembershipInput(Scanner input) {
		setMembershipHeight(input);
		setMembershipWeight(input);
		setMembershipFatmass(input);
		setMembershipMusclemass(input);
	}
	public void printInfo() {
		String skind = getKindString();
		System.out.println("kind:" + skind + " Height:" + height + " Weight:" + weight + " Fatmass:" + fatmass + " Musclemass:" + musclemass);
	}

}
