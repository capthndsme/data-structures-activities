

public class BinaryRecursion {
    public static int FibonacciSequence(int i) {
        if (i == 0)
            return 0;
        else if (i == 1)
            return 1;
        else
            return FibonacciSequence(i-1) + FibonacciSequence(i-2);

    }
    public static void main(String[] args) {
        System.out.println(FibonacciSequence(10));
    }
}