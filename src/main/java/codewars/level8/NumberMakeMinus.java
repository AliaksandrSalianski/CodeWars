package codewars.level8;

public class NumberMakeMinus {
    //  В этом простом задании вам дается число, и вы должны сделать его отрицательным. А может быть, число уже отрицательное?
    public static int makeNegative(final int  number){
      if(number<=0)return number;
      else return number*(-1);
    }

    public static void main(String[] args) {
        System.out.println(makeNegative(-43));
        System.out.println(makeNegative(0));
        System.out.println(makeNegative(-1));
        System.out.println(makeNegative(1));
        System.out.println(makeNegative(4));
    }
}
