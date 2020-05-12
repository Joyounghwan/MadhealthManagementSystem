package madhealth;
import java.util.Scanner;

public class MasterMadhealth extends IntermediateMadhealth {

	public MasterMadhealth(MadhealthKind kind) {
		super(kind);
	}

	public void getMembershipInput(Scanner input) {
		setMembershipHeight(input);
		setMembershipWeight(input);
		setMembershipFatmasswithYN(input);
		setMembershipMusclemass(input);
	}
}