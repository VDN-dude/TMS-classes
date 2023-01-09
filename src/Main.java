import java.math.BigDecimal;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Calculator calculator = new Calculator("blue");
        calculator.calculate(12,23, "sum");

        Lesson3 lesson3 = new Lesson3();

        lesson3.reverse(123456);
        lesson3.min(123456);
        lesson3.max(123456);
        lesson3.duplicate(1234156);
        lesson3.descending(123654789);

        Lesson4 lesson4 = new Lesson4();

        lesson4.max(new int[]{3,2,31,516,122,23,344});
        lesson4.min(new int[]{3,2,31,516,122,23,344});
        lesson4.even(new int[]{3,2,31,516,122,23,344});
        lesson4.odd(new int[]{3,2,31,516,122,23,344});
        lesson4.longest(new int[]{3,2,31,516,122,23,344});
        lesson4.shortest(new int[]{3,2,31,516,122,23,344});
        lesson4.increase(new int[]{3,2,31,516,122,23,344});
        lesson4.palindromes(new int[]{3,2,31,516,122,23,344});
        lesson4.bubble(new int[]{3,2,31,516,122,23,344});

        Lesson5 lesson5 = new Lesson5();

        lesson5.initialization(10, 5);
        lesson5.stair(10, 10);
        lesson5.triangle(10,10);

    }
}