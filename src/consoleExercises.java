import java.util.Scanner;

public class consoleExercises {
    public static void main(String[] args) {
        double pi = 3.14159;
        System.out.printf("The value of pi is approximately %f\n", pi);

        Scanner scanner = new Scanner(System.in);
    /*    System.out.print("Enter a number: ");
        int myNumber = scanner.nextInt();
        System.out.println("You have entered " + myNumber); */

        System.out.println("Please enter your first word: ");
        String myFirstWord = scanner.nextLine();
        System.out.println("Please enter your second word: ");
        String mySecondWord = scanner.nextLine();
        System.out.println("Please enter your third word: ");
        String myThirdWord = scanner.nextLine();

        System.out.println("Your 3 words are " + myFirstWord + ", " + mySecondWord + ", and " + myThirdWord);

        System.out.println("Please enter a sentence: ");
        String mySentence = scanner.nextLine();
        System.out.println(mySentence);

        scanner.close();
    }
}
