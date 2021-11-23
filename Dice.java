/*
* The Dice program randomly chooses a number
* from 1 to 6, and tells the user to guess the number.
*
* @author Matthew Sanii
* @version 1.0
* @since 2021-23-11
*/

import java.util.Scanner;
import java.util.Random;

final class Dice {
    /**
    * Variables used for maximum and minimum values
    * Of the dice.
    */
    static final int MAX = 6;
    /**
    * Variable 2
    */
    static final int MIN = 1;
    /**
    * Prevent instantiation.
    * Throw an exception IllegalStateException.
    * if this ever is called
    *
    * @throws IllegalStateException
    *
    */

    private Dice() {
        throw new IllegalStateException("Cannot be instantiated");
    }

    /**
    * The starting main() function.
    *
    * @param args No args will be used
    */

    public static void main(final String[] args) {
        int tries = 0;
        int guess = 0;
        int random_int = (int)Math.floor(Math.random()*(MAX-MIN+1)+MIN);
        System.out.println(random_int);
        Scanner attempt = new Scanner(System.in);
        while (true) {
            System.out.print("\nGuess a number between 1 and 6: ");
            try {
                guess = attempt.nextInt();
            }
            catch (java.util.InputMismatchException errorCode) {
                System.out.print("That isn't a viable option.");
                break;
            }
            tries = tries + 1;
            if (guess > random_int) {
                System.out.print("Too high, try again.");
            }
            else if (guess < random_int){
                System.out.print("Too low, try again.");
            }
            else {
                System.out.print("You got it right in " + tries + " guesses.");
                break;
            }
            }
        System.out.print("\nDone.");
}
}
