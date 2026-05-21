import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Reporting {

    private static Map<String, Integer> totalTicketsSoldPerAirplane = new HashMap<>();
    private static Map<String, Integer> totalTicketsPerAirplane = new HashMap<>();

    public static void recordTicketSale(String airplaneName) {
        totalTicketsSoldPerAirplane.put(airplaneName, totalTicketsSoldPerAirplane.getOrDefault(airplaneName, 0) + 1);
    }

    public static void updateTotalTickets(String airplaneName, int totalTickets) {
        totalTicketsPerAirplane.put(airplaneName, totalTickets);
    }

    public static void generateSalesReport(Scanner scanner) {
        System.out.println("Enter security code to generate sales report:");
        int securityCode = scanner.nextInt();
        scanner.nextLine();

        if (securityCode != SecurityCode.getFinalSecurityCode()) {
            System.out.println("Incorrect security code. Access denied.");
            System.out.println("----------------------------------------------------------------------------------------------------");
            return;
        }

        System.out.println("Total Plane : " + PlaneDetails.getTotal_Plane());
        System.out.println("XZK-678  "  );
        System.out.println("ZKX-786 " );
        System.out.println("KZX-876 " );
        System.out.println("ZXK-768 " );
        System.out.println("KXZ-867 " );
        System.out.println("----------------------------------------------------------------------------------------------------");
        System.out.println("Airplane Name      | Total Tickets Sold     | Unsold Tickets");
        System.out.println("----------------------------------------------------------------------------------------------------");
        for (Map.Entry<String, Integer> entry : totalTicketsSoldPerAirplane.entrySet()) {
            String airplaneName = entry.getKey();
            int ticketsSold = entry.getValue();
            int totalTickets = totalTicketsPerAirplane.getOrDefault(airplaneName, 0);
            int unsoldTickets = totalTickets - ticketsSold;
            System.out.printf("%-20s | %-22d | %-19d%n", airplaneName, ticketsSold, unsoldTickets);
            System.out.println("----------------------------------------------------------------------------------------------------");
        }
    }
}