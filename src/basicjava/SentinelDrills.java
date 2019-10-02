package basicjava;

import java.util.Scanner;

public class SentinelDrills {
    public static boolean isOdd(int num) {
        if (num % 2 == 0) { return false; } else { return true; }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //repeatUntilNegative(in);
        divideByTwo(in);
    }

    private static void divideByTwo(Scanner in) {
        System.out.println("Enter an integer: ");
        int num = in.nextInt();
        int divided = num;
        int count = 0;
        while(divided > 1) {
            divided /= 2;
            count++;
        }
        System.out.println("The number " + num + " can be divided " + count + " times.");
    }


    public static void repeatUntilNegative(Scanner in) {
        System.out.println("Enter an integer: ");
        int num = in.nextInt();
        if (isOdd(num)) {
            System.out.println("" + num + " is odd.");
        } else {
            System.out.println("" + num + " is even.");
        }
        if(!(num < 0)) { repeatUntilNegative(in); }
    }
}
