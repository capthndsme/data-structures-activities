public class IsOddOrEven {
    public static Boolean even(int i)
    {    
        if(i == 0)
            return true;
        else
            return odd(Math.abs(i)-1);
    }

    public static Boolean odd(int i)
    {
        if(i == 0)
            return false;
        else
            return even(Math.abs(i)-1);
    }
    public static void main(String[] args) {
        System.out.println("IsOdd 5? " + odd(5));
        System.out.println("IsEven 6? " + even(6));
    }
}
