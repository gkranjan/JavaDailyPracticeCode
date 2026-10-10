package day_06;

public class MakeMyTrip {

	int fare;

	public MakeMyTrip(int fare) {

		if (fare <= 5000) {
			System.err.println("No Discount applied");
		}

		else if (fare >= 5000 && fare <= 10000) {
			System.out.println("10% of total fare as a discount");

		}

		else if (fare >= 10000) {
			System.out.println("15% Discount of the fare");
		}

	
//		else {
//			System.out.println("Maximum discount per customer is 1250 only");
//		}

	}

}
