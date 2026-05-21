
import java.util.HashSet;
import java.util.Set;



public class SeatArrangement {
    private static Set<String> bookedSeatsofXZK = new HashSet<>();
    private static Set<String> bookedSeatsofZKX = new HashSet<>();
    private static Set<String> bookedSeatsofKZX = new HashSet<>();

    private static Set<String> bookedSeatsofZXK = new HashSet<>();
    private static Set<String> bookedSeatsofKXZ = new HashSet<>();
     // For XZK
    public static void XZKdisplayEconomySeats() {
        System.out.println("Economy Seats:");
        for (int i = 1; i <= 4; i++) {
            String seat = "A-" + i;
            System.out.print(seat + " " + (isSeatAvailableofXZK(seat) ? "(Available)  " : "(Booked)     "));
        }
        System.out.println();
        for (int i = 5; i <= 8; i++) {
            String seat = "B-" + i;
            System.out.print(seat + " " + (isSeatAvailableofXZK(seat) ? "(Available)  " : "(Booked)     "));
        }
        System.out.println();
        for (int i = 9; i <= 12; i++) {
            String seat = "C-" + i;
            System.out.print(seat + " " + (isSeatAvailableofXZK(seat) ? "(Available)  " : "(Booked)     "));
        }
        System.out.println();
        for (int i = 13; i <= 16; i++) {
            String seat = "D-" + i;
            System.out.print(seat + " " + (isSeatAvailableofXZK(seat) ? "(Available)  " : "(Booked)     "));
        }
        System.out.println();
        for (int i = 17; i <= 20; i++) {
            String seat = "A-" + i;
            System.out.print(seat + " " + (isSeatAvailableofXZK(seat) ? "(Available)  " : "(Booked)     "));
        }
        System.out.println();
        for (int i = 21; i <= 25; i++) {
            String seat = "B-" + i;
            System.out.print(seat + "  " + (isSeatAvailableofXZK(seat) ? "(Available) " : "(Booked)    "));
        }
        System.out.println();
        for (int i = 26; i <= 30; i++) {
            String seat = "C-" + i;
            System.out.print(seat + "  " + (isSeatAvailableofXZK(seat) ? "(Available) " : "(Booked)    "));
        }
        System.out.println();
    }

    public static void XZKdisplayPremiumSeats() {
        System.out.println("Premium Seats:");
        for (int i = 31; i <= 34; i++) {
            String seat = "A-" + i;
            System.out.print(seat + " " + (isSeatAvailableofXZK(seat) ? "(Available)  " : "(Booked)     "));
        }
        System.out.println();
        for (int i = 35; i <= 38; i++) {
            String seat = "B-" + i;
            System.out.print(seat + " " + (isSeatAvailableofXZK(seat) ? "(Available)  " : "(Booked)     "));
        }
        System.out.println();
        for (int i = 39; i <= 42; i++) {
            String seat = "C-" + i;
            System.out.print(seat + " " + (isSeatAvailableofXZK(seat) ? "(Available)  " : "(Booked)     "));
        }
        System.out.println();
        for (int i = 43; i <= 46; i++) {
            String seat = "D-" + i;
            System.out.print(seat + " " + (isSeatAvailableofXZK(seat) ? "(Available)  " : "(Booked)     "));
        }
        System.out.println();
        for (int i = 47; i <= 50; i++) {
            String seat = "A-" + i;
            System.out.print(seat + " " + (isSeatAvailableofXZK(seat) ? "(Available)  " : "(Booked)     "));
        }
        System.out.println();
        for (int i = 51; i <= 54; i++) {
            String seat = "B-" + i;
            System.out.print(seat + " " + (isSeatAvailableofXZK(seat) ? "(Available)  " : "(Booked)     "));
        }
        System.out.println();
        for (int i = 55; i <= 58; i++) {
            String seat = "C-" + i;
            System.out.print(seat + " " + (isSeatAvailableofXZK(seat) ? "(Available)  " : "(Booked)     "));
        }
        System.out.println();
        for (int i = 59; i <= 62; i++) {
            String seat = "D-" + i;
            System.out.print(seat + " " + (isSeatAvailableofXZK(seat) ? "(Available)  " : "(Booked)     "));
        }
        System.out.println();
        for (int i = 63; i <= 65; i++) {
            String seat = "A-" + i;
            System.out.print(seat + " " + (isSeatAvailableofXZK(seat) ? "(Available)  " : "(Booked)     "));
        }
        System.out.println();

    }

