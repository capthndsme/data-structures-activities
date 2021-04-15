import java.util.LinkedList;
import java.util.Scanner;

public class LinkedListInput {
    public static void displayContents(LinkedList<String> dataSet) {
        System.out.println("Database contents: ");
                System.out.println(dataSet);
    }
    public static boolean isValidNumber(String s) {
        try { 
            Integer.parseInt(s); 
        } catch(NumberFormatException e) { 
            return false; 
        } catch(NullPointerException e) {
            return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList<String> dataSet = new LinkedList<String>();

        // Populate our dataset with initial data.
        dataSet.add("Blue");
        dataSet.add("White");
        dataSet.add("Red");
        dataSet.add("Green");
        dataSet.add("Yellow");
        System.out.print("Current ");
        displayContents(dataSet);
        while (true) {
            System.out.println("\nWelcome to the Paint Database.");
            System.out.println("What you want to do? [Insert] [Delete] [Display] [Search] [Quit / Exit]\n");
            String whatToDo = sc.nextLine();
            if (whatToDo.toUpperCase().startsWith("I")) {
                // The insert subroutine.
                if (dataSet.size() >= 10) {
                    System.out.println("The database can only hold 10 maximum values.");
                }
                else {
                    System.out.println("Add new content to database");
                    String entry = sc.nextLine();
                    dataSet.add(entry);
                    System.out.println("Entry added to database: " + entry);
                }
            } 
            else if (whatToDo.toUpperCase().startsWith("DE")) {
                // The Delete subroutine.
                System.out.println("Delete an item from the Database. Case sensitive. Could be String or Index.");
                String deleter = sc.nextLine();
                if (isValidNumber(deleter)) {
                    dataSet.remove(Integer.parseInt(deleter));
                } else {
                    dataSet.remove(deleter);
                }
                
                System.out.print("Deleted. New ");
                displayContents(dataSet);
            }
            else if (whatToDo.toUpperCase().startsWith("DI")) {
                // The Display subroutine.
                displayContents(dataSet);
            }
            else if (whatToDo.toUpperCase().startsWith("D")) {
                System.out.println("Ambiguous command. [De]lete or [Di]splay");
            }
            else if (whatToDo.toUpperCase().startsWith("S")) {
                // The Search subroutine.
                System.out.println("Search an item from the Database. Case sensitive. Could be String or Index.");
                String queryString = sc.nextLine();
                if (isValidNumber(queryString)) {
                    System.out.println("Match found: " + dataSet.get(Integer.parseInt(queryString)));
                } else {
                    String matches = "";
                    System.out.println("Searching for: " + queryString) ;
                    for (int i = 0; i < dataSet.size(); i++) {
                        if (dataSet.get(i).toUpperCase().contains(queryString.toUpperCase())) {
                            matches = dataSet.get(i) + "\n" + matches;
                        }
                    }
                    if (matches.equals("")) {
                        System.out.println("No matches!");
                    } else {
                        System.out.println("Search results for " + queryString + ": ");
                        System.out.println(matches);
                    }
                }
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