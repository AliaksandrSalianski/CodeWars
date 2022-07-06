package codewars.level7;

public class MiddleChar {
    /* Вам дадут слово. Ваша задача — вернуть средний символ слова. Если длина слова нечетная, вернуть средний символ. Если длина слова четная, верните средние 2 символа.
    Kata.getMiddle("test") should return "es"

            Kata.getMiddle("testing") should return "t"

            Kata.getMiddle("middle") should return "dd"

            Kata.getMiddle("A") should return "A"

     */

    public static String getMiddle(String word) {
        char[] array = word.toCharArray();
        String result = "";
        switch (array.length) {
            case (0):
            case (1):
            case (2):
                return word;
        }
        if (array.length % 2 == 0) {
            result +=array[array.length / 2-1] ;
            result +=array[ array.length / 2];
            return result;
        }else {
            double index = Math.ceil(array.length)/2;
            return result+= array[(int) index];
        }
        //Code goes here!
    }

}