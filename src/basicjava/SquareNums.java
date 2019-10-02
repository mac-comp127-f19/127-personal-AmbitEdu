package basicjava;

import java.util.Scanner;

public class SquareNums {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int input = -1;
        while (Math.sqrt(input) % 4 != 0) {
            System.out.println("Enter an integer: ");
            input = in.nextInt();
            System.out.println(Math.sqrt(input));
        }
    }
}
