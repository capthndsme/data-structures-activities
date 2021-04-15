public class Recurse {
    public static int odd (int n) {
        int t = 0;
        for (int i = 0; i <= n ; i++) {
            if (i % 2 !=0) {
                t = t + i;
                System.out.println(i);
            }
        }
        return t;
    }
    public static void main(String[] args) {
        int n = 10;
        int oddnum = odd(n);
        System.out.println(oddnum);
    }
}