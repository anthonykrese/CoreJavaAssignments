import java.util.InputMismatchException;
import java.util.Scanner;

public class InputNumber {

    //2. Input number from user and print to console
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter a number:");
            int num = scanner.nextInt();
            System.out.println("You entered " + num +".");
        }
        catch (InputMismatchException e) {
            System.out.println("That's not a valid number");
        }
        scanner.close();
    }
}
