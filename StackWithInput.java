import java.util.Scanner;
import StackController;
public class StackWithInput {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter stack desired size: ");
        int stackSize = sc.nextInt();
        StackController stackController = new StackController(stackSize);
        while (true) {
            System.out.println("\nStack Storage");
            System.out.println("What you want to do? [Push] [Pop] [Peek] [Display] [Quit / Exit]\n");
            String whatToDo = sc.nextLine();
            if (whatToDo.toUpperCase().startsWith("PU")) {
                System.out.println("Enter data to be entered:");
                String input = sc.nextLine();
                stackController.push(input);
            } 
            else if (whatToDo.toUpperCase().startsWith("PO")) {
                stackController.pop();
            }
            else if (whatToDo.toUpperCase().startsWith("PE")) {
                stackController.peek();
            }
            else if (whatToDo.toUpperCase().startsWith("S")) {
                stackController.getItems();
            }
            else if (whatToDo.toUpperCase().startsWith("E") || whatToDo.toUpperCase().startsWith("Q")) {
                System.out.println("GOODBYE.");
                System.exit(0);
            }
            else {
                System.out.println("Unknown option.");
            }
        }
    }
}

