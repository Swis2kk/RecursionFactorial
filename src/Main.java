import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Enter your number here: ");

        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        System.out.println("The answer is: " + numFactorial(n));
    }

    public static long numFactorial (int n) {
        if (n<=1) {  // because 0! and 1! is always 1;
            return 1;
        }
        else {
            return n * numFactorial(n -1);
        }
    }
}
