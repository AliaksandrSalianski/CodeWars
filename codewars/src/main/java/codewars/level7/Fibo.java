package codewars.level7;

public class Fibo {
    public static long fib(int n) {
        if (n == 1 || n == 2) return 1;
        int[] array = new int[n];
        array[0] = 1;
        array[1] = 1;
        for (int i = 2; i < array.length; i++) {
            array[i] = array[i - 2] + array[i - 1];
        }
        return array[array.length - 1];

    }

}
