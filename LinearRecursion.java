public class LinearRecursion {
    public static int toZero(int n) {
        if (n != 0) {
            System.out.println("N value: " + n);
            n = n - 1;

            return toZero(n);
        } else {
            System.out.println("Reached Zero N value: " + n);
            return n;
        }
    }
    public static void main(String[] args) {
        toZero(10);
    }
}