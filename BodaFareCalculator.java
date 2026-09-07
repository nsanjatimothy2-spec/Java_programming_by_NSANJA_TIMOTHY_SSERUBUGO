import java.util.Scanner;

public class BodaFareCalculator {
    public static void main(String[] args) {

        // Constant base fare in Uganda Shillings
        final double BASE_FARE = 2000.0;

        // Constant charge per kilometre
        final double RATE_PER_KM = 500.0;

        // Create Scanner object to receive keyboard input
        Scanner input = new Scanner(System.in);

        // Ask the user to enter the distance travelled
        System.out.print("Enter distance travelled in km: ");
        double distance = input.nextDouble();

        // Calculate the total boda-boda fare
        double totalFare = BASE_FARE + (RATE_PER_KM * distance);

        // Display the calculated fare
        System.out.println("Your fare for " + distance
                + " km is UGX " + totalFare);

        // Close the Scanner
        input.close();
    }
}