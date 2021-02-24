import java.util.Scanner;

public class helloWorld {
    
    public static void main(String[] args) {
        System.out.println("I once said \"I love cats!\"");
        int myFavoriteNumber = 20;
        System.out.println(myFavoriteNumber);
        String myString = "I love Cats!";
        System.out.println(myString);
        double myNumber = 3.14;
        System.out.println(myNumber);
        int x = 5;
        System.out.println(++x);
        System.out.println(x);

        String theNumberThree = "three";
        Object o = theNumberThree;
        System.out.println(o);

        String myName = "Johnny";
        System.out.printf("Hello there, %s. Nice to see you!\n",myName);

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Something: ");
        String userInput = scanner.nextLine();

        System.out.println("You entered \"" + userInput + "\" ");
    
        scanner.close();
    }
}