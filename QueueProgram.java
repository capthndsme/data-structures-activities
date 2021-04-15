import java.util.LinkedList;
import java.util.Scanner;
import QueueController;

public class QueueProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter queue desired length: ");
        int stackSize = sc.nextInt();
        QueueController queueController = new QueueController(stackSize);
        System.out.println();
        while (true) {
            System.out.println("\nThe queue");
            System.out.println("What you want to do? [Peek] [Poll] [Offer] [Display] [Clear Queue] [Quit / Exit]\n");
            String whatToDo = sc.nextLine();
            if (whatToDo.toUpperCase().startsWith("O")) {
                System.out.println("Enter data to be entered:");
                String input = sc.nextLine();
                if (queueController.offer(input)) {
                    System.out.println("Added to queue: " + input);
                    System.out.println("Queue size: " + queueController.getQueueSize() + " / " + queueController.getMaxQueueSize());

                } else {
                    System.out.println("Max size exceeded!");
                    System.out.println("Queue size: " + queueController.getQueueSize() + " / " + queueController.getMaxQueueSize());
                }
            } 
            else if (whatToDo.toUpperCase().startsWith("PO")) {
                System.out.println(queueController.poll());
            }
            else if (whatToDo.toUpperCase().startsWith("PE")) {
                System.out.println(queueController.peek());
            }
            else if (whatToDo.toUpperCase().startsWith("D")) {
                System.out.println(queueController.getItems());
            }
            else if (whatToDo.toUpperCase().startsWith("C")) {
                queueController.clear();
                System.out.println("Queue cleared.");
            }
            else if (whatToDo.toUpperCase().startsWith("E") || whatToDo.toUpperCase().startsWith("Q")) {
                System.out.println("GOODBYE.");
                System.exit(0); // Exit process
            }
            else {
                System.out.println("Unknown option.");
            }
        }
    }
}

