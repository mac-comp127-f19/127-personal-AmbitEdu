/***
 * A class for manipulating strings so that they are properly snakey.
 *
 * @author Abigail Marsh, Fall 2019
 */

package activityStarterCode.stringPractice;

import java.util.Scanner;

public class MakeSnake {

    /***
     * A method that modifiesss ssstringsss ssso they are sssibilant
     * TODO: Implement this method
     *
     * @param input Any string
     * @return The sssame ssstring, but with more hissing
     */
    public static String makeSnake(String input) {
        String temp = new String("");
        for (int x = 0; x < input.length(); x++) {
            if (input.charAt(x) == 'S')
            {
                temp = temp + "SSS";
            } else if (input.charAt(x) == 's')
            {
                temp = temp + "sss";
            } else
                {
                    temp = temp + input.charAt(x);
                }
        }
        return temp;
    }

    /***
     * Run this program to tessst your method on different input ssstringsss
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter sssomething you would like to sssnakeify: ");

        String input = scan.nextLine();

        System.out.println(makeSnake(input));
    }
}
