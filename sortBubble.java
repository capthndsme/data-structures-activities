public class sortBubble{ 
    public static void sort(int[] j) {
        Boolean isSorted = false;
        int temp;
        while(!isSorted) {
            isSorted = true;
            for (int i = 0; i < j.length - 1; i++) {
                if (j[i] > j[i+1]) {
                    temp = j[i];
                    j[i] = j[i+1];
                    j[i+1] = temp;
                    isSorted = false;
                }
            }
        }
    }
    public static void main(String[] args) {
        int[] unsorted = {11,6,2,7,1,3,0};
        System.out.println("UNSORTED: ");
        for (int i = 0; i < unsorted.length; i++) {
            System.out.println(unsorted[i]);
        }
        sort(unsorted);
        System.out.println("SORTED: ");
        for (int i = 0; i < unsorted.length; i++) {
            System.out.println(unsorted[i]);
        }
    }
}