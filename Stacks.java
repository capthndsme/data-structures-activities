import java.util.Stack;
import java.util.Scanner;
public class Stacks {
    public static void push(Stack stk, String item) {
        stk.push(item);
        System.out.println("After push:");
        System.out.println(stk);
    }
    public static void pop(Stack stk) {
        System.out.println("Item removed: " + stk.pop());
        System.out.println("After pop:");
        System.out.println(stk);
    }
    public static void peek(Stack stk) {
        System.out.println("Top of stack: " + stk.peek());
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<String> stack = new Stack();
        System.out.println("Add data to Stack 1");
        stack.add(sc.nextLine());
        System.out.println("Add data to Stack 2");
        stack.add(sc.nextLine());
        System.out.println("Add data to Stack 3");
        stack.add(sc.nextLine());
        System.out.println("Add data to Stack 4");
        stack.add(sc.nextLine());

        System.out.println("Push object to Stack");
        push(stack, sc.nextLine());
        pop(stack);
        peek(stack);

    }
}