public class Madhealth {
	int Height;
	int Weight;
	int Fatmass;
	int Musclemass;
	
	public Madhealth() {
	}
	
	public Madhealth(int Height, int Weight) {
		this.Height = Height;
		this.Weight = Weight;
	}
	
	public Madhealth(int Height, int Weight, int Fatmass, int Musclemass) {
		this.Height = Height;
		this.Weight = Weight;
		this.Fatmass = Fatmass;
		this.Musclemass = Musclemass;
	}
	
	public void printInfo() {
		System.out.println("Height:" + Height + "Weight:" + Weight + "Fatmass:" + Fatmass + "Musclemass:" + Musclemass);
	}
	
}
