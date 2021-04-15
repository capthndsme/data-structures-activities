import java.util.Scanner;

public class Recursion {
    
    public static int factorial(int n) {
        if (n==0) return 1;
        else return n * factorial(n-1);
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to compute the factorial: ");
        int input = sc.nextInt();
        System.out.println("The factorial of " + input + " is " + factorial(input));
    }
}