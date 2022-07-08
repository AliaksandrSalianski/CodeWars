package codewars.level7;

public class SquareDigits {
    //В этой ката вас просят возвести в квадрат каждую цифру числа и соединить их.
    //Например, если мы пропустим через функцию 9119, получится 811181, потому что 9 2 равно 81, а 1 2 равно 1.
    //Примечание . Функция принимает целое число и возвращает целое число.

    public static int squareDigits(int number) {
        String str = String.valueOf(number);
        char[] arrayChar = str.toCharArray();
        int[] arrayInt = new int[arrayChar.length];
        for (int i = 0; i < arrayChar.length; i++) {
            int n = Character.getNumericValue(arrayChar[i]);
            arrayInt[i] = (int) (Math.pow(n, 2));
        }
        int result = 0;
        for (int n : arrayInt) {
            if (n > 10) {
                result = result * 100 + n;
            } else {
                result = result * 10 + n;
            }
        }
        return result;
    }
}