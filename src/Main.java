import java.math.BigDecimal;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Calculator calculator = new Calculator("blue");
        calculator.calculate(12,23, "sum");

        Lesson3 lesson3 = new Lesson3();

        lesson3.Reverse(123456);
        lesson3.Min(123456);
        lesson3.Max(123456);
        lesson3.Duplicate(1234156);
        lesson3.Descending(123654789);

        Lesson4 lesson4 = new Lesson4();

        lesson4.Max(new int[]{3,2,31,516,122,23,344});
        lesson4.Min(new int[]{3,2,31,516,122,23,344});
        lesson4.Even(new int[]{3,2,31,516,122,23,344});
        lesson4.Odd(new int[]{3,2,31,516,122,23,344});
        lesson4.Longest(new int[]{3,2,31,516,122,23,344});
        lesson4.Shortest(new int[]{3,2,31,516,122,23,344});
        lesson4.Increase(new int[]{3,2,31,516,122,23,344});
        lesson4.Palindromes(new int[]{3,2,31,516,122,23,344});
        lesson4.Bubble(new int[]{3,2,31,516,122,23,344});

        Lesson5 lesson5 = new Lesson5();

        lesson5.Initialization(10, 5);
        lesson5.Stair(10, 10);
        lesson5.Triangle(10,10);

    }
}