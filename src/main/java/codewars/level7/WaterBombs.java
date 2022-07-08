package codewars.level7;

import java.util.Locale;

public class WaterBombs {
    /*
    Данная строка представляет собой двумерную плоскость произвольной длины, состоящую из двух символов:
    xпредставляющий огонь
    Yпредставляющие здания.
    Вода, которую вы сбрасываете, не может пройти сквозь здания, и поэтому отдельные участки пожара должны рассматриваться отдельно.
    Ваши водяные бомбы могут тушить только смежные участки огня шириной до ширины (параметр w).
    Вы должны вернуть минимальное количество водяных бомб, необходимое для тушения пожара в строке.
    Примечание: все входные данные будут действительными.
     */
    public static int waterBombs(String fire, int w) {
        String fireToWork = fire.toLowerCase();
        char[] array = fireToWork.toCharArray();
        int countOfFireX = 0;
        int bomb = 0;
        for (char charInFire : array) {
            if ((charInFire == 'y') &&(countOfFireX > 0)) {
                countOfFireX = 0;
                bomb++;
                continue;
            }
            if ((charInFire == 'x') &&(countOfFireX < w)) {
                countOfFireX++;
            } else if (countOfFireX == w) {
                countOfFireX = 1;
                bomb++;
            }
        }
        if(countOfFireX>0)
            bomb++;
        return  bomb;
    }
}
