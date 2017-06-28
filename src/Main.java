import java.util.Scanner;

public class Main {

    // Method below cubes the digits of the user input integer in reverse order by using modolus.
    // It then adds the sum of each cubed digit.
    static int cubed(int sum, int remainder) {
        sum = sum + (remainder * remainder * remainder);
        return sum;
    }

    public static void main(String[] args) throws java.lang.Exception {
        int total = 0;
        int userInput = 0;
        // Copy of userInput that will be used to perform tasks.
        int c_userInput;


        // Gets user input
        Scanner scnr = new Scanner(System.in);
        System.out.println("Please enter a whole number: ");

        // User input validation. If the user enters anything except a while number,
        // the invalid error will display.
        while (!scnr.hasNextInt()) {
            System.out.println("Invalid Entry. Please enter whole numbers only.");

            // Runs the program again, allowing user to input additional integers to be tested.
            main(args);
            break;
        }

        // Takes the user input and assigns it to "userInput"
        userInput = scnr.nextInt();

        // Copies userInput into c_userInput
        // Loops until the c_userInput equals "0"
        c_userInput = userInput;

        while (c_userInput != 0) {
            // Calls cubed method and stores the returned value into total.
            // The second parameter "remainder" is obtained by using modulus 10.
            // Which gives us a single digit from the user input.
            total = cubed(total, c_userInput % 10);

            // Takes away the last digit in the c_userInput and stores the
            // remaining digits in c_userInput.
            c_userInput = c_userInput / 10;
        }

        // If the value stored in total is the same as userInput, print "True",
        // else print "False".
        if (total == userInput) {
            System.out.println("True");
            System.out.println("The sum of the cubed digits in integer " + userInput +
                    ", equals to the integer itself.");
            // Runs the program again, allowing user to input additional integers to be tested.
            main(args);
        } else {
            System.out.println("False");
            System.out.println("The sum of the cubed digits in integer " + userInput +
                    ", does not equal to the integer itself.");
            // Runs the program again, allowing user to input additional integers to be tested.
            main(args);
        }
    }
}