package madhealth;

import java.util.Scanner;

public class Madhealth {
	protected MadhealthKind kind = MadhealthKind.Trainer;
	protected int height;
	protected int weight;
	protected int fatmass;
	protected int musclemass;

	public Madhealth() {
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

	public void printInfo() {
		System.out.println("Height:" + height + " Weight:" + weight + " Fatmass:" + fatmass + " Musclemass:" + musclemass);
	}
	
	public void getMembershipInput(Scanner input) {
		System.out.print("Height : ");
		int height = input.nextInt();
		this.setHeight(height);
		
		System.out.print("Weight : ");
		int weight = input.nextInt();
		this.setWeight(weight);
		
		System.out.print("Fat mass :");
		int fatmass = input.nextInt();
		this.setFatmass(fatmass);
		
		System.out.print("Muscle mass :");
		int musclemass = input.nextInt();
		this.setMusclemass(musclemass);
	}
}