package madhealth;
import java.util.Scanner;

import exception.FatmassFormatException;

public abstract class Madhealth implements MadhealthInput {
	protected MadhealthKind kind = MadhealthKind.Trainer;
	protected int height;
	protected int weight;
	protected int fatmass;
	protected int musclemass;

	public Madhealth() {
	}

	public Madhealth(MadhealthKind kind) {
		this.kind = kind;
	}

	public Madhealth(int height, int weight) {
		this.height = height;
		this.weight = weight;
	}

	public Madhealth(int height, int weight, int fatmass, int musclemass) {
		this.height = height;
		this.weight = weight;
		this.fatmass = fatmass;
		this.musclemass = musclemass;
	}

	public Madhealth(MadhealthKind kind, int height, int weight, int fatmass, int musclemass) {
		this.kind = kind;
		this.height = height;
		this.weight = weight;
		this.fatmass = fatmass;
		this.musclemass = musclemass;
	}

	public MadhealthKind getKind() {
		return kind;
	}

	public void setKind(MadhealthKind kind) {
		this.kind = kind;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public int getFatmass() {
		return fatmass;
	}

	public void setFatmass(int fatmass) throws FatmassFormatException {
		if (fatmass < 0 || fatmass > 50) {
			throw new FatmassFormatException();
		}

		this.fatmass = fatmass;
	}

	public int getMusclemass() {
		return musclemass;
	}

	public void setMusclemass(int musclemass) {
		this.musclemass = musclemass;
	}

	public abstract void printInfo();

	public void setMembershipHeight(Scanner input) {
		System.out.print("Height : ");
		int height = input.nextInt();
		this.setHeight(height);		
	}

	public void setMembershipWeight(Scanner input) {
		System.out.print("Weight : ");
		int weight = input.nextInt();
		this.setWeight(weight);
	}

	public void setMembershipFatmass(Scanner input) {
		int fatmass = -1;
		while(fatmass < 0 || fatmass > 50) {
			System.out.print("Fat mass :");
			fatmass = input.nextInt();
			try {
				this.setFatmass(fatmass);
			} catch (FatmassFormatException e) {
				System.out.println("Incorrect Fatmass Format. Put the fatmass correctly.");
			}
		}
	}

	public void setMembershipMusclemass(Scanner input) {
		System.out.print("Muscle mass :");
		int musclemass = input.nextInt();
		this.setMusclemass(musclemass);
	}

	public String getKindString() {
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
		return skind;
	}
}