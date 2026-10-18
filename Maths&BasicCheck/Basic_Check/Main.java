import java.util.*;

class Main {

    public static String evenOrodd(int x) {
        if (x % 2 == 0) {
            return "Even";
        } else {
            return "Odd";
        }
    }

    public static String Signcheck(int x) {
        if (x == 0) {
            return "Zero";
        } else if (x > 0) {
            return "Positive";
        } else {
            return "Negative";
        }
    }

    public static boolean isLeapYear(int x) {
        if (x % 400 == 0 && x % 100 != 0 || x % 400 == 0) {
            return true;
        }
        return false;
    }

    public static void swap(int x, int y) {
        int temp = x;
        x = y;
        y = temp;

        System.out.println("x = " + x);
        System.out.println("y = " + y);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println(evenOrodd(12));
        System.out.println(Signcheck(23));
        System.out.println(isLeapYear(2001));
        swap(23, 21);
    }
}