public class controlFlowExercises {
    public static void main(String[] args) {
         /*       int i = 5;
        while(i <= 15){
            System.out.println(i);
            ++i;  
        } */

 //  1.b.3. Create a do-while loop that starts at 2, and displays the number squared on each line while the number is less than 1,000,000.

      long i = 2;
        do {
            System.out.println(i);
            i *= i;
        } while(i <= 1000000);

        for(i = 5; i <=15; i++){
            System.out.println(i);
        }

        for(i = 2; i <= 1000000; i *= i){
            System.out.println(i);
        }

        for(i = 0; i <=100; i++){
            if(i % 15 == 0){
                System.out.println("Fizz Buzz");
            }else if(i % 3 == 0){
                System.out.println("Fizz");
            }else if(i % 5 == 0){
                System.out.println("Buzz");
            }
        }
    }
}