    public static void XZKdisplayFirstClassSeats() {
        System.out.println("First Class Seats:");
        for (int i = 66; i <= 70; i++) {
            String seat = "A-" + i;
            System.out.print(seat + " " + (isSeatAvailableofXZK(seat) ? "(Available)  " : "(Booked)     "));
        }
        System.out.println();
    }
    private static boolean isSeatAvailableofXZK(String seatNumber) {
        return !bookedSeatsofXZK.contains(seatNumber);
    }

    public static boolean checkSeatAvailabilityofXZK(String seatType, String seatNumber) {
        return !bookedSeatsofXZK.contains(seatNumber);
    }

    public static void bookSeatofXZK(String seatNumber) {
        bookedSeatsofXZK.add(seatNumber);
    }

     //For ZKX
    public static void ZKXdisplayEconomySeats() {
        System.out.println("Economy Seats:");
        for (int i = 1; i <= 4; i++) {
            String seat = "A-" + i;
            System.out.print(seat + " " + (isSeatAvailableofZKX(seat) ? "(Available)  " : "(Booked)     "));
        }
        System.out.println();
        for (int i = 5; i <= 8; i++) {
            String seat = "B-" + i;
            System.out.print(seat + " " + (isSeatAvailableofZKX(seat) ? "(Available)  " : "(Booked)     "));
        }
        System.out.println();
        for (int i = 9; i <= 12; i++) {
            String seat = "C-" + i;
            System.out.print(seat + " " + (isSeatAvailableofZKX(seat) ? "(Available)  " : "(Booked)     "));
        }
        System.out.println();
        for (int i = 13; i <= 16; i++) {
            String seat = "D-" + i;
            System.out.print(seat + " " + (isSeatAvailableofZKX(seat) ? "(Available)  " : "(Booked)     "));
        }
        System.out.println();
        for (int i = 17; i <= 20; i++) {
            String seat = "A-" + i;
            System.out.print(seat + " " + (isSeatAvailableofZKX(seat) ? "(Available)  " : "(Booked)     "));
        }
        System.out.println();
        for (int i = 21; i <= 25; i++) {
            String seat = "B-" + i;
            System.out.print(seat + "  " + (isSeatAvailableofZKX(seat) ? "(Available) " : "(Booked)    "));
        }
        System.out.println();
        for (int i = 26; i <= 30; i++) {
            String seat = "C-" + i;
            System.out.print(seat + "  " + (isSeatAvailableofZKX(seat) ? "(Available) " : "(Booked)    "));
        }
        System.out.println();
    }

