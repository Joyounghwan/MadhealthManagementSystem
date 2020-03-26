import java.util.Scanner;

public class MenuManager {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num = 5;

		while (num != 6) {		
			System.out.println("*** Madhealth Management System Menu ***");
			System.out.println(" 1. Stretching");
			System.out.println(" 2. Bodybuilding");
			System.out.println(" 3. Health tip");
			System.out.println(" 4. Diet");
			System.out.println(" 5. Show a menu");
			System.out.println(" 6. Exit");
			System.out.println("Select one number between 1 - 6:");
			num =input.nextInt();
			if (num == 1) {
				Stretching();
			}
			else if (num == 2) {
				Bodybuilding();
			}
			else if (num == 3) {
				HealthTip();
			}
			else if (num == 4) {
				Diet();
			}
			else {
				continue;
			}
		}
	}
	public static void Stretching() {
		Scanner input = new Scanner(System.in);
		System.out.println("Ballistic Stretching : ");
		int studentID = input.nextInt();
		System.out.println("Static Stretching : ");
		String studentName = input.next();
		System.out.println("Dynamic Stretching :");
		String studentEmail = input.next();
		System.out.println("Active Stretching :");
		String studentPhone = input.next();		
	}
	public static void Bodybuilding() {
		Scanner input = new Scanner(System.in);
		System.out.println("Ballistic Stretching : ");
		int studentID = input.nextInt();
	}
	public static void HealthTip() {
		Scanner input = new Scanner(System.in);
		System.out.println("Ballistic Stretching : ");
		int studentID = input.nextInt();
	}
	public static void Diet() {
		Scanner input = new Scanner(System.in);
		System.out.println("Ballistic Stretching : ");
		int studentID = input.nextInt();
	}
}