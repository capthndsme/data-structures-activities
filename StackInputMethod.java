import java.util.Scanner;
import java.util.Stack;
public class StackInputMethod {
    Scanner sc = new Scanner (System.in);
    static Stack<String> stackOfTeams = new Stack<>();
    public static void stackPush (String teamPush){
        stackOfTeams.push(teamPush);
        System.out.println(teamPush+" is added.");
    }
    public static void stackPop (){
        String teamPop = stackOfTeams.pop();
        System.out.println("Top of card is: "+teamPop);
        System.out.println(stackOfTeams);
        System.out.println(teamPop+" is deleted.");
    }
    public static void stackPeek (){
        if (stackOfteams.isEmpty()) {
            System.out.println("Cannot peek into an empty stack");
        } else {
            String teamPeek = stackOfTeams.peek();
            System.out.println(teamPeek+" is at the top.");
        }

    }

    public static void main (String [] args){
        Scanner sc = new Scanner (System.in);

        while (true){
        System.out.println("What do you want to do? Pick a number.  ");
        System.out.println("1. Insert (PUSH)");
        System.out.println("2. Remove (POP)");
        System.out.println("3. Display (PEEK)");
        System.out.println("4. QUIT");
        System.out.println("---------------------------");
        System.out.println("Enter number: ");
        int n = sc.nextInt();

        if (n==1){
            System.out.println("Enter new element: ");
            String teamPush = sc.next();
            stackPush(teamPush);
        } else if (n==2) {
            stackPop();
        } else if (n==3){
            stackPeek();
        } else if (n==4) {
           System.out.println("Goodbye.");
        } else {
            System.out.println("Invalid Input");
        }

        }
    }
}