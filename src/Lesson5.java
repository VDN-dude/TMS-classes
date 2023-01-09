import java.util.Arrays;

public class Lesson5 {
    ConsoleWriter consoleWriter = new ConsoleWriter();

    int[][] initialization(int arrayLenght, int deepArrayLenght) {
        int arr[][] = new int[arrayLenght][deepArrayLenght];
        int first = 1;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = first++;
            }
        }
        consoleWriter.writeln(Arrays.deepToString(arr));
        return null;
    }

    int[][] stair(int arrayLenght, int deepArrayLenght) {
        int[][] triangle = new int[arrayLenght][deepArrayLenght];
        for (int i = 0; i < triangle.length; i++) {
            for (int j = 0; j < triangle[i].length; j++) {
                if (j <= i) {
                    triangle[i][j] = 1;
                }
            }
            consoleWriter.writeln(Arrays.toString(triangle[i]));
        }
        return null;
    }

    int[][] triangle(int arrayLenght, int deepArrayLenght) {
        int[][] stairs = new int[arrayLenght][deepArrayLenght];
        for (int i = 0; i < stairs.length; i++) {
            for (int j = 0; j < stairs[i].length; j++) {
                if (j <= i) {
                    stairs[i][j] = 1;
                    consoleWriter.write(stairs[i][j]);
                }
            }
            consoleWriter.writeln(" ");
        }
        return null;
    }
}
