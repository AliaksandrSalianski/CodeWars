package codewars.level7;

public class SummaTwoInt {
    //  Даны два целых числа aи b, которые могут быть положительными или отрицательными, найдите сумму всех целых чисел между ними и включая
    //  их и верните ее. Если два числа равны, верните a или b.
    public static int GetSum(int a, int b) {
        if (a == b) return a;
        int summa = 0;
        for (double i = Math.min(a, b); i <= Math.max(a, b); i++) {
            summa += i;
        }
        return summa;
    }
}
