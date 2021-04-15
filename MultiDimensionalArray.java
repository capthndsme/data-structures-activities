public class MultiDimensionalArray {
    public static void main(String[] args) {
        String[][][] array = {
            {
                {"A", "B", "C"},
                {"D", "E", "F"}
            },
            {
                {"G", "H", "I"},
                {"J", "K", "L"}
            }
        };
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                for (int k = 0; k < array[i][j].length; k++) {
                    System.out.println("Array first dimension number" + i + " second dimension number" + j + " third dimenison number " + k + " content: " + array[i][j][k] );
                }
            }
        }
    }
}