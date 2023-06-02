import java.util.InputMismatchException;
import java.util.Scanner;

public class AddNumbers {

    //3. Take two numbers from user then add it and print it
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter a number: ");
            int num1 = scanner.nextInt();
            scanner.nextLine();

            System.out.print("Enter another number: ");
            int num2 = scanner.nextInt();

            int sum = num1 + num2;
            System.out.println("The sum of " + num1 + " and " + num2 + " is " + sum + ".");
        }
        catch (InputMismatchException e) {
            System.out.println("That's not a valid number");
        }

        scanner.close();
    }

}
