public class Madhealth {
	int height;
	int weight;
	int fatmass;
	int musclemass;
	static int numMadhealthsRegistered = 0;

	public Madhealth() {
		numMadhealthsRegistered++;
	}

	public Madhealth(int height, int weight) {
		this.height = height;
		this.weight = weight;
		numMadhealthsRegistered++;
	}

	public Madhealth(int height, int weight, int fatmass, int musclemass) {
		this.height = height;
		this.weight = weight;
		this.fatmass = fatmass;
		this.musclemass = musclemass;
		numMadhealthsRegistered++;
	}

	public void printInfo() {
		System.out.println("Height:" + height + " Weight:" + weight + " Fatmass:" + fatmass + " Musclemass:" + musclemass);
	}

}
