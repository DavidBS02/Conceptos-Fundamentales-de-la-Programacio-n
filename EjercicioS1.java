// Import the Scanner class to read the input
import java.util.Scanner;

public class EjercicioS1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Ask the user to enter a number
        System.out.print("Number: ");
        int num = sc.nextInt();

        // Calculate the remainder of division by 2
        int remain = num % 2;

        // Show the result
        if (remain == 0) {
            System.out.println("even");
        } else {
            System.out.println("odd");
        }
    }
}
