public class Lesson3 {
    String snum;
    ConsoleWriter consoleWriter = new ConsoleWriter();
//point 1

    int reverse(int num) {
        snum = String.valueOf(num);
        StringBuilder rev = new StringBuilder(snum);
        rev.reverse();
        num = Integer.parseInt(String.valueOf(rev));
        consoleWriter.writeln(num);
        return 0;
    }

//    point 2

    int min(int num) {
        snum = String.valueOf(num);
        for (int i = 0; i < 10; i++) {
            if (snum.indexOf("" + i) > -1) {
                consoleWriter.writeln(i);
                break;
            }
        }
        return 0;
    }
    int max(int num){
        snum = String.valueOf(num);
        for (int i = 9; i > -1; i--) {
            if (snum.indexOf("" + i) > -1) {
                consoleWriter.writeln(i);
                break;
            }
        }
        return 0;
    }

 //point 3
    void duplicate(int num) {
        snum = String.valueOf(num);
        boolean duplicate = true;
        for (int i = 0; i < 10; i++) {
            if (snum.indexOf("" + i) != snum.lastIndexOf("" + i)) {
                duplicate = false;
                break;
            }
        }
        consoleWriter.writeln(String.valueOf(duplicate));
    }

// point 4
    int descending(int num) {
        String match = "0123456789";
        String result = String.valueOf(num);
        for (int l = match.length(); l > 2; l--) {
            for (int i = 0; i <= match.length() - l; i++) {
                String found = match.substring(i, i + l);
                if (result.contains(found)) {
                    StringBuilder reverse = new StringBuilder(found);
                    reverse.reverse();
                    consoleWriter.write(Integer.parseInt(String.valueOf(reverse)) + " ");
                }
            }
        }
        consoleWriter.writeln(" ");
        return 0;
    }
}
