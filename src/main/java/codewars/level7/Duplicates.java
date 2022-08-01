package codewars.level7;

import java.util.Arrays;

public class Duplicates {
    /* Вам дан массив целых чисел, ваша задача будет состоять в том, чтобы подсчитать все пары в этом массиве и вернуть их количество
       Заметки:
       Массив может быть пустым или содержать только одно значение; в этом случае возврат0
       Если пар определенного числа больше, считайте каждую пару только один раз. Например: для [0, 0, 0, 0]возвращаемого значения 2(= 2 пары 0s)
       Случайные тесты: максимальная длина массива 1000, диапазон значений в массиве от 0 до 1000
       Примеры
     */
    public static int giveDuplicates(int[] array) {
        if (array.length <= 1) {
            return 0;
        }
        Arrays.sort(array);
        int countOfPar = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] +1 > array.length-1) {
                return countOfPar;
            } else if (array[i] == array[i + 1]) {
                countOfPar++;
                i += 1;
                if (i == array.length - 1) {
                    return countOfPar;
                }
            }
        }
        return countOfPar;
    }

}
