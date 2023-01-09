import java.math.BigDecimal;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Calculator calculator = new Calculator("blue");
        calculator.calculate(12,23, "sum");

        Lesson3 lesson3 = new Lesson3();
        int num = 1567034952;

        lesson3.reverse(num);
        lesson3.min(num);
        lesson3.max(num);
        lesson3.duplicate(num);
        lesson3.descending(num);

        Lesson4 lesson4 = new Lesson4();
        int[] arr = {3,2,31,516,122,23,344};

        lesson4.max(arr);
        lesson4.min(arr);
        lesson4.even(arr);
        lesson4.odd(arr);
        lesson4.longest(arr);
        lesson4.shortest(arr);
        lesson4.increase(arr);
        lesson4.palindromes(arr);
        lesson4.bubble(arr);

        Lesson5 lesson5 = new Lesson5();

        lesson5.initialization(10, 5);
        lesson5.stair(10, 10);
        lesson5.triangle(10,10);

    }
}