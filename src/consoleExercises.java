import java.util.Scanner;

public class consoleExercises {
    public static void main(String[] args) {
        double pi = 3.14159;
        System.out.printf("The value of pi is approximately %f\n", pi);

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int myNumber = scanner.nextInt();
        System.out.println("You have entered " + myNumber);
    }
}
