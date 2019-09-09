package basicjava;

import java.util.Scanner;

public class Hypotenuse {
    public static double calculateHypotenuse(double length1, double length2) {
        return Math.sqrt((length1 * length1) + (length2 * length2));
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter side length 1:");
        double l1 = in.nextDouble();
        System.out.println("Enter side length 2:");
        double l2 = in.nextDouble();
        System.out.println("The length of the hypotenuse is: " + Hypotenuse.calculateHypotenuse(l1, l2));
    }
}
