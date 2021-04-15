public class TailRecursion {
    public static void PrintToHundred(int baseNumber) {
        if (baseNumber <= 100) {
            baseNumber = baseNumber + 10;
            System.out.println("Current Number: " + baseNumber);
            PrintToHundred(baseNumber);
        }
    }
    public static void main(String[] args) {
        PrintToHundred(-100);
    }
}