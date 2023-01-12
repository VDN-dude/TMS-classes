import java.math.BigDecimal;

public class Calculator {

    ConsoleWriter consoleWriter = new ConsoleWriter();
    String color;
    Calculator(String c){color = c;}

    BigDecimal calculate(double num1, double num2, String type) {

        BigDecimal dnum1 = new BigDecimal(num1);
        BigDecimal dnum2 = new BigDecimal(num2);

        switch (type) {
            case "sum":
                return dnum1.add(dnum2);
            case "sub":
                 return dnum1.subtract(dnum2);
            case "mul":
                return dnum1.multiply(dnum2);
            case "div":
                return dnum1.divide(dnum2);
        }
        return null;
    }
}
