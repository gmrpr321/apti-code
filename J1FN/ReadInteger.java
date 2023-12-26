package J1FN;
import java.util.Scanner;
public class ReadInteger {
    public static void main(String[] args) {
        // Create Scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter an integer
        System.out.print("Enter an integer: ");

        // Read the entered integer
        int enteredInteger = scanner.nextInt();

        // Display the entered integer
        System.out.println("Entered integer: " + enteredInteger);

        // Close the Scanner
        scanner.close();
    }
}
