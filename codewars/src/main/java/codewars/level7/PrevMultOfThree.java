package codewars.level7;

public class PrevMultOfThree {
    /*  Учитывая положительное целое число n: 0 < n < 1e6, удаляйте последнюю цифру, пока не останется число, кратное трем.

       Вернуть n, если ввод уже кратен трем, и если такого числа не существует, вернуть null аналогичное пустое значение или -1.

     */
    public static Integer prevMultOfThree(int n) {
        if (n == 0) {
            return -1;
        } else if (n % 3 == 0) {
            return n;
        } else {
            int size = (Integer.toString(n)).length();
            if (size == 1) return null;
            int result = n;
            for (int i = 0; i < size - 1; i++) {
                result /= 10;
                if (result % 3 == 0) {
                    return result;
                }
            }

        }
        return null;
    }
}