    public static void ZKXdisplayPremiumSeats() {
        System.out.println("Premium Seats:");
        for (int i = 31; i <= 34; i++) {
            String seat = "A-" + i;
            System.out.print(seat + " " + (isSeatAvailableofZKX(seat) ? "(Available)  " : "(Booked)     "));
        }
        System.out.println();
        for (int i = 35; i <= 38; i++) {
            String seat = "B-" + i;
            System.out.print(seat + " " + (isSeatAvailableofXZK(seat) ? "(Available)  " : "(Booked)     "));
        }
        System.out.println();
        for (int i = 39; i <= 42; i++) {
            String seat = "C-" + i;
            System.out.print(seat + " " + (isSeatAvailableofXZK(seat) ? "(Available)  " : "(Booked)     "));
        }
        System.out.println();
        for (int i = 43; i <= 46; i++) {
            String seat = "D-" + i;
            System.out.print(seat + " " + (isSeatAvailableofXZK(seat) ? "(Available)  " : "(Booked)     "));
        }
        System.out.println();
        for (int i = 47; i <= 50; i++) {
            String seat = "A-" + i;
            System.out.print(seat + " " + (isSeatAvailableofXZK(seat) ? "(Available)  " : "(Booked)     "));
        }
        System.out.println();
        for (int i = 51; i <= 54; i++) {
            String seat = "B-" + i;
            System.out.print(seat + " " + (isSeatAvailableofXZK(seat) ? "(Available)  " : "(Booked)     "));
        }
        System.out.println();
        for (int i = 55; i <= 58; i++) {
            String seat = "C-" + i;
            System.out.print(seat + " " + (isSeatAvailableofXZK(seat) ? "(Available)  " : "(Booked)     "));
        }
        System.out.println();
        for (int i = 59; i <= 62; i++) {
            String seat = "D-" + i;
            System.out.print(seat + " " + (isSeatAvailableofXZK(seat) ? "(Available)  " : "(Booked)     "));
        }
        System.out.println();
        for (int i = 63; i <= 65; i++) {
            String seat = "A-" + i;
            System.out.print(seat + " " + (isSeatAvailableofXZK(seat) ? "(Available)  " : "(Booked)     "));
        }
        System.out.println();

    }



    public static void ZKXdisplayFirstClassSeats() {
        System.out.println("First Class Seats:");
        for (int i = 66; i <= 70; i++) {
            String seat = "A-" + i;
            System.out.print(seat + " " + (isSeatAvailableofZKX(seat) ? "(Available)  " : "(Booked)     "));
        }
        System.out.println();
    }
    private static boolean isSeatAvailableofZKX(String seatNumber) {
        return !bookedSeatsofZKX.contains(seatNumber);
    }

    public static boolean checkSeatAvailabilityofZKX(String seatType, String seatNumber) {
        return !bookedSeatsofZKX.contains(seatNumber);
    }
    public static void bookSeatofZKX(String seatNumber) {
        bookedSeatsofZKX.add(seatNumber);
    }
    //For KZX
    public static void KZXdisplayEconomySeats() {
        System.out.println("Economy Seats:");
        for (int i = 1; i <= 4; i++) {
            String seat = "A-" + i;
            System.out.print(seat + " " + (isSeatAvailableofKZX(seat) ? "(Available)  " : "(Booked)     "));
        }
        System.out.println();
        for (int i = 5; i <= 8; i++) {
            String seat = "B-" + i;
            System.out.print(seat + " " + (isSeatAvailableofKZX(seat) ? "(Available)  " : "(Booked)     "));
        }
        System.out.println();
        for (int i = 9; i <= 12; i++) {
            String seat = "C-" + i;
            System.out.print(seat + " " + (isSeatAvailableofKZX(seat) ? "(Available)  " : "(Booked)     "));
        }
        System.out.println();
        for (int i = 13; i <= 16; i++) {
            String seat = "D-" + i;
            System.out.print(seat + " " + (isSeatAvailableofKZX(seat) ? "(Available)  " : "(Booked)     "));
        }
        System.out.println();
        for (int i = 17; i <= 20; i++) {
            String seat = "A-" + i;
            System.out.print(seat + " " + (isSeatAvailableofKZX(seat) ? "(Available)  " : "(Booked)     "));
        }
        System.out.println();
        for (int i = 21; i <= 25; i++) {
            String seat = "B-" + i;
            System.out.print(seat + "  " + (isSeatAvailableofKZX(seat) ? "(Available) " : "(Booked)    "));
        }
        System.out.println();
        for (int i = 26; i <= 30; i++) {
            String seat = "C-" + i;
            System.out.print(seat + "  " + (isSeatAvailableofKZX(seat) ? "(Available) " : "(Booked)    "));
        }
        System.out.println();
    }

