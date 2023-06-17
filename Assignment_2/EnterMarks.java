import java.util.Scanner;
public class EnterMarks{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many classes are you taking?");
        int numClasses = sc.nextInt();
        int[] marks = new int [numClasses];
        int i = 0;
        while (i < numClasses) {
            System.out.println("Enter Your marks:");
            marks[i] = sc.nextInt();
            i++;
        }
        System.out.println("Your marks were:");
        i = 0;
        while (i < numClasses) {
            System.out.println(marks[i]);
            i++;
        }

    }
}
