import java.util.Random;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {

        Random random = new Random();
        int number = random.nextInt(1,10);

        System.out.println("Solution 1");
        System.out.println(factorial(number));
        System.out.println("\n");
        System.out.println("Solution 2");
        System.out.println(factorial2(number));
        System.out.println("\n");
        System.out.println("Solution 3");
        System.out.println(factorial3(number));
    }
    //Method 1
    public static int factorial(int number) {
        int result = 1;
        for (int i = 1; i <= number; i++) {
            result = result * i; // znajdowanie silni liczby za pomocą pętli
        }
        return result;
    }
    //Method 2
    public static int factorial2(int number){
        if(number<2) return 1;
        return number * factorial(number-1);
    }
    //Method 3
    public static int factorial3(int number) { // znajdowanie silni liczby za pomocą Stream
        if (number <= 1) {
            return 1;
        }
        else {
            return IntStream.rangeClosed(2, number).reduce((x, y) -> x * y).getAsInt();
        }
    }



}





