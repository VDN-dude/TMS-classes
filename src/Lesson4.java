import java.util.Arrays;

public class Lesson4 {
    ConsoleWriter consoleWriter = new ConsoleWriter();
    int j = 0;
    int i = 0;

    //point 1 (Min & Max numbers)
    int[] Max(int[] arr) {
        int max = Integer.MIN_VALUE;
        for (i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        consoleWriter.writeln(max);
        return null;
    }
    int[] Min(int[] arr){
        int min = Integer.MAX_VALUE;
        for (i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        consoleWriter.writeln(min);
        return null;
    }

    //point 2 (Evens & Odds numbers)
    int[] Even(int[] arr) {
        for (i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                consoleWriter.write(arr[i] + ", ");
            }
        }
        consoleWriter.writeln("");
        return null;
    }

    int[] Odd(int[] arr) {
        for (i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                consoleWriter.write(arr[i] + ", ");
            }
        }
        consoleWriter.writeln("");
        return null;
    }

    //point 3 (Shortest & Longest numbers)
    int shortest = 0;
    int longest = 0;
    int start = 0;

    int[] Longest(int[] arr) {
        for (i = 0; i < arr.length; i++) {
            String stringLenght = String.valueOf(Math.abs(arr[i]));
            int lenght = stringLenght.length();
            if (lenght > start) {
                start = lenght;
                longest = arr[i];
            }
        }
        consoleWriter.writeln(longest);
        return null;
    }

    int[] Shortest(int[] arr) {
        start = Integer.MAX_VALUE;
        for (i = 0; i < arr.length; i++) {
            String stringLenght = String.valueOf(Math.abs(arr[i]));
            int lenght = stringLenght.length();
            if (lenght < start) {
                start = lenght;
                shortest = arr[i];
            }
        }
        consoleWriter.writeln(shortest);
        return null;
    }

    // point 4 (Display numbers that are in ascending order)
    int[] Increase(int[] arr) {
        int[] arr2 = new int[arr.length];
        System.arraycopy(arr, 0, arr2, 0, arr.length);
        Arrays.sort(arr2);
        out:
        for (i = 0; i < arr.length; i++) {
            for (j = 0; j < arr.length - 2; j++) {
                if (arr2[i] == arr[j]) {
                    break out;
                }
            }
        }
        consoleWriter.write(arr[j]);

        for (i = i; i < arr.length; i++) {
            for (int j1 = j + 1; j1 < arr.length; j1++) {
                if (arr2[i] == arr[j1] && j < j1) {
                    consoleWriter.write(" " + arr[j1]);
                    j = j1;
                }
            }
        }
        consoleWriter.writeln("");
        return null;
    }

    //point 5 (Palindromes)
    int[] Palindromes(int[] arr) {
        boolean palindromes = false;
        for (i = 0; i < arr.length; i++) {
            String snum = String.valueOf(Math.abs(arr[i]));
            StringBuilder polindrome = new StringBuilder(snum);

            int pol = Integer.parseInt(polindrome.reverse().toString());
            int num = Integer.parseInt(snum);

            if (num == pol && polindrome.length() > 1) {
                consoleWriter.write(arr[i] + " ");
                palindromes = true;
            }
        }
        consoleWriter.writeln("");
        return null;
    }

    //point with *
    int[] Bubble(int[] arr) {
        boolean sorted = true;
        int sort = 0;
        while (sorted) {
            sorted = false;
            for (i = 0; i < arr.length - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    sorted = true;
                    sort = arr[i + 1];
                    arr[i + 1] = arr[i];
                    arr[i] = sort;
                }
            }
        }
        consoleWriter.writeln(Arrays.toString(arr));
        return null;
    }
}