    public static void KZXdisplayPremiumSeats() {
        System.out.println("Premium Seats:");
        for (int i = 31; i <= 34; i++) {
            String seat = "A-" + i;
            System.out.print(seat + " " + (isSeatAvailableofKZX(seat) ? "(Available)  " : "(Booked)     "));
        }
        System.out.println();
        for (int i = 35; i <= 38; i++) {
            String seat = "B-" + i;
            System.out.print(seat + " " + (isSeatAvailableofXZK(seat) ? "(Available)  " : "(Booked)     "));
        }
        System.out.println();
        for (int i = 39; i <= 42; i++) {
            String seat = "C-" + i;
            System.out.print(seat + " " + (isSeatAvailableofXZK(seat) ? "(Available)  " : "(Booked)     "));
        }
        System.out.println();
        for (int i = 43; i <= 46; i++) {
            String seat = "D-" + i;
            System.out.print(seat + " " + (isSeatAvailableofXZK(seat) ? "(Available)  " : "(Booked)     "));
        }
        System.out.println();
        for (int i = 47; i <= 50; i++) {
            String seat = "A-" + i;
            System.out.print(seat + " " + (isSeatAvailableofXZK(seat) ? "(Available)  " : "(Booked)     "));
        }
        System.out.println();
        for (int i = 51; i <= 54; i++) {
            String seat = "B-" + i;
            System.out.print(seat + " " + (isSeatAvailableofXZK(seat) ? "(Available)  " : "(Booked)     "));
        }
        System.out.println();
        for (int i = 55; i <= 58; i++) {
            String seat = "C-" + i;
            System.out.print(seat + " " + (isSeatAvailableofXZK(seat) ? "(Available)  " : "(Booked)     "));
        }
        System.out.println();
        for (int i = 59; i <= 62; i++) {
            String seat = "D-" + i;
            System.out.print(seat + " " + (isSeatAvailableofXZK(seat) ? "(Available)  " : "(Booked)     "));
        }
        System.out.println();
        for (int i = 63; i <= 65; i++) {
            String seat = "A-" + i;
            System.out.print(seat + " " + (isSeatAvailableofXZK(seat) ? "(Available)  " : "(Booked)     "));
        }
        System.out.println();

    }




    public static void KZXdisplayFirstClassSeats() {
        System.out.println("First Class Seats:");
        for (int i = 66; i <= 70; i++) {
            String seat = "A-" + i;
            System.out.print(seat + " " + (isSeatAvailableofKZX(seat) ? "(Available)  " : "(Booked)     "));
        }
        System.out.println();
    }
    private static boolean isSeatAvailableofKZX(String seatNumber) {
        return !bookedSeatsofKZX.contains(seatNumber);
    }

    public static boolean checkSeatAvailabilityofKZX(String seatType, String seatNumber) {
        return !bookedSeatsofKZX.contains(seatNumber);
    }
    public static void bookSeatofKZX(String seatNumber) {
        bookedSeatsofKZX.add(seatNumber);
    }
    // For ZXK
    public static void ZXKdisplayEconomySeats() {
        System.out.println("Economy Seats:");
        for (int i = 1; i <= 4; i++) {
            String seat = "A-" + i;
            System.out.print(seat + " " + (isSeatAvailableofZXK(seat) ? "(Available)  " : "(Booked)     "));
        }
        System.out.println();
        for (int i = 5; i <= 8; i++) {
            String seat = "B-" + i;
            System.out.print(seat + " " + (isSeatAvailableofZXK(seat) ? "(Available)  " : "(Booked)     "));
        }
        System.out.println();
        for (int i = 9; i <= 12; i++) {
            String seat = "C-" + i;
            System.out.print(seat + " " + (isSeatAvailableofZXK(seat) ? "(Available)  " : "(Booked)     "));
        }
        System.out.println();
        for (int i = 13; i <= 16; i++) {
            String seat = "D-" + i;
            System.out.print(seat + " " + (isSeatAvailableofZXK(seat) ? "(Available)  " : "(Booked)     "));
        }
        System.out.println();
        for (int i = 17; i <= 20; i++) {
            String seat = "A-" + i;
            System.out.print(seat + " " + (isSeatAvailableofZXK(seat) ? "(Available)  " : "(Booked)     "));
        }
        System.out.println();
        for (int i = 21; i <= 25; i++) {
            String seat = "B-" + i;
            System.out.print(seat + "  " + (isSeatAvailableofZXK(seat) ? "(Available) " : "(Booked)    "));
        }
        System.out.println();
        for (int i = 26; i <= 30; i++) {
            String seat = "C-" + i;
            System.out.print(seat + "  " + (isSeatAvailableofZXK(seat) ? "(Available) " : "(Booked)    "));
        }
        System.out.println();
    }

