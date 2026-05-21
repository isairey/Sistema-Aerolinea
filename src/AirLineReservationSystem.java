import java.util.Scanner;

public class AirLineReservationSystem {

    public static void showControlOptions(Scanner scanner) {
        while (true) {
            System.out.println("If you want to Account Creation, Click 'Acc'");
            System.out.println("If you want to search account,Click 'Search'"); // For officials only
            System.out.println("If you want to Account Delete, Click 'Del'");
            System.out.println("If you want to see plane names, itineraries, time, and prices, Click 'See'");
            System.out.println("If you want to see Seats Avaliable or Booked,Click 'Seat'");
            System.out.println("If you want to buy tickets, Click 'Buy'");
            System.out.println("If you want to see report, Click 'Report'"); // For officials only
            System.out.println("If you want to stop, Click 'Stop'");

            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("Acc")) {
                CustomerManager.createAccount(scanner);
            } else if (input.equalsIgnoreCase("Search")) {
                CustomerManager.displayCreatedAccountsList(scanner);
            } else if (input.equalsIgnoreCase("Del")) {
                CustomerManager.deleteAccount(scanner);
            } else if (input.equalsIgnoreCase("Seat")) {
                showAvailableSeatsMenu(scanner);
            } else if (input.equalsIgnoreCase("See")) {
                PlaneDetails.showDetails();
            } else if (input.equalsIgnoreCase("Buy")) {
                TicketPurchase.buyTickets(scanner);
            } else if (input.equalsIgnoreCase("Report")) {
                Reporting.generateSalesReport(scanner);
            } else if (input.equalsIgnoreCase("Stop")) {
                System.out.println("Stopping the program.");
                break;
            } else {
                System.out.println("Invalid input! Please choose 'Acc', 'Del', 'See', 'Buy', or 'Stop'.");
            }
        }


    }
    public static void showAvailableSeatsMenu(Scanner scanner) {
        System.out.println("If you want to see tickets available for:");
        System.out.println("XZK-678, Click 'XZK'");
        System.out.println("ZKX-786, Click 'ZKX'");
        System.out.println("KZX-876, Click 'KZX'");
        System.out.println("ZXK-768, Click 'ZXK'");
        System.out.println("KXZ-867, Click 'KXZ'");

        String Planename = scanner.nextLine();

        switch (Planename.toUpperCase()) {
            case "XZK":
                System.out.println("-------------------------------------------------------------------------------------");
                System.out.println("XZK of Tickets");
                System.out.println("-------------------------------------------------------------------------------------");
                SeatArrangement.XZKdisplayEconomySeats();
                System.out.println("-------------------------------------------------------------------------------------");
                SeatArrangement.XZKdisplayPremiumSeats();
                System.out.println("-------------------------------------------------------------------------------------");
                SeatArrangement.XZKdisplayFirstClassSeats();
                System.out.println("-------------------------------------------------------------------------------------");
                break;
            case "ZKX":
                System.out.println("-------------------------------------------------------------------------------------");
                System.out.println("ZKX of Tickets");
                System.out.println("-------------------------------------------------------------------------------------");
                SeatArrangement.ZKXdisplayEconomySeats();
                System.out.println("-------------------------------------------------------------------------------------");
                SeatArrangement.ZKXdisplayPremiumSeats();
                System.out.println("-------------------------------------------------------------------------------------");
                SeatArrangement.ZKXdisplayFirstClassSeats();
                System.out.println("-------------------------------------------------------------------------------------");
                break;
            case "KZX":
                System.out.println("-------------------------------------------------------------------------------------");
                System.out.println("KZX of Tickets");
                System.out.println("-------------------------------------------------------------------------------------");
                SeatArrangement.KZXdisplayEconomySeats();
                System.out.println("-------------------------------------------------------------------------------------");
                SeatArrangement.KZXdisplayPremiumSeats();
                System.out.println("-------------------------------------------------------------------------------------");
                SeatArrangement.KZXdisplayFirstClassSeats();
                System.out.println("-------------------------------------------------------------------------------------");
                break;
            case "ZXK":
                System.out.println("-------------------------------------------------------------------------------------");
                System.out.println("ZXK of Tickets");
                System.out.println("-------------------------------------------------------------------------------------");
                SeatArrangement.ZXKdisplayEconomySeats();
                System.out.println("-------------------------------------------------------------------------------------");
                SeatArrangement.ZXKdisplayPremiumSeats();
                System.out.println("-------------------------------------------------------------------------------------");
                SeatArrangement.ZXKdisplayFirstClassSeats();
                System.out.println("-------------------------------------------------------------------------------------");
                break;
            case "KXZ":
                System.out.println("-------------------------------------------------------------------------------------");
                System.out.println("KXZ of Tickets");
                System.out.println("-------------------------------------------------------------------------------------");
                SeatArrangement.KXZdisplayEconomySeats();
                System.out.println("-------------------------------------------------------------------------------------");
                SeatArrangement.KXZdisplayPremiumSeats();
                System.out.println("-------------------------------------------------------------------------------------");
                SeatArrangement.KXZdisplayFirstClassSeats();
                System.out.println("-------------------------------------------------------------------------------------");
                break;
            default:
                System.out.println("Invalid Plane name.");
                return;
        }
        showControlOptions(scanner);
    }
}


