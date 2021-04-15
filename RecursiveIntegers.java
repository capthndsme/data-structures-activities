public class RecursiveIntegers {
    public static void oddInts(int f, int total) {
        f = f + 1;
        if (f <= 10) {
            if (f % 2 == 1) {
                System.out.print(f + "\t");
                total = total + f;
            }
            oddInts(f, total);
            if (f == 10) {
                System.out.print("=\t" + total);
            }
        }  
        
    }
    public static void main(String[] args) {
        int start = 0;
        int total = 0;
        oddInts(start, total);
    }
}