import java.util.Scanner;

public class Tuition {
	private static Scanner input;

	public static void main(String[] args) {
	input = new Scanner(System.in);
	System.out.println("Please, indicate your tuition in dollars for year 1");	
		double tuition = input.nextInt();
		double CombinedTuition = tuition;
		
		double year = 1;
		for (double i = 1; i < 4; i++) {
			year++;
			System.out.println("\n Please, indicate the tuition increase for year " + year);
			double percentageIncrease = input.nextInt();
			tuition += tuition * (percentageIncrease / 100.0);
			System.out.printf("\n The tuition for year" + " " + year + " is $ %4.2f", tuition);
			CombinedTuition += tuition;
		}
		System.out.printf("\n The cost of tuition for 4  years would total to"+" " + "%.2f", CombinedTuition);
		System.out.printf("\nCongrats, now you are in financial hole!");
	}

}
