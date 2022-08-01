package codewars.level7;

import java.util.Arrays;

public class Anogramms {
    /*Анаграмма — это результат перестановки букв слова для получения нового слова (см. Википедию ).
    Примечание: анаграммы нечувствительны к регистру .
    Завершите возвращаемую функцию, trueесли два заданных аргумента являются анаграммами друг друга; вернуть falseиначе.
     */
    public static boolean isAnagram(String test, String original) {
        if (test.length() != original.length()) {
            return false;
        } else {
            String testNew = test.toLowerCase();
            String originalNew = original.toLowerCase();
            char[] arrayOne = testNew.toCharArray();
            char[] arrayTwo = originalNew.toCharArray();
            Arrays.sort(arrayOne);
            Arrays.sort(arrayTwo);
            String one = new String(arrayOne);
            String two = new String(arrayTwo);
            System.out.println(one);
            System.out.println(two);
            return one.equalsIgnoreCase(two);
        }
    }
}