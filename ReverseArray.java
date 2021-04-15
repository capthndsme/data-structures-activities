public class ReverseArray {
    public static void main(String[] args ) {
        int [] arrList = {3,5,2,10,15,64};
        reverse(arrList, arrList.length);
    }
    public static void reverse(int[] list, int length) {
        if (length == 0) {
            System.out.println("Stop Recursion");

        } else {
            System.out.println(list[length - 1]);
            reverse(list, length - 1);
        }
    }
}