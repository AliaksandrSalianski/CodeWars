package codewars.level7;

public class ArrayOneTwo {
    //Учитывая целое число nи два других значения, постройте массив размера, n заполненный этими двумя значениями, чередующимися.
    public static String[] alternate(int n, String firstValue, String secondValue) {
        String[] array = new String[n];
        for (int i = 0; i < array.length; i++) {
            if (i % 2 == 0) {
                array[i] = firstValue;
            } else {
                array[i] = secondValue;
            }
        }
        return array;
    }
// second method **ternary operation**
    public static String[] newAlter(int n, String first, String second) {
        String[] array = new String[n];
        for (int i = 0; i < array.length; i++) {
            array[i] = i % 2 == 0 ? first : second;
        }
        return array;
    }
}
