import java.math.BigDecimal;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Calculator calculator = new Calculator("blue");
        calculator.calculate(12,23, "sum");

        Lesson3 lesson3 = new Lesson3();

        lesson3.reverse(2147483646);
        lesson3.min(7034952);
        lesson3.max(1534952);
        lesson3.duplicate(15670952);
        lesson3.descending(15670352);

        Lesson4 lesson4 = new Lesson4();

        lesson4.max(1, 2, 3, 4, 5);
        lesson4.min(2, 3, 5, 123, 456, 657);
        lesson4.even(2, 3, 5, 123, 456, 657);
        lesson4.odd(2, 3, 5, 123, 456, 657);
        lesson4.longest(2, 3, 5, 123, 456, 657);
        lesson4.shortest(2, 3, 5, 123, 456, 657);
        lesson4.increase(2, 3, 5, 123, 456, 657);
        lesson4.palindromes(2, 3, 5, 123, 456, 657);
        lesson4.bubble(2, 3, 5, 123, 456, 657);

        Lesson5 lesson5 = new Lesson5();

        lesson5.initialization(10, 5);
        lesson5.stair(10, 10);
        lesson5.triangle(10,10);

    }
}