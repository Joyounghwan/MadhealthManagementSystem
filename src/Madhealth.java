public class Madhealth {
	int height;
	int weight;
	int fatmass;
	int musclemass;
	
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
	
	public void printInfo() {
		System.out.println("Height:" + height + " Weight:" + weight + " Fatmass:" + fatmass + " Musclemass:" + musclemass);
	}
	
}
