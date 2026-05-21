import java.util.Scanner;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class PlaneDetails {
    private static int Total_Plane = 5 ;

    public static int getTotal_Plane() {
        return Total_Plane;
    }
    public static void showDetails() {
        System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("Plane names   |      Trip       |                    Time               |                        Role and Price                             |");
        System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("XZK-678       |   YGN <-> MDY    |   16:45pm-->17:50pm || 19:45pm-->20:50pm | (Economy)200000MMK | (Premium)250000MMK | (First)300000MMK    |");
        System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("ZKX-786       |   RGN <-> STW    |   9:00Am-->10:15Am  || 20:00pm-->21:15pm | (Economy)250000MMK | (Premium)300000MMK | (First)350000MMK    |");
        System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("KZX-876       |   RGN <-> NPT    |   12:00pm-->12:45pm || 21:00pm-->21:40pm| (Economy)200000MMK | (Premium)250000MMK | (First)300000MMK     |");
        System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("ZXK-768       |   RGN <-> MYK    |  15:00pm-->15:55pm  || 18:00pm-->18:55pm | (Economy)300000MMK | (Premium)350000MMK | (First)400000MMK    |");
        System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("KXZ-867       |   RGN <->  MKN   |  8:00Am-->9:30Am    || 16:00pm-->17:30pm| (Economy)400000MMK | (Premium)450000MMK | (First)500000MMK     |");
        System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------");
    }

    public static void displayTicketDetailsofXZK(String planeName,  int economyPrice, int premiumPrice, int firstClassPrice, int Seat_Price, int Total_Bill, double Discount, Scanner scanner) {
        System.out.println("-------------------------------------------------------------------------------------------------------------------");
        System.out.println("Plane names   |      Trip       |                          Time           |                        Role and Price                        |");
        System.out.println("-------------------------------------------------------------------------------------------------------------------");
        System.out.println(planeName + "       |   YGN <-> MDY    |   16:45pm-->17:50pm || 19:45pm-->20:50pm | (Economy)" + economyPrice + "MMK|(Premium)" + premiumPrice + "MMK | (First)" + firstClassPrice + "MMK   |");
        System.out.println("-------------------------------------------------------------------------------------------------------------------");

        System.out.println("If you want to buy sure, Click 'Sure'");
        System.out.println("If you are not sure, Click 'Back'");
        String input = scanner.nextLine();

        if (input.equalsIgnoreCase("Sure")) {
            int remainingAttempts = 3;

            while (remainingAttempts > 0) {
                System.out.println("ID : ");
                int id = Integer.parseInt(scanner.nextLine());
                Customer customer = CustomerManager.findCustomerById(id);

                if (customer != null) {
                    System.out.println("---------------------------------------------------------------------");
                    System.out.println("ID : " + customer.getId());
                    System.out.println("Name : " + customer.getName());
                    System.out.println("Age : " + customer.getAge());
                    System.out.println("Gender : " + customer.getGender());
                    System.out.println("Phone : " + customer.getPhone());
                    System.out.println("Your Account was found!");

                    System.out.println("Password: ");
                    String enteredPassword = scanner.nextLine();

                    if (enteredPassword.equals(customer.getPassword())) {
                        System.out.println("---------------------------------------------------------------------");

                        break;
                    } else {
                        remainingAttempts--;
                        System.out.println("Incorrect password! " + remainingAttempts + " attempts remaining. Please try again.");
                    }
                } else {
                    System.out.println("No customer found with that ID.");
                }
            }

            if (remainingAttempts == 0) {
                System.out.println("Password entry limit reached. Returning to the main menu.");
                System.out.println("---------------------------------------------------------------------------------------------------------------------------------");
                return;
            }
            System.out.println("Plane Name: " + planeName);
            System.out.println("Trip: YGN <-> MDY");
            String Departure;
            while (true) {
                System.out.println("Departure (YGN or MDY) : ");
                Departure = scanner.nextLine();
                if (Departure.equalsIgnoreCase("YGN") || Departure.equalsIgnoreCase("MDY")) {
                    break;
                }
                System.out.println("Invalid gender! Please enter 'YGN' or 'MDY'.");
            }
            String Destination;
            while (true) {
                System.out.println("Destination (YGN or MDY) : ");
                Destination = scanner.nextLine();
                if (Destination.equalsIgnoreCase("YGN") || Destination.equalsIgnoreCase("MDY")) {
                    break;
                }
                System.out.println("Invalid gender! Please enter 'YGN' or 'MDY'.");
            }

            System.out.println("Adults (18+): ");
            int adults;
            while (true) {
                adults = Integer.parseInt(scanner.nextLine());
                if (adults >= 1 && adults <= 6) {
                    break;
                } else {
                    System.out.println("Invalid input! Please enter a number between 1 and 6.");
                }
            }

            System.out.println("Children (5-17): ");
            int children;
            while (true) {
                children = Integer.parseInt(scanner.nextLine());
                if (children >= 0 && children <= 6) {
                    break;
                } else {
                    System.out.println("Invalid input! Please enter a number between 0 and 6.");
                }
            }

            System.out.println("Infants (under 5): ");
            int infants;
            while (true) {
                infants = Integer.parseInt(scanner.nextLine());
                if (infants >= 0 && infants <= 6) {
                    break;
                } else {
                    System.out.println("Invalid input! Please enter a number between 0 and 6.");
                }
            }

            String seatType;
            while (true) {
                System.out.println("Select seat type (Economy, Premium, First Class): ");
                seatType = scanner.nextLine();

                switch (seatType.toLowerCase()) {
                    case "economy":
                        SeatArrangement.XZKdisplayEconomySeats();
                        Seat_Price = economyPrice;
                        break;
                    case "premium":
                        SeatArrangement.XZKdisplayPremiumSeats();
                        Seat_Price = premiumPrice;
                        break;
                    case "first class":
                        SeatArrangement.XZKdisplayFirstClassSeats();
                        Seat_Price = firstClassPrice;
                        break;
                    default:
                        System.out.println("Invalid seat type! Please select from Economy, Premium, or First Class.");
                        continue;
                }
                break;
            }
            String seatNumber;
            while (true) {
                System.out.println("Select seat number (eg: A-1): ");
                seatNumber = scanner.nextLine();
                boolean isAvailable = SeatArrangement.checkSeatAvailabilityofXZK(seatType, seatNumber);
                if (!isAvailable) {
                    System.out.println("Sorry, this seat is not available. Please choose another seat.");
                } else {
                    SeatArrangement.bookSeatofXZK(seatNumber);
                    break;
                }
            }
            LocalDate travelDate = null;
            DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
            while (travelDate == null) {
                System.out.println("Enter travel date (YYYY-MM-DD): ");
                String dateInput = scanner.nextLine();
                try {
                    travelDate = LocalDate.parse(dateInput, dateFormatter);
                } catch (DateTimeParseException e) {
                    System.out.println("Invalid date format. Please use YYYY-MM-DD.");

                }
            }

            System.out.println("Pay (KBZ, Wave, VISA): ");
            String paymentMethod;
            while (true) {
                paymentMethod = scanner.nextLine();
                if (paymentMethod.equalsIgnoreCase("KBZ") || paymentMethod.equalsIgnoreCase("Wave") || paymentMethod.equalsIgnoreCase("VISA")) {
                    break;
                } else {
                    System.out.println("Invalid input! Please enter 'KBZ', 'Wave', or 'VISA'.");
                }
            }
            System.out.println("---------------------------------------------------------------------");
            System.out.println("Plane Name: " + planeName);
            System.out.println("Trip: YGN to MDY");
            System.out.println("Departure : " + Departure);
            System.out.println("Destination : " + Destination);
            System.out.println("Time: " + (Departure.equalsIgnoreCase("YGN") ? "16:45pm > 17:50pm" : "19:45pm > 20:50pm"));
            System.out.println("Adults (12+): " + adults);
            System.out.println("Children (2-11): " + children);
            System.out.println("Infants (under 2): " + infants);
            System.out.println("Passenger: " + (adults + children + infants));
            System.out.println("Role: " + seatType);
            System.out.println("Seat: " + seatNumber);
            System.out.println("Date of Travel: " + travelDate.format(dateFormatter));
            System.out.println("Pay (KBZ, Wave, VISA): " + paymentMethod);
            Total_Bill = (adults + children) * Seat_Price;
            double DiscountAmount = Total_Bill * Discount;
            System.out.println("Discount: 5 %");
            System.out.println("Discount 5%: " + (DiscountAmount) + " MMK");
            System.out.println("---------------------------------------------------------------------");
            System.out.println("Total bill: " + (Total_Bill - Discount) + " MMK");
            System.out.println("---------------------------------------------------------------------");

        } else {
            System.out.println("---------------------------------------------------------------------");
        }



    }

    public static void displayTicketDetailsofZKX(String planeName,  int economyPrice, int premiumPrice, int firstClassPrice, int Seat_Price, int Total_Bill, double Discount, Scanner scanner) {
        System.out.println("-------------------------------------------------------------------------------------------------------------------");
        System.out.println("Plane names   |      Trip       |                          Time           |                        Role and Price                        |");
        System.out.println("-------------------------------------------------------------------------------------------------------------------");
        System.out.println(planeName + "       |   RGN <-> STW    |   9:00Am-->10:15Am  || 20:00pm-->21:15pm | (Economy)" + economyPrice + "MMK|(Premium)" + premiumPrice + "MMK | (First)" + firstClassPrice + "MMK   |");
        System.out.println("-------------------------------------------------------------------------------------------------------------------");

        System.out.println("If you want to buy sure, Click 'Sure'");
        System.out.println("If you are not sure, Click 'Back'");
        String input = scanner.nextLine();

        if (input.equalsIgnoreCase("Sure")) {
            int remainingAttempts = 3;

            while (remainingAttempts > 0) {
                System.out.println("ID : ");
                int id = Integer.parseInt(scanner.nextLine());
                Customer customer = CustomerManager.findCustomerById(id);

                if (customer != null) {
                    System.out.println("---------------------------------------------------------------------");
                    System.out.println("ID : " + customer.getId());
                    System.out.println("Name : " + customer.getName());
                    System.out.println("Age : " + customer.getAge());
                    System.out.println("Gender : " + customer.getGender());
                    System.out.println("Phone : " + customer.getPhone());
                    System.out.println("Your Account was found!");

                    System.out.println("Password: ");
                    String enteredPassword = scanner.nextLine();

                    if (enteredPassword.equals(customer.getPassword())) {
                        System.out.println("---------------------------------------------------------------------");

                        break;
                    } else {
                        remainingAttempts--;
                        System.out.println("Incorrect password! " + remainingAttempts + " attempts remaining. Please try again.");
                    }
                } else {
                    System.out.println("Invalid input! Please Click 'Sure'");
                }
            }

            if (remainingAttempts == 0) {
                System.out.println("Password entry limit reached. Returning to the main menu.");
                System.out.println("---------------------------------------------------------------------------------------------------------------------------------");
                return;
            }
            System.out.println("Plane Name: " + planeName);
            System.out.println("Trip: YGN <-> STW");
            String Departure;
            while (true) {
                System.out.println("Departure (YGN or STW) : ");
                Departure = scanner.nextLine();
                if (Departure.equalsIgnoreCase("YGN") || Departure.equalsIgnoreCase("STW")) {
                    break;
                }
                System.out.println("Invalid gender! Please enter 'YGN' or 'STW'.");
            }
            String Destination;
            while (true) {
                System.out.println("Destination (YGN or STW) : ");
                Destination = scanner.nextLine();
                if (Destination.equalsIgnoreCase("YGN") || Destination.equalsIgnoreCase("STW")) {
                    break;
                }
                System.out.println("Invalid gender! Please enter 'YGN' or 'STW'.");
            }

            System.out.println("Adults (18+): ");
            int adults;
            while (true) {
                adults = Integer.parseInt(scanner.nextLine());
                if (adults >= 1 && adults <= 6) {
                    break;
                } else {
                    System.out.println("Invalid input! Please enter a number between 1 and 6.");
                }
            }

            System.out.println("Children (5-17): ");
            int children;
            while (true) {
                children = Integer.parseInt(scanner.nextLine());
                if (children >= 0 && children <= 6) {
                    break;
                } else {
                    System.out.println("Invalid input! Please enter a number between 0 and 6.");
                }
            }

            System.out.println("Infants (under 5): ");
            int infants;
            while (true) {
                infants = Integer.parseInt(scanner.nextLine());
                if (infants >= 0 && infants <= 6) {
                    break;
                } else {
                    System.out.println("Invalid input! Please enter a number between 0 and 6.");
                }
            }

            String seatType;
            while (true) {
                System.out.println("Select seat type (Economy, Premium, First Class): ");
                seatType = scanner.nextLine();

                switch (seatType.toLowerCase()) {
                    case "economy":
                        SeatArrangement.ZKXdisplayEconomySeats();
                        Seat_Price = economyPrice;
                        break;
                    case "premium":
                        SeatArrangement.ZKXdisplayPremiumSeats();
                        Seat_Price = premiumPrice;
                        break;
                    case "first class":
                        SeatArrangement.ZKXdisplayFirstClassSeats();
                        Seat_Price = firstClassPrice;
                        break;
                    default:
                        System.out.println("Invalid seat type! Please select from Economy, Premium, or First Class.");
                        continue;
                }
                break;
            }
            String seatNumber;
            while (true) {
                System.out.println("Select seat number (eg: A-1): ");
                seatNumber = scanner.nextLine();
                boolean isAvailable = SeatArrangement.checkSeatAvailabilityofZKX(seatType, seatNumber);
                if (!isAvailable) {
                    System.out.println("Sorry, this seat is not available. Please choose another seat.");
                } else {
                    SeatArrangement.bookSeatofZKX(seatNumber);
                    break;
                }
            }
            LocalDate travelDate = null;
            DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
            while (travelDate == null) {
                System.out.println("Enter travel date (YYYY-MM-DD): ");
                String dateInput = scanner.nextLine();
                try {
                    travelDate = LocalDate.parse(dateInput, dateFormatter);
                } catch (DateTimeParseException e) {
                    System.out.println("Invalid date format. Please use YYYY-MM-DD.");

                }
            }

            System.out.println("Pay (KBZ, Wave, VISA): ");
            String paymentMethod;
            while (true) {
                paymentMethod = scanner.nextLine();
                if (paymentMethod.equalsIgnoreCase("KBZ") || paymentMethod.equalsIgnoreCase("Wave") || paymentMethod.equalsIgnoreCase("VISA")) {
                    break;
                } else {
                    System.out.println("Invalid input! Please enter 'KBZ', 'Wave', or 'VISA'.");
                }
            }
            System.out.println("---------------------------------------------------------------------");
            System.out.println("Plane Name: " + planeName);
            System.out.println("Trip: YGN to MDY");
            System.out.println("Departure : " + Departure);
            System.out.println("Destination : " + Destination);
            System.out.println("Time: " + (Departure.equalsIgnoreCase("YGN") ? "9:00Am-->10:15Am" : "20:00pm-->21:15pm"));
            System.out.println("Adults (12+): " + adults);
            System.out.println("Children (2-11): " + children);
            System.out.println("Infants (under 2): " + infants);
            System.out.println("Passenger: " + (adults + children + infants));
            System.out.println("Role: " + seatType);
            System.out.println("Seat: " + seatNumber);
            System.out.println("Date of Travel: " + travelDate.format(dateFormatter));
            System.out.println("Pay (KBZ, Wave, VISA): " + paymentMethod);
            Total_Bill = (adults + children) * Seat_Price;
            double DiscountAmount = Total_Bill * Discount;
            System.out.println("Discount: 5 %");
            System.out.println("Discount 5%: " + (DiscountAmount) + " MMK");
            System.out.println("---------------------------------------------------------------------");
            System.out.println("Total bill: " + (Total_Bill - Discount) + " MMK");
            System.out.println("---------------------------------------------------------------------");

        } else {
            System.out.println("---------------------------------------------------------------------");
        }


    }

    public static void displayTicketDetailsofKZX(String planeName,  int economyPrice, int premiumPrice, int firstClassPrice, int Seat_Price, int Total_Bill, double Discount, Scanner scanner) {
        System.out.println("-------------------------------------------------------------------------------------------------------------------");
        System.out.println("Plane names   |      Trip       |                          Time           |                        Role and Price                        |");
        System.out.println("-------------------------------------------------------------------------------------------------------------------");
        System.out.println(planeName + "       |   RGN <-> NPT    |   12:00pm-->12:45pm || 21:00pm-->21:40pm | (Economy)" + economyPrice + "MMK|(Premium)" + premiumPrice + "MMK | (First)" + firstClassPrice + "MMK   |");
        System.out.println("-------------------------------------------------------------------------------------------------------------------");

        System.out.println("If you want to buy sure, Click 'Sure'");
        System.out.println("If you are not sure, Click 'Back'");
        String input = scanner.nextLine();

        if (input.equalsIgnoreCase("Sure")) {
            int remainingAttempts = 3;

            while (remainingAttempts > 0) {
                System.out.println("ID : ");
                int id = Integer.parseInt(scanner.nextLine());
                Customer customer = CustomerManager.findCustomerById(id);

                if (customer != null) {
                    System.out.println("---------------------------------------------------------------------");
                    System.out.println("ID : " + customer.getId());
                    System.out.println("Name : " + customer.getName());
                    System.out.println("Age : " + customer.getAge());
                    System.out.println("Gender : " + customer.getGender());
                    System.out.println("Phone : " + customer.getPhone());
                    System.out.println("Your Account was found!");

                    System.out.println("Password: ");
                    String enteredPassword = scanner.nextLine();

                    if (enteredPassword.equals(customer.getPassword())) {
                        System.out.println("---------------------------------------------------------------------");

                        break;
                    } else {
                        remainingAttempts--;
                        System.out.println("Incorrect password! " + remainingAttempts + " attempts remaining. Please try again.");
                    }
                } else {
                    System.out.println("No customer found with that ID.");
                }
            }

            if (remainingAttempts == 0) {
                System.out.println("Password entry limit reached. Returning to the main menu.");
                System.out.println("---------------------------------------------------------------------------------------------------------------------------------");
                return;
            }
            System.out.println("Plane Name: " + planeName);
            System.out.println("Trip: YGN <-> NPT");
            String Departure;
            while (true) {
                System.out.println("Departure (YGN or NPT) : ");
                Departure = scanner.nextLine();
                if (Departure.equalsIgnoreCase("YGN") || Departure.equalsIgnoreCase("NPT")) {
                    break;
                }
                System.out.println("Invalid gender! Please enter 'YGN' or 'NPT'.");
            }
            String Destination;
            while (true) {
                System.out.println("Destination (YGN or NPT) : ");
                Destination = scanner.nextLine();
                if (Destination.equalsIgnoreCase("YGN") || Destination.equalsIgnoreCase("NPT")) {
                    break;
                }
                System.out.println("Invalid gender! Please enter 'YGN' or 'NPT'.");
            }

            System.out.println("Adults (18+): ");
            int adults;
            while (true) {
                adults = Integer.parseInt(scanner.nextLine());
                if (adults >= 1 && adults <= 6) {
                    break;
                } else {
                    System.out.println("Invalid input! Please enter a number between 1 and 6.");
                }
            }

            System.out.println("Children (5-17): ");
            int children;
            while (true) {
                children = Integer.parseInt(scanner.nextLine());
                if (children >= 0 && children <= 6) {
                    break;
                } else {
                    System.out.println("Invalid input! Please enter a number between 0 and 6.");
                }
            }

            System.out.println("Infants (under 5): ");
            int infants;
            while (true) {
                infants = Integer.parseInt(scanner.nextLine());
                if (infants >= 0 && infants <= 6) {
                    break;
                } else {
                    System.out.println("Invalid input! Please enter a number between 0 and 6.");
                }
            }

            String seatType;
            while (true) {
                System.out.println("Select seat type (Economy, Premium, First Class): ");
                seatType = scanner.nextLine();

                switch (seatType.toLowerCase()) {
                    case "economy":
                        SeatArrangement.KZXdisplayEconomySeats();
                        Seat_Price = economyPrice;
                        break;
                    case "premium":
                        SeatArrangement.KZXdisplayPremiumSeats();
                        Seat_Price = premiumPrice;
                        break;
                    case "first class":
                        SeatArrangement.KZXdisplayFirstClassSeats();
                        Seat_Price = firstClassPrice;
                        break;
                    default:
                        System.out.println("Invalid seat type! Please select from Economy, Premium, or First Class.");
                        continue;
                }
                break;
            }
            String seatNumber;
            while (true) {
                System.out.println("Select seat number (eg: A-1): ");
                seatNumber = scanner.nextLine();
                boolean isAvailable = SeatArrangement.checkSeatAvailabilityofKZX(seatType, seatNumber);
                if (!isAvailable) {
                    System.out.println("Sorry, this seat is not available. Please choose another seat.");
                } else {
                    SeatArrangement.bookSeatofKZX(seatNumber);
                    break;
                }
            }
            LocalDate travelDate = null;
            DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
            while (travelDate == null) {
                System.out.println("Enter travel date (YYYY-MM-DD): ");
                String dateInput = scanner.nextLine();
                try {
                    travelDate = LocalDate.parse(dateInput, dateFormatter);
                } catch (DateTimeParseException e) {
                    System.out.println("Invalid date format. Please use YYYY-MM-DD.");

                }
            }

            System.out.println("Pay (KBZ, Wave, VISA): ");
            String paymentMethod;
            while (true) {
                paymentMethod = scanner.nextLine();
                if (paymentMethod.equalsIgnoreCase("KBZ") || paymentMethod.equalsIgnoreCase("Wave") || paymentMethod.equalsIgnoreCase("VISA")) {
                    break;
                } else {
                    System.out.println("Invalid input! Please enter 'KBZ', 'Wave', or 'VISA'.");
                }
            }
            System.out.println("---------------------------------------------------------------------");
            System.out.println("Plane Name: " + planeName);
            System.out.println("Trip: YGN to MDY");
            System.out.println("Departure : " + Departure);
            System.out.println("Destination : " + Destination);
            System.out.println("Time: " + (Departure.equalsIgnoreCase("YGN") ? "12:00pm-->12:45Am" : "21:00pm-->21:45pm"));
            System.out.println("Adults (12+): " + adults);
            System.out.println("Children (2-11): " + children);
            System.out.println("Infants (under 2): " + infants);
            System.out.println("Passenger: " + (adults + children + infants));
            System.out.println("Role: " + seatType);
            System.out.println("Seat: " + seatNumber);
            System.out.println("Date of Travel: " + travelDate.format(dateFormatter));
            System.out.println("Pay (KBZ, Wave, VISA): " + paymentMethod);
            Total_Bill = (adults + children) * Seat_Price;
            double DiscountAmount = Total_Bill * Discount;
            System.out.println("Discount: 5 %");
            System.out.println("Discount 5%: " + (DiscountAmount) + " MMK");
            System.out.println("---------------------------------------------------------------------");
            System.out.println("Total bill: " + (Total_Bill - Discount) + " MMK");
            System.out.println("---------------------------------------------------------------------");

        } else {
            System.out.println("---------------------------------------------------------------------");
        }


    }

    public static void displayTicketDetailsofZXK(String planeName, int economyPrice, int premiumPrice, int firstClassPrice, int Seat_Price, int Total_Bill, double Discount, Scanner scanner) {
        System.out.println("-------------------------------------------------------------------------------------------------------------------");
        System.out.println("Plane names   |      Trip       |                          Time           |                        Role and Price                        |");
        System.out.println("-------------------------------------------------------------------------------------------------------------------");
        System.out.println(planeName + "       |   RGN <-> MYK    |   15:00pm-->15:55pm  || 18:00pm-->18:55pm | (Economy)" + economyPrice + "MMK|(Premium)" + premiumPrice + "MMK | (First)" + firstClassPrice + "MMK   |");
        System.out.println("-------------------------------------------------------------------------------------------------------------------");

        System.out.println("If you want to buy sure, Click 'Sure'");
        System.out.println("If you are not sure, Click 'Back'");
        String input = scanner.nextLine();

        if (input.equalsIgnoreCase("Sure")) {
            int remainingAttempts = 3;

            while (remainingAttempts > 0) {
                System.out.println("ID : ");
                int id = Integer.parseInt(scanner.nextLine());
                Customer customer = CustomerManager.findCustomerById(id);

                if (customer != null) {
                    System.out.println("---------------------------------------------------------------------");
                    System.out.println("ID : " + customer.getId());
                    System.out.println("Name : " + customer.getName());
                    System.out.println("Age : " + customer.getAge());
                    System.out.println("Gender : " + customer.getGender());
                    System.out.println("Phone : " + customer.getPhone());
                    System.out.println("Your Account was found!");

                    System.out.println("Password: ");
                    String enteredPassword = scanner.nextLine();

                    if (enteredPassword.equals(customer.getPassword())) {
                        System.out.println("---------------------------------------------------------------------");

                        break;
                    } else {
                        remainingAttempts--;
                        System.out.println("Incorrect password! " + remainingAttempts + " attempts remaining. Please try again.");
                    }
                } else {
                    System.out.println("No customer found with that ID.");
                }
            }

            if (remainingAttempts == 0) {
                System.out.println("Password entry limit reached. Returning to the main menu.");
                System.out.println("---------------------------------------------------------------------------------------------------------------------------------");
                return;
            }
            System.out.println("Plane Name: " + planeName);
            System.out.println("Trip: YGN <-> MYK");
            String Departure;
            while (true) {
                System.out.println("Departure (YGN or MYK) : ");
                Departure = scanner.nextLine();
                if (Departure.equalsIgnoreCase("YGN") || Departure.equalsIgnoreCase("MYK")) {
                    break;
                }
                System.out.println("Invalid gender! Please enter 'YGN' or 'MYK'.");
            }
            String Destination;
            while (true) {
                System.out.println("Destination (YGN or MYK) : ");
                Destination = scanner.nextLine();
                if (Destination.equalsIgnoreCase("YGN") || Destination.equalsIgnoreCase("MYK")) {
                    break;
                }
                System.out.println("Invalid gender! Please enter 'YGN' or 'MYK'.");
            }

            System.out.println("Adults (18+): ");
            int adults;
            while (true) {
                adults = Integer.parseInt(scanner.nextLine());
                if (adults >= 1 && adults <= 6) {
                    break;
                } else {
                    System.out.println("Invalid input! Please enter a number between 1 and 6.");
                }
            }

            System.out.println("Children (5-17): ");
            int children;
            while (true) {
                children = Integer.parseInt(scanner.nextLine());
                if (children >= 0 && children <= 6) {
                    break;
                } else {
                    System.out.println("Invalid input! Please enter a number between 0 and 6.");
                }
            }

            System.out.println("Infants (under 5): ");
            int infants;
            while (true) {
                infants = Integer.parseInt(scanner.nextLine());
                if (infants >= 0 && infants <= 6) {
                    break;
                } else {
                    System.out.println("Invalid input! Please enter a number between 0 and 6.");
                }
            }

            String seatType;
            while (true) {
                System.out.println("Select seat type (Economy, Premium, First Class): ");
                seatType = scanner.nextLine();

                switch (seatType.toLowerCase()) {
                    case "economy":
                        SeatArrangement.ZXKdisplayEconomySeats();
                        Seat_Price = economyPrice;
                        break;
                    case "premium":
                        SeatArrangement.ZXKdisplayPremiumSeats();
                        Seat_Price = premiumPrice;
                        break;
                    case "first class":
                        SeatArrangement.ZXKdisplayFirstClassSeats();
                        Seat_Price = firstClassPrice;
                        break;
                    default:
                        System.out.println("Invalid seat type! Please select from Economy, Premium, or First Class.");
                        continue;
                }
                break;
            }
            String seatNumber;
            while (true) {
                System.out.println("Select seat number (eg: A-1): ");
                seatNumber = scanner.nextLine();
                boolean isAvailable = SeatArrangement.checkSeatAvailabilityofZXK(seatType, seatNumber);
                if (!isAvailable) {
                    System.out.println("Sorry, this seat is not available. Please choose another seat.");
                } else {
                    SeatArrangement.bookSeatofZXK(seatNumber);
                    break;
                }
            }
            LocalDate travelDate = null;
            DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
            while (travelDate == null) {
                System.out.println("Enter travel date (YYYY-MM-DD): ");
                String dateInput = scanner.nextLine();
                try {
                    travelDate = LocalDate.parse(dateInput, dateFormatter);
                } catch (DateTimeParseException e) {
                    System.out.println("Invalid date format. Please use YYYY-MM-DD.");

                }
            }

            System.out.println("Pay (KBZ, Wave, VISA): ");
            String paymentMethod;
            while (true) {
                paymentMethod = scanner.nextLine();
                if (paymentMethod.equalsIgnoreCase("KBZ") || paymentMethod.equalsIgnoreCase("Wave") || paymentMethod.equalsIgnoreCase("VISA")) {
                    break;
                } else {
                    System.out.println("Invalid input! Please enter 'KBZ', 'Wave', or 'VISA'.");
                }
            }
            System.out.println("---------------------------------------------------------------------");
            System.out.println("Plane Name: " + planeName);
            System.out.println("Trip: YGN to MDY");
            System.out.println("Departure : " + Departure);
            System.out.println("Destination : " + Destination);
            System.out.println("Time: " + (Departure.equalsIgnoreCase("YGN") ? "15:00pm-->15:55pm " : "18:00pm-->18:55pm"));
            System.out.println("Adults (12+): " + adults);
            System.out.println("Children (2-11): " + children);
            System.out.println("Infants (under 2): " + infants);
            System.out.println("Passenger: " + (adults + children + infants));
            System.out.println("Role: " + seatType);
            System.out.println("Seat: " + seatNumber);
            System.out.println("Date of Travel: " + travelDate.format(dateFormatter));
            System.out.println("Pay (KBZ, Wave, VISA): " + paymentMethod);
            Total_Bill = (adults + children) * Seat_Price;
            double DiscountAmount = Total_Bill * Discount;
            System.out.println("Discount: 5 %");
            System.out.println("Discount 5%: " + (DiscountAmount) + " MMK");
            System.out.println("---------------------------------------------------------------------");
            System.out.println("Total bill: " + (Total_Bill - Discount) + " MMK");
            System.out.println("---------------------------------------------------------------------");

        } else {
            System.out.println("---------------------------------------------------------------------");
        }


    }
    public static void displayTicketDetailsofKXZ(String planeName,  int economyPrice, int premiumPrice, int firstClassPrice, int Seat_Price, int Total_Bill, double Discount, Scanner scanner) {
        System.out.println("-------------------------------------------------------------------------------------------------------------------");
        System.out.println("Plane names   |      Trip       |                          Time           |                        Role and Price                        |");
        System.out.println("-------------------------------------------------------------------------------------------------------------------");
        System.out.println(planeName + "       |   RGN <-> MKN    |   8:00Am-->9:30Am    || 16:00pm-->17:30pm | (Economy)" + economyPrice + "MMK|(Premium)" + premiumPrice + "MMK | (First)" + firstClassPrice + "MMK   |");
        System.out.println("-------------------------------------------------------------------------------------------------------------------");

        System.out.println("If you want to buy sure, Click 'Sure'");
        System.out.println("If you are not sure, Click 'Back'");
        String input = scanner.nextLine();

        if (input.equalsIgnoreCase("Sure")) {
            int remainingAttempts = 3;

            while (remainingAttempts > 0) {
                System.out.println("ID : ");
                int id = Integer.parseInt(scanner.nextLine());
                Customer customer = CustomerManager.findCustomerById(id);

                if (customer != null) {
                    System.out.println("---------------------------------------------------------------------");
                    System.out.println("ID : " + customer.getId());
                    System.out.println("Name : " + customer.getName());
                    System.out.println("Age : " + customer.getAge());
                    System.out.println("Gender : " + customer.getGender());
                    System.out.println("Phone : " + customer.getPhone());
                    System.out.println("Your Account was found!");

                    System.out.println("Password: ");
                    String enteredPassword = scanner.nextLine();

                    if (enteredPassword.equals(customer.getPassword())) {
                        System.out.println("---------------------------------------------------------------------");

                        break;
                    } else {
                        remainingAttempts--;
                        System.out.println("Incorrect password! " + remainingAttempts + " attempts remaining. Please try again.");
                    }
                } else {
                    System.out.println("No customer found with that ID.");
                }
            }

            if (remainingAttempts == 0) {
                System.out.println("Password entry limit reached. Returning to the main menu.");
                System.out.println("---------------------------------------------------------------------------------------------------------------------------------");
                return;
            }
            System.out.println("Plane Name: " + planeName);
            System.out.println("Trip: YGN <-> MKN");
            String Departure;
            while (true) {
                System.out.println("Departure (YGN or MKN) : ");
                Departure = scanner.nextLine();
                if (Departure.equalsIgnoreCase("YGN") || Departure.equalsIgnoreCase("MKN")) {
                    break;
                }
                System.out.println("Invalid gender! Please enter 'YGN' or 'MKN'.");
            }
            String Destination;
            while (true) {
                System.out.println("Destination (YGN or MKN) : ");
                Destination = scanner.nextLine();
                if (Destination.equalsIgnoreCase("YGN") || Destination.equalsIgnoreCase("MKN")) {
                    break;
                }
                System.out.println("Invalid gender! Please enter 'YGN' or 'MKN'.");
            }

            System.out.println("Adults (18+): ");
            int adults;
            while (true) {
                adults = Integer.parseInt(scanner.nextLine());
                if (adults >= 1 && adults <= 6) {
                    break;
                } else {
                    System.out.println("Invalid input! Please enter a number between 1 and 6.");
                }
            }

            System.out.println("Children (5-17): ");
            int children;
            while (true) {
                children = Integer.parseInt(scanner.nextLine());
                if (children >= 0 && children <= 6) {
                    break;
                } else {
                    System.out.println("Invalid input! Please enter a number between 0 and 6.");
                }
            }

            System.out.println("Infants (under 5): ");
            int infants;
            while (true) {
                infants = Integer.parseInt(scanner.nextLine());
                if (infants >= 0 && infants <= 6) {
                    break;
                } else {
                    System.out.println("Invalid input! Please enter a number between 0 and 6.");
                }
            }

            String seatType;
            while (true) {
                System.out.println("Select seat type (Economy, Premium, First Class): ");
                seatType = scanner.nextLine();

                switch (seatType.toLowerCase()) {
                    case "economy":
                        SeatArrangement.KXZdisplayEconomySeats();
                        Seat_Price = economyPrice;
                        break;
                    case "premium":
                        SeatArrangement.KXZdisplayPremiumSeats();
                        Seat_Price = premiumPrice;
                        break;
                    case "first class":
                        SeatArrangement.KXZdisplayFirstClassSeats();
                        Seat_Price = firstClassPrice;
                        break;
                    default:
                        System.out.println("Invalid seat type! Please select from Economy, Premium, or First Class.");
                        continue;
                }
                break;
            }
            String seatNumber;
            while (true) {
                System.out.println("Select seat number (eg: A-1): ");
                seatNumber = scanner.nextLine();
                boolean isAvailable = SeatArrangement.checkSeatAvailabilityofKXZ(seatType, seatNumber);
                if (!isAvailable) {
                    System.out.println("Sorry, this seat is not available. Please choose another seat.");
                } else {
                    SeatArrangement.bookSeatofKXZ(seatNumber);
                    break;
                }
            }
            LocalDate travelDate = null;
            DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
            while (travelDate == null) {
                System.out.println("Enter travel date (YYYY-MM-DD): ");
                String dateInput = scanner.nextLine();
                try {
                    travelDate = LocalDate.parse(dateInput, dateFormatter);
                } catch (DateTimeParseException e) {
                    System.out.println("Invalid date format. Please use YYYY-MM-DD.");

                }
            }

            System.out.println("Pay (KBZ, Wave, VISA): ");
            String paymentMethod;
            while (true) {
                paymentMethod = scanner.nextLine();
                if (paymentMethod.equalsIgnoreCase("KBZ") || paymentMethod.equalsIgnoreCase("Wave") || paymentMethod.equalsIgnoreCase("VISA")) {
                    break;
                } else {
                    System.out.println("Invalid input! Please enter 'KBZ', 'Wave', or 'VISA'.");
                }
            }
            System.out.println("---------------------------------------------------------------------");
            System.out.println("Plane Name: " + planeName);
            System.out.println("Trip: YGN to MDY");
            System.out.println("Departure : " + Departure);
            System.out.println("Destination : " + Destination);
            System.out.println("Time: " + (Departure.equalsIgnoreCase("YGN") ? "15:00pm-->15:55pm " : "18:00pm-->18:55pm"));
            System.out.println("Adults (12+): " + adults);
            System.out.println("Children (2-11): " + children);
            System.out.println("Infants (under 2): " + infants);
            System.out.println("Passenger: " + (adults + children + infants));
            System.out.println("Role: " + seatType);
            System.out.println("Seat: " + seatNumber);
            System.out.println("Date of Travel: " + travelDate.format(dateFormatter));
            System.out.println("Pay (KBZ, Wave, VISA): " + paymentMethod);
            Total_Bill = (adults + children) * Seat_Price;
            double DiscountAmount = Total_Bill * Discount;
            System.out.println("Discount: 5 %");
            System.out.println("Discount 5%: " + (DiscountAmount) + " MMK");
            System.out.println("---------------------------------------------------------------------");
            System.out.println("Total bill: " + (Total_Bill - Discount) + " MMK");
            System.out.println("---------------------------------------------------------------------");

        } else {
            System.out.println("---------------------------------------------------------------------");
        }


    }
}



