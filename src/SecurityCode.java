
public class SecurityCode {

    private static int PassCode1 = 471;
    private static int PassCode2 = 1000000;

    private static int PassCode3 = 471;
    private static int PassCode4 = 471000;
    private static int FinalSecurityCode = (PassCode2 * PassCode1 + PassCode3) + PassCode4;


    public static int getFinalSecurityCode() {
        return FinalSecurityCode;
    }
}


