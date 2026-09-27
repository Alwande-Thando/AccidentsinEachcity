import java.util.Scanner;

// Main application
public class RoadAccidentApp {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // -----------------------------------------
        // 1D ARRAY - City names
        // -----------------------------------------
        String[] cities = new String[3];

        // -----------------------------------------
        // 2D ARRAY - Accident data
        // Column 0 = Cars
        // Column 1 = Motorbikes
        // -----------------------------------------
        int[][] accidents = new int[3][2];

        // -----------------------------------------
        // INPUT
        // -----------------------------------------
        for (int i = 0; i < cities.length; i++) {

            System.out.print("Enter city name: ");
            cities[i] = input.nextLine();

            System.out.print("Enter number of car accidents: ");
            accidents[i][0] = input.nextInt();

            System.out.print("Enter number of motorbike accidents: ");
            accidents[i][1] = input.nextInt();

            input.nextLine(); // Clear input buffer

            System.out.println();
        }

        // -----------------------------------------
        // OUTPUT REPORT
        // -----------------------------------------
        System.out.println("======================================================");
        System.out.println("                 ROAD ACCIDENT REPORT");
        System.out.println("======================================================");

        System.out.printf("%-20s %-12s %-15s %-10s%n",
                "City", "Car", "Motorbike", "Total");

        System.out.println("------------------------------------------------------");

        int totalCars = 0;
        int totalMotorbikes = 0;

        // Variables for greatest number of accidents
        int highestTotal = 0;
        String highestCity = "";

        // -----------------------------------------
        // PRINT ROWS AND COLUMNS
        // -----------------------------------------
        for (int i = 0; i < cities.length; i++) {

            int carAccidents = accidents[i][0];
            int motorbikeAccidents = accidents[i][1];

            // Calculate total accidents for city
            int cityTotal = carAccidents + motorbikeAccidents;

            // Calculate overall totals
            totalCars += carAccidents;
            totalMotorbikes += motorbikeAccidents;

            // Display row
            System.out.printf("%-20s %-12d %-15d %-10d%n",
                    cities[i],
                    carAccidents,
                    motorbikeAccidents,
                    cityTotal);

            // Determine city with highest accidents
            if (cityTotal > highestTotal) {
                highestTotal = cityTotal;
                highestCity = cities[i];
            }
        }

        // -----------------------------------------
        // TOTALS
        // -----------------------------------------
        int overallTotal = totalCars + totalMotorbikes;

        System.out.println("------------------------------------------------------");

        System.out.printf("%-20s %-12d %-15d %-10d%n",
                "TOTAL",
                totalCars,
                totalMotorbikes,
                overallTotal);

        System.out.println("======================================================");

        // -----------------------------------------
        // CITY WITH GREATEST NUMBER OF ACCIDENTS
        // -----------------------------------------
        System.out.println();
        System.out.println("City with the greatest number of road accidents:");
        System.out.println(highestCity + " (" + highestTotal + " accidents)");

        input.close();
    }
}