    public static void ZXKdisplayPremiumSeats() {
        System.out.println("Premium Seats:");
        for (int i = 31; i <= 34; i++) {
            String seat = "A-" + i;
            System.out.print(seat + " " + (isSeatAvailableofZXK(seat) ? "(Available)  " : "(Booked)     "));
        }
        System.out.println();
        for (int i = 35; i <= 38; i++) {
            String seat = "B-" + i;
            System.out.print(seat + " " + (isSeatAvailableofXZK(seat) ? "(Available)  " : "(Booked)     "));
        }
        System.out.println();
        for (int i = 39; i <= 42; i++) {
            String seat = "C-" + i;
            System.out.print(seat + " " + (isSeatAvailableofXZK(seat) ? "(Available)  " : "(Booked)     "));
        }
        System.out.println();
        for (int i = 43; i <= 46; i++) {
            String seat = "D-" + i;
            System.out.print(seat + " " + (isSeatAvailableofXZK(seat) ? "(Available)  " : "(Booked)     "));
        }
        System.out.println();
        for (int i = 47; i <= 50; i++) {
            String seat = "A-" + i;
            System.out.print(seat + " " + (isSeatAvailableofXZK(seat) ? "(Available)  " : "(Booked)     "));
        }
        System.out.println();
        for (int i = 51; i <= 54; i++) {
            String seat = "B-" + i;
            System.out.print(seat + " " + (isSeatAvailableofXZK(seat) ? "(Available)  " : "(Booked)     "));
        }
        System.out.println();
        for (int i = 55; i <= 58; i++) {
            String seat = "C-" + i;
            System.out.print(seat + " " + (isSeatAvailableofXZK(seat) ? "(Available)  " : "(Booked)     "));
        }
        System.out.println();
        for (int i = 59; i <= 62; i++) {
            String seat = "D-" + i;
            System.out.print(seat + " " + (isSeatAvailableofXZK(seat) ? "(Available)  " : "(Booked)     "));
        }
        System.out.println();
        for (int i = 63; i <= 65; i++) {
            String seat = "A-" + i;
            System.out.print(seat + " " + (isSeatAvailableofXZK(seat) ? "(Available)  " : "(Booked)     "));
        }
        System.out.println();

    }



    public static void ZXKdisplayFirstClassSeats() {
        System.out.println("First Class Seats:");
        for (int i = 66; i <= 70; i++) {
            String seat = "A-" + i;
            System.out.print(seat + " " + (isSeatAvailableofZXK(seat) ? "(Available)  " : "(Booked)     "));
        }
        System.out.println();
    }
    private static boolean isSeatAvailableofZXK(String seatNumber) {
        return !bookedSeatsofZXK.contains(seatNumber);
    }

    public static boolean checkSeatAvailabilityofZXK(String seatType, String seatNumber) {
        return !bookedSeatsofZXK.contains(seatNumber);
    }

