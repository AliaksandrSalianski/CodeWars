package codewars.level8;

public class CountSheep {
    // Например, если задано неотрицательное целое число, 3верните строку с бормотанием:
    // "1 sheep...2 sheep...3 sheep...". Ввод всегда будет действительным, т.е. отрицательных целых
    // чисел не будет.
    public static String countingSheep(int num) {
        StringBuilder stringBuilder = new StringBuilder();
        if(num == 0)return "";
        else for (int i = 1; i <= num; i++) {
            String one = i + "sheep...";
            stringBuilder.append(i).append(" sheep...");
        }
        return stringBuilder.toString() ;
    }
}
