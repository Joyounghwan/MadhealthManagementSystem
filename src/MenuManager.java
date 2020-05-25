import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.InputMismatchException;
import java.util.Scanner;
import log.EventLogger;

public class MenuManager {
	static EventLogger logger = new EventLogger("log.txt");

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		MadhealthManager madhealthManager = getObject("madhealthmanager.ser");
		if (madhealthManager == null) {
			madhealthManager = new MadhealthManager(input);
		}
		else {
			madhealthManager.setScanner(input);
		}
		
		selectMenu(input, madhealthManager);
		putObject(madhealthManager, "madhealthmanager.ser");
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
					logger.log("add a membership");
					break;
				case 2:
					madhealthManager.deletemembership();
					logger.log("delete a membership");
					break;
				case 3:
					madhealthManager.editmembership();
					logger.log("deit a membership");
					break;
				case 4:
					madhealthManager.viewmemberships();
					logger.log("view a list of membership");
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
	
	public static MadhealthManager getObject(String filename) {
		MadhealthManager madhealthManager = null;
		
		
		
		try {
			FileInputStream file = new FileInputStream(filename);
			ObjectInputStream in = new ObjectInputStream(file);
			
			madhealthManager = (MadhealthManager) in.readObject();
			
			in.close();
			file.close();			
		} catch (FileNotFoundException e) {
			return madhealthManager;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return madhealthManager;
	}
	
	public static void putObject(MadhealthManager madhealthManager, String filename) {
		try {
			FileOutputStream file = new FileOutputStream(filename);
			ObjectOutputStream out = new ObjectOutputStream(file);
			
			out.writeObject(madhealthManager);
			
			out.close();
			file.close();			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}