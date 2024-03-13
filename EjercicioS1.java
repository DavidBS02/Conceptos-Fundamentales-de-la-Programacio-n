// Import the Scanner class to read the input
import java.util.Scanner;

public class EjercicioS1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Ask the user to enter a number
        System.out.print("Number: ");
        int number = sc.nextInt();

        // Convert the number to binary
        String binary = Integer.toBinaryString(number);

        // Get the last digit of the binary number
        int lastDigit = binary.charAt(binary.length() - 1) - '0';

        // Show the result
        System.out.println(lastDigit == 0 ? "even" : "odd");
    }
}
