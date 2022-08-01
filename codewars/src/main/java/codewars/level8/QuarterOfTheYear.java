package codewars.level8;

public class QuarterOfTheYear {
    //  Дан месяц как целое число от 1 до 12, вернитесь к тому, к какому кварталу года он принадлежит,
    //  как целое число.
    //  Например: 2-й месяц (февраль) является частью первого квартала; 6 месяц (июнь) входит во второй
    //  квартал; и
    //  месяц 11 (ноябрь) является частью четвертого квартала.
    public static int quarterOf(int month) {
        if (month >= 1 && month <= 3) return 1;
        else if (month > 3 && month <= 6) return 2;
        else if (month > 6 && month <= 9) return 3;
        else return 4;
    }

}
