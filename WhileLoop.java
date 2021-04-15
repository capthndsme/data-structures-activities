public class WhileLoop {
    public static void main(String[] args) {
        Boolean condition = true;
        int number = 5;
        while (condition) {
            System.out.println(number);
            number--;
            if (number == 0) {
                condition = false;
            }
        }
    }
}
