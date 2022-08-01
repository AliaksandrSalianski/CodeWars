import codewars.level7.MinimumInArray;
import codewars.level7.PinAtm;
import codewars.level7.SquareDigits;

public class Main {

    public static void main(String[] args) {
        System.out.println(PinAtm.validatePin("/123"));
        System.out.println(PinAtm.validatePin("-1234"));
        System.out.println(PinAtm.validatePin("1.234"));
        System.out.println(PinAtm.validatePin("-123"));
        System.out.println(PinAtm.validatePin("000000"));
        System.out.println(PinAtm.validatePin("OOOO"));
    }
}
