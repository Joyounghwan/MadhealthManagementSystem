
import java.util.InputMismatchException;
import java.util.Scanner;
public class MenuManager {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		MadhealthManager madhealthManager = new MadhealthManager(input);
		selectMenu(input, madhealthManager);
	}
	public static void selectMenu(Scanner input, MadhealthManager madhealthManager) {
		int num = 1;
		while (num != 5) {
			try {
				showMenu();
				num =input.nextInt();
				switch(num) {
				case 1:
					madhealthManager.addmembershipinformation();
					break;
				case 2:
					madhealthManager.deletemembership();
					break;
				case 3:
					madhealthManager.editmembership();
					break;
				case 4:
					madhealthManager.viewmemberships();
					break;
				default:
					continue;
				}
			}
			catch(InputMismatchException e) {
				System.out.println("Please put an integer between 1 and 5!");
				if (input.hasNext()) {
					input.next();
				}
				num = -1;
			}
		}
	}

	public static void showMenu() {
		System.out.println("*** Madhealth Management System Menu ***");
		System.out.println(" 1. Add membership information");
		System.out.println(" 2. Delete membership");
		System.out.println(" 3. Edit membership");
		System.out.println(" 4. View memberships");
		System.out.println(" 5. Exit");
		System.out.println("Select one number between 1 - 5:");

	}
}