package codewars.level8;

public class BasicOperations {
   /* Ваша задача — создать функцию, которая выполняет четыре основные математические операции.
    Функция должна принимать три аргумента - операция(строка/символ), значение1(число), значение2(число).
    Функция должна возвращать числовой результат после применения выбранной операции.
    */

    public static Integer basicMath(String op, int v1, int v2) {
        switch (op) {
            case "+":
                return v1 + v2;
            case "-":
                return (v1 - v2);
            case "*":
                return (v1 * v2);
            case "/":
                return v1 / v2;
            default:
                return 0;
        }
    }
}