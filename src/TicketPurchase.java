import java.util.Scanner;

public class TicketPurchase {


    public static void buyTickets(Scanner scanner) {
        System.out.println("Choose Planes");
        System.out.println("If you want to buy XZK-678 of ticket, Click 'XZK'");
        System.out.println("If you want to buy ZKX-786 of ticket, Click 'ZKX'");
        System.out.println("If you want to buy KZX-876 of ticket, Click 'KZX'");
        System.out.println("If you want to buy ZXK-768 of ticket, Click 'ZXK'");
        System.out.println("If you want to buy KXZ-867 of ticket, Click 'KXZ'");

        String input = scanner.nextLine();

        if (input.equalsIgnoreCase("XZK")) {
            PlaneDetails.displayTicketDetailsofXZK("XZK-678",  200000, 250000, 300000, 0, 0, 0.05, scanner);
            Reporting.recordTicketSale("XZK-678");
        } else if (input.equalsIgnoreCase("ZKX")) {
            PlaneDetails.displayTicketDetailsofZKX("ZKX-786", 250000, 300000, 350000, 0, 0, 0.05, scanner);
            Reporting.recordTicketSale("ZKX-786");
        } else if (input.equalsIgnoreCase("KZX")) {
            PlaneDetails.displayTicketDetailsofKZX("KZX-876", 200000, 250000, 300000, 0, 0, 0.05, scanner);
            Reporting.recordTicketSale("KZX-876");
        } else if (input.equalsIgnoreCase("ZXK")) {
            PlaneDetails.displayTicketDetailsofZXK("ZXK-768", 200000, 250000, 300000, 0, 0, 0.05, scanner);
            Reporting.recordTicketSale("ZXK-768");
        } else if (input.equalsIgnoreCase("KXZ")) {
            PlaneDetails.displayTicketDetailsofKXZ("KXZ-867", 200000, 250000, 300000, 0, 0, 0.05, scanner);
            Reporting.recordTicketSale("KXZ-867");
        }
        Reporting.updateTotalTickets("XZK-678", 70);
        Reporting.updateTotalTickets("ZKX-786", 70);
        Reporting.updateTotalTickets("KZX-876", 70);
        Reporting.updateTotalTickets("ZXK-768", 70);
        Reporting.updateTotalTickets("KXZ-867", 70);

    }
}