    public static void bookSeatofZXK(String seatNumber) {
        bookedSeatsofZXK.add(seatNumber);
    }
    // For KXZ
    public static void KXZdisplayEconomySeats() {
        System.out.println("Economy Seats:");
        for (int i = 1; i <= 4; i++) {
            String seat = "A-" + i;
            System.out.print(seat + " " + (isSeatAvailableofKXZ(seat) ? "(Available)  " : "(Booked)     "));
        }
        System.out.println();
        for (int i = 5; i <= 8; i++) {
            String seat = "B-" + i;
            System.out.print(seat + " " + (isSeatAvailableofKXZ(seat) ? "(Available)  " : "(Booked)     "));
        }
        System.out.println();
        for (int i = 9; i <= 12; i++) {
            String seat = "C-" + i;
            System.out.print(seat + " " + (isSeatAvailableofKXZ(seat) ? "(Available)  " : "(Booked)     "));
        }
        System.out.println();
        for (int i = 13; i <= 16; i++) {
            String seat = "D-" + i;
            System.out.print(seat + " " + (isSeatAvailableofKXZ(seat) ? "(Available)  " : "(Booked)     "));
        }
        System.out.println();
        for (int i = 17; i <= 20; i++) {
            String seat = "A-" + i;
            System.out.print(seat + " " + (isSeatAvailableofKXZ(seat) ? "(Available)  " : "(Booked)     "));
        }
        System.out.println();
        for (int i = 21; i <= 25; i++) {
            String seat = "B-" + i;
            System.out.print(seat + "  " + (isSeatAvailableofKXZ(seat) ? "(Available) " : "(Booked)    "));
        }
        System.out.println();
        for (int i = 26; i <= 30; i++) {
            String seat = "C-" + i;
            System.out.print(seat + "  " + (isSeatAvailableofKXZ(seat) ? "(Available) " : "(Booked)    "));
        }
        System.out.println();
    }

    public static void KXZdisplayPremiumSeats() {
        System.out.println("Premium Seats:");
        for (int i = 31; i <= 34; i++) {
            String seat = "A-" + i;
            System.out.print(seat + " " + (isSeatAvailableofKXZ(seat) ? "(Available)  " : "(Booked)     "));
        }
        System.out.println();
        for (int i = 35; i <= 38; i++) {
            String seat = "B-" + i;
            System.out.print(seat + " " + (isSeatAvailableofXZK(seat) ? "(Available)  " : "(Booked)     "));
        }
        System.out.println();
        for (int i = 39; i <= 42; i++) {
            String seat = "C-" + i;
            System.out.print(seat + " " + (isSeatAvailableofXZK(seat) ? "(Available)  " : "(Booked)     "));
        }
        System.out.println();
        for (int i = 43; i <= 46; i++) {
            String seat = "D-" + i;
            System.out.print(seat + " " + (isSeatAvailableofXZK(seat) ? "(Available)  " : "(Booked)     "));
        }
        System.out.println();
        for (int i = 47; i <= 50; i++) {
            String seat = "A-" + i;
            System.out.print(seat + " " + (isSeatAvailableofXZK(seat) ? "(Available)  " : "(Booked)     "));
        }
        System.out.println();
        for (int i = 51; i <= 54; i++) {
            String seat = "B-" + i;
            System.out.print(seat + " " + (isSeatAvailableofXZK(seat) ? "(Available)  " : "(Booked)     "));
        }
        System.out.println();
        for (int i = 55; i <= 58; i++) {
            String seat = "C-" + i;
            System.out.print(seat + " " + (isSeatAvailableofXZK(seat) ? "(Available)  " : "(Booked)     "));
        }
        System.out.println();
        for (int i = 59; i <= 62; i++) {
            String seat = "D-" + i;
            System.out.print(seat + " " + (isSeatAvailableofXZK(seat) ? "(Available)  " : "(Booked)     "));
        }
        System.out.println();
        for (int i = 63; i <= 65; i++) {
            String seat = "A-" + i;
            System.out.print(seat + " " + (isSeatAvailableofXZK(seat) ? "(Available)  " : "(Booked)     "));
        }
        System.out.println();

    }



    public static void KXZdisplayFirstClassSeats() {
        System.out.println("First Class Seats:");
        for (int i = 66; i <= 70; i++) {
            String seat = "A-" + i;
            System.out.print(seat + " " + (isSeatAvailableofKXZ(seat) ? "(Available)  " : "(Booked)     "));
        }
        System.out.println();
    }
    private static boolean isSeatAvailableofKXZ(String seatNumber) {
        return !bookedSeatsofKXZ.contains(seatNumber);
    }

    public static boolean checkSeatAvailabilityofKXZ(String seatType, String seatNumber) {
        return !bookedSeatsofKXZ.contains(seatNumber);
    }
    public static void bookSeatofKXZ(String seatNumber) {
        bookedSeatsofKXZ.add(seatNumber);
    }


}






