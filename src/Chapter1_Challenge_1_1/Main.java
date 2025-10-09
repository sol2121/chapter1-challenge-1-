

package Chapter1_Challenge_1_1;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // TODO code application logic here


        // Project Name: Chapter1_Challenge_1_1



        // Create Scanner to take input from the user
        Scanner scanner = new Scanner(System.in);

        // Ask the user to enter a positive integer
        System.out.print("Enter a positive integer: ");
        int number = scanner.nextInt();

        // Step 1: Extract the last digit using modulus
        int lastDigit = number % 10;

        // Step 2: Find the total number of digits
        String finalCode = getString(number, lastDigit);

        // Output the result
        System.out.println("The decrypted code is: " + finalCode);
    }

    private static String getString(int number, int lastDigit) {
        int numDigits = (int) Math.log10(number) + 1;

        // Step 3: Extract the first digit
        int firstDigit = (int)(number / Math.pow(10, numDigits - 1));

        // Step 4: Extract second digit
        int secondDigit = (int)(number / Math.pow(10, numDigits - 2)) % 10;

        // Step 5: Extract second-last digit
        int secondLastDigit = (number / 10) % 10;

        // Step 6: Calculate product of first and last digits
        int product = firstDigit * lastDigit;

        // Step 7: Calculate sum of second and second-last digits
        int sum = secondDigit + secondLastDigit;

        // Step 8: Concatenate product and sum to form final code

        return "" + product + sum;
    }
}

