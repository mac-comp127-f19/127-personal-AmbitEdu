package basicjava;

import java.util.Scanner;

public class OddEven {
    public static boolean isOdd(int num) {
        if (num % 2 == 0) { return false; } else { return true; }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        int num = in.nextInt();
        if (isOdd(num)) {
            System.out.println("" + num + " is odd.");
        } else {
            System.out.println("" + num + " is even.");
        }
    }

    public static void wowOdd(int num) {
        if (isOdd(num)) System.out.println("WOw, that's odd!");
    }
}
