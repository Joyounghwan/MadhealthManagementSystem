package madhealth;
import java.util.Scanner;

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

	public void setFatmass(int fatmass) {
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
		System.out.print("Fat mass :");
		int fatmass = input.nextInt();
		this.setFatmass(fatmass);
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