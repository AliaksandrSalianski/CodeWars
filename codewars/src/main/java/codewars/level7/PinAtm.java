package codewars.level7;

import java.util.Arrays;

import static java.util.Arrays.*;

public class PinAtm {
    // Банкоматы позволяют использовать 4- или 6-значные PIN-коды, а PIN-коды не могут содержать ничего, кроме ровно 4 или ровно 6 цифр.
    // Если функции передана допустимая строка PIN-кода, верните true, иначе верните false.
    public static boolean validatePin(String pin) {
        char[] arrayOfChars = pin.toCharArray();
        int[] arrayOfNumber = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        if (arrayOfChars.length == 4 || arrayOfChars.length == 6) {
            for (char ch : arrayOfChars) {
                if (Character.isDigit(ch)) {
                    int index = Arrays.binarySearch(arrayOfNumber, ch);
                    if (index > 0) return false;
                }else{
                    return false;
                }
            }

        }
        return true;
    }
}