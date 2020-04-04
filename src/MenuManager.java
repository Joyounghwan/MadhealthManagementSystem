import java.util.Scanner;

public class MenuManager {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		MadhealthManager madhealthManager = new MadhealthManager(input);
		
		int num = 1;
		while (num != 5) {		
			System.out.println("*** Madhealth Management System Menu ***");
			System.out.println(" 1. Membership information");
			System.out.println(" 2. Stretching");
			System.out.println(" 3. Bodybuilding");
			System.out.println(" 4. Diet");
			System.out.println(" 5. Exit");
			System.out.println("Select one number between 1 - 5:");
			num =input.nextInt();
			if (num == 1) {
				madhealthManager.Membershipinformation();
			}
			else if (num == 2) {
				madhealthManager.Stretching();
			}
			else if (num == 3) {
				madhealthManager.Bodybuilding();
			}
			else if (num == 4) {
				madhealthManager.Diet();
			}
			else {
				continue;
			}
		}
	}
}