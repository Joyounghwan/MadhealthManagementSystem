package madhealth;

import java.util.Scanner;

import exception.FatmassFormatException;

public interface MadhealthInput {

	public int getHeight();

	public void setHeight(int height);
	
	public int getWeight();

	public void setWeight(int weight);

	public void setFatmass(int fatmass) throws FatmassFormatException;
	
	public int getFatmass();

	public void setMusclemass(int musclemass);
	
	public int getMusclemass();

	public void getMembershipInput(Scanner input);

	public void printInfo();

	public void setMembershipHeight(Scanner input);

	public void setMembershipWeight(Scanner input);

	public void setMembershipFatmass(Scanner input);

	public void setMembershipMusclemass(Scanner input);
}
