import java.util.*;
public class LinkedListSample { 
    public static void main(String[] args) {
        LinkedList lnklist = new LinkedList();
        
        // Insert objects to LinkedList
        lnklist.add("Joyce");
        lnklist.add("Maria");
        lnklist.add("Charlotte");
        lnklist.add("Samson");
        lnklist.add(69);
        lnklist.add(0.69);
        
        // Replace index 1 "Maria" with "Lord"
        lnklist.add(1, "lord");

        // Show Link List
        System.out.println(lnklist);
        
        // Search the LinkedList for the user input
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter search term");
        if (lnklist.contains(sc.nextLine())) {
            System.out.println("Found!\n");
        } else {
            System.out.println("Not Existed!\n");
        }

        // Show the size of the array.
        System.out.println("Size of Array is: " + lnklist.size());

        // LinkedList remove demonstration
        lnklist.remove("Samson");
        System.out.println(lnklist);

        // Remove Index 2 from LL 
        lnklist.remove(2);
        System.out.println(lnklist);

        // Remove first element, index 0
        lnklist.removeFirst();
        System.out.println(lnklist);

        // Remove last element, 
        lnklist.removeLast();
        System.out.println(lnklist);
    }
}