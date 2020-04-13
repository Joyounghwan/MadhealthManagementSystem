import java.util.Scanner;

public class MenuManager {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		MadhealthManager madhealthManager = new MadhealthManager(input);

		int num = 1;
		while (num != 5) {		
			System.out.println("*** Madhealth Management System Menu ***");
			System.out.println(" 1. Add membership information");
			System.out.println(" 2. Delete membership");
			System.out.println(" 3. Edit membership");
			System.out.println(" 4. View memberships");
			System.out.println(" 5. Exit");
			System.out.println("Select one number between 1 - 5:");
			num =input.nextInt();
			if (num == 1) {
				madhealthManager.addmembershipinformation();
			}
			else if (num == 2) {
				madhealthManager.deletemembership();
			}
			else if (num == 3) {
				madhealthManager.editmembership();
			}
			else if (num == 4) {
				madhealthManager.viewmemberships();
			}
			else {
				continue;
			}
		}
	}
}