package codewars.level7;

public class GetCount {
    /* Возвращает количество (количество) гласных в заданной строке.
     Мы будем рассматривать a, e, i, o, uкак гласные для этой Ката (но не y).
     Входная строка будет состоять только из строчных букв и/или пробелов.
     */
    public static int getCount(String str) {
        int vowelsCount = 0;
        char[] charToCompare = new char[]{'a', 'e', 'i', 'o','u'};
        char[] arrayOfChar = str.toCharArray();
        for (char args : arrayOfChar) {
            for (char compere : charToCompare) {
                if (args == compere) {
                    vowelsCount++;
                }
            }
        }

        return vowelsCount;
    }

}
