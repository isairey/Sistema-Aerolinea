import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("WELCOME TO WATERPARTY AIRLINE <3");
        System.out.println(" ________________________________________________");
        System.out.println("| Director   | Zora         | Zora@gmail.com     |");
        System.out.println("-------------------------------------------------");
        System.out.println("| Manager    | KAl          |  KAL@gmail.com     |");
        System.out.println("--------------------------------------------------");
        System.out.println("| Investor   | X-Star        | XStar@gmail.com   |");
        System.out.println(" -------------------------------------------------");

        while (true) {
            System.out.println("If you want to know control keys, Click 'Start'");
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("Start")) {
                AirLineReservationSystem.showControlOptions(scanner);
                break;
            } else {
                System.out.println("Invalid input! Please try again.");
            }
        }

        scanner.close();

    }
}