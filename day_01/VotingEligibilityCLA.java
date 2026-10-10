package day_01;

public class VotingEligibilityCLA {

	public static void main(String[] args) {
		int age = Integer.parseInt(args[0]);

		System.out.println(age >= 18 ? "Eligible" : "Not Eligible");
	}

}
