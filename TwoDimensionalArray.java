public class TwoDimensionalArray {
    public static void main(String[] args) {
        String[][] array = {
            {"Hello", "World"},
            {"Second", "Row!"}
        };
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.println("Array row " + i + " column" + j + " content: " + array[i][j]);
            }
        }
    }
}