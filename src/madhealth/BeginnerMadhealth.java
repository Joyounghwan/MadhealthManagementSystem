package madhealth;

import java.util.Scanner;

public class BeginnerMadhealth extends Madhealth {

	protected int goalFatmass;
	protected int goalMusclemass;

	public BeginnerMadhealth(MadhealthKind kind) {
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

		answer = 'x';
		while (answer != 'y' && answer != 'Y' && answer != 'n' && answer != 'N')
		{
			System.out.println("Do you have your goal fat mass goal? (Y/N)");
			answer = input.next().charAt(0);
			if (answer == 'y' || answer == 'Y' ) {
				System.out.print("Fat mass goal :");
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

	public void printInfo() {
		String skind = "none";
		switch(this.kind) {
		case Trainer:
			skind ="Trainer";
			break;
		case Master:
			skind ="Master";
			break;
		case Intermediate:
			skind ="Intermediate";
			break;
		case Beginner:
			skind ="Beginner";
			break;
		default:
		}
		System.out.println("kind:" + skind + " Height:" + height + " Weight:" + weight + " Fatmass:" + fatmass + " Musclemass:" + musclemass + " Fatmass goal:" + fatmass + " Musclemass goal:" + musclemass);
	}

}
