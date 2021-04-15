 import java.util.Stack;
import java.util.Scanner;
public class FruitBasket {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Catch and eat any of these fruits: ('apple', 'orange', 'mango', 'guava')");
        System.out.println("How many fruits would you like to catch? ");
        int HowManyFruits = 0;
        Boolean noAnswer = true;
        FruitController fruitController = new FruitController(); 
        // Request number
        while (noAnswer) {
            HowManyFruits = sc.nextInt();
            if (HowManyFruits < 8) { 
                noAnswer = false;
            } else {
                System.out.println("Please enter a number not exceeding 7.");
            }
        }
        System.out.print("Choose a fruit to catch. Press A, O, M, or G.");
        for (int i = 1; i <= HowManyFruits; i++) {
            System.out.printf("\nFruit %d of %d: ", i, HowManyFruits);
            String input = sc.nextLine();
            if (input.equalsIgnoreCase("A")) {
                fruitController.catchFruits("apple");
            } else if (input.equalsIgnoreCase("O")) {
                fruitController.catchFruits("orange");
            } else if (input.equalsIgnoreCase("M")) {
                fruitController.catchFruits("mango");
            } else if (input.equalsIgnoreCase("G")) {
                fruitController.catchFruits("guava");
            } else {
                System.out.println("Invalid option.");
                i--; // Decrement
            }
        }
        System.out.println("Your basket now has: " + fruitController.getContents());
        while (true) {
            System.out.println("Press E to eat a fruit. ");
            String in = sc.nextLine();

            if (in.equalsIgnoreCase("E")) {
                fruitController.eatFruit();
                if (fruitController.isEmpty()) {
                    System.out.println("No more fruits");
                    System.exit(0);
                }
                System.out.println("Fruit(s) in the basket: " + fruitController.getContents());
                
            }
        }
    }
}
class FruitController {
    private Stack<String> mStack;
    public FruitController() {
        mStack = new Stack<String>();
    } 
    public void catchFruits(String fruitName) {
        mStack.add(fruitName);
    }
    public int getFruitSize() {
        return mStack.size();
    }
    public void eatFruit() {
        mStack.pop();    
    }
    public Object getContents() {
        return mStack;
    }
    public Boolean isEmpty() {
        return mStack.isEmpty();
    }
}